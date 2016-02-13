#ifndef SHELL_H
#define SHELL_H

#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include <unistd.h>
#include <sys/stat.h>
#include <fcntl.h>
#include <sys/types.h>


struct tokinized_cmds {
        char *name;
        int size;
        char *str[10];
};

void prompt_char();
void intro();
int process_one_word_cmd(char *commandLine, char *commandInput);
int tokenize_cmd(char *commandLine, struct tokinized_cmds *command);
char * find_dir(char **, char **);
int get_path(char **);
int exec_fin_file_cmd(char *, char **, char *);
int exec_fout(char *, char **, char *);
void perform_piped_cmd(char **, char  **, char *, char *);

static char inp = '\0';
static int buf_chars = 0;
static char *current_path[64];
static char cmd_line[1024];

char * find_dir(char **str_arr, char **look_up_dir) {
    char *res;
    char path_name[96];
    if (*str_arr[0] == '/') {
        return str_arr[0];
    } else if (*str_arr[0] == '.') {
        if (*++str_arr[0] == '.') {
            if (getcwd(path_name, sizeof (path_name)) == NULL) {
                perror("getcwd(): error\n");
            } else {
                *--str_arr[0];
                asprintf(&res, "%s%s%s", path_name, "/", str_arr[0]);
            }
            return res;
        }
        *--str_arr[0];
        if (*++str_arr[0] == '/') {
            if (getcwd(path_name, sizeof (path_name)) == NULL)
                perror("getcwd(): error\n");
            else {
                asprintf(&res, "%s%s", path_name, str_arr[0]);
            }
            return res;
        }
    }

    int i;
    for (i = 0; i < 64; ++i) {
        if (look_up_dir[i] != NULL) {
            asprintf(&res, "%s%s%s", look_up_dir[i], "/", str_arr[0]);
            if (access(res, X_OK) == 0) {
                return res;
            }
        } else continue;
    }

    fprintf(stderr, "%s: command not found\n", str_arr[0]);
    return NULL;
}

int get_path(char* dirs[]) {
    int error = 0;
    char* current_env;
    char* pth;
    int i;

    for (i = 0; i < 513; i++)
        dirs[i] = NULL;
    current_env = (char*) getenv("PATH");
    pth = (char*) malloc(strlen(current_env) + 1);
    strcpy(pth, current_env);

    char* pch;
    pch = strtok(pth, ":");

    for (int j = 0; pch != NULL; ++j) {
        pch = strtok(NULL, ":");
        dirs[j] = pch;
    }


    if (error == 1) {
        printf("Directories in PATH variable\n");
        for (i = 0; i < 64; ++i)
            if (dirs[i] != '\0') {
                printf("Directory[%d]: %s\n", i, dirs[i]);
            }
    }
}

int tokenize_cmd(char * cmd_ln, struct tokinized_cmds * command) {
    int err = 0;

    char * pch;
    pch = strtok(cmd_ln, " ");
    int i = 0;
    while (pch != NULL) {
        command->str[i] = pch;
        pch = strtok(NULL, " ");
        i++;
    }
    command->size = i;
    command->str[i++] = NULL;

    if (err == 1) {
        printf("Stub: parseCommand(char, struct);\n");
        printf("Array size: %i\n", sizeof (*command->str));
        int j;
        for (j = 0; j < i; j++) {
            printf("command->argv[%i] = %s\n", j, command->str[j]);
        }
        printf("\ncommand->argc = %i\n", command->size);

        if (command->str[0] != NULL) {
            char **p;
            for (p = &command->str[1]; *p != NULL; p++) {
                printf("%s\n", *p);
            }
        }
    }
    return 0;
}

int process_one_word_cmd(char * buffer, char * commandInput) {
    int debug = 0;
    buf_chars = 0;


    while ((*commandInput != '\n') && (buf_chars < 1024)) {
        buffer[buf_chars++] = *commandInput;
        *commandInput = getchar();
    }
    buffer[buf_chars] = '\0';

    if (debug) {
        printf("Stub: readCommand(char *)\n");

        int i;
        for (i = 0; i < buf_chars; i++) {
            printf("buffer[%i] = %c\n", i, buffer[i]);
        }
        printf("\nlength: %i\n", buf_chars - 1);
        printf("\n1. buffer %s\n", buffer);
        printf("2. buffer[%i] = %c\n", buf_chars - 2, buffer[buf_chars - 2]);
        if (buffer[buf_chars - 1] == '\n') {
            printf("3. buffer[%i] = '\\n'\n", buf_chars - 1);
        }
        if (buffer[buf_chars] == '\0') {
            printf("4. buffer[%i] = '\\0'\n", buf_chars);
        }
    }
    return 0;
}

int exec_fin_file_cmd(char * passed_cmd_name, char * str_arr[], char * filename) {
    int file_dr_pip[2];

    if (pipe(file_dr_pip) == 1) {
        perror("pipe");
        exit(127);
    }

    int fork_stat = fork();

    if (fork_stat == -1) {
        perror("fork()");
        exit(127);
    } else if (fork_stat == 0) {
        close(file_dr_pip[0]);
        dup2(file_dr_pip[1], 1);
        close(file_dr_pip[1]);
        FILE * p_fin;
        char my_str;

        p_fin = fopen(filename, "r");
        if (p_fin == NULL) perror("Error opening file");
        else {

            while ((my_str = fgetc(p_fin)) != EOF) {
                putchar(my_str);
            }
            fclose(p_fin);
        }
        exit(EXIT_SUCCESS);
    } else {
        close(file_dr_pip[1]);
        dup2(file_dr_pip[0], 0);
        close(file_dr_pip[0]);

        execve(passed_cmd_name, str_arr, 0);
        perror(passed_cmd_name);
        exit(125);
    }
    return 0;
}

int exec_fout(char * passed_cmd_nm, char * str_arr[], char * fin_name) {
    int define = dup(1);

    int fin = open(fin_name, O_WRONLY | O_CREAT | O_TRUNC, S_IRWXU | S_IRGRP | S_IROTH);
    if (fin < 0) {
        return 1;
    }

    if (dup2(fin, 1) < 0) {
        return 1;
    }

    int pid_stat = fork();
    if (pid_stat == 0) {
        close(fin);
        close(define);
        execve(passed_cmd_nm, str_arr, 0);
        return 0;
    }

    dup2(define, 1);
    close(fin);
    close(define);
    wait(NULL);
    close(fin);
    return 0;
}

void perform_piped_cmd(char *argvA[], char *argvB[], char * nameA, char * nameB) {
    int pipefd[2];

    if (pipe(pipefd)) {
        perror("pipe");
        exit(127);
    }

    int fork_stat = fork();

    if (fork_stat == -1) {
        perror("fork()");
        exit(127);
    } else if (fork_stat == 0) {
        close(pipefd[0]);
        dup2(pipefd[1], 1);
        close(pipefd[1]);
        execve(nameA, argvA, 0);
        exit(126);
    } else {
        close(pipefd[1]);
        dup2(pipefd[0], 0);
        close(pipefd[0]);
        execve(nameB, argvB, 0);
        perror(nameB);
        exit(125);
    }
}

struct tokinized_cmds cmd;

typedef struct copy_of_command {
    char str[513][1024];
    int size;
} copy_of_command;

typedef struct history {
    copy_of_command cmds[10];
    int size;
} history;


history h;

void insert_history() {
    if (h.size < 10) {
        ++h.size;
    }

    for (int i = h.size - 1; i >= 1; --i) {
        for (int j = 0; j < h.cmds[i - 1].size; ++j) {
            strcpy(h.cmds[i].str[j], h.cmds[i - 1].str[j]);
        }
        h.cmds[i].size = h.cmds[i - 1].size;
    }


    for (int i = 0; i < cmd.size; ++i) {
        strcpy(h.cmds[0].str[i], cmd.str[i]);
    }

    h.cmds[0].size = cmd.size;
}

volatile sig_atomic_t flag = 0;

void signal_handler(int sig) {
    if (sig == SIGINT) {
        flag = 1;
        printf("\n");
        for (int i = 0; i < h.size; ++i) {
            printf("%d: ", (i + 1));
            for (int j = 0; j < h.cmds[i].size; ++j) {
                printf("%s ", h.cmds[i].str[j]);
            }
            printf("\n");
        }
        printf("\n");
    }
}

int exec_systeml_commands() {
    int stat;
    pid_t child_pid;

    int child_pid_stat = fork();
    if (child_pid_stat < 0) {
        fprintf(stderr, "Child forking failed: \n");
        return 1;
    } else if (child_pid_stat == 0) {
        execve(cmd.name, cmd.str, 0); // execution of external commands
        printf("System command exited!!\n");
        return 1;
    } else if (child_pid_stat > 0) {
        do {
            child_pid = waitpid(child_pid_stat, &stat, WUNTRACED | WCONTINUED);
            if (child_pid == -1) {
                perror("waitpid");
                exit(EXIT_FAILURE);
            }

            if (WIFEXITED(stat)) {
                return 0;
            } else if (WIFSIGNALED(stat)) {
                printf("Killed... Signal: %d\n", WTERMSIG(stat));
            } else if (WIFSTOPPED(stat)) {
                printf("Suspended... Signal: %d\n", WSTOPSIG(stat));
            } else if (WIFCONTINUED(stat)) {
                printf("Continued...\n");
            }
        } while (!WIFEXITED(stat) && !WIFSIGNALED(stat)); // The do while is to make sure that the after executing system commands, no line is returned to the shell prompt arrow
        return 0;
    }
}

int analyze_pip_cmd(int pased_index) {
    char* str_A[5];
    char* str_B[5];
    char* cmd_A;
    char* cmd_B;

    int i;
    for (i = 0; i < pased_index; i++) {
        str_A[i] = cmd.str[i];
    }
    str_A[i] = NULL;
    cmd_A = find_dir(str_A, current_path);

    int j1;
    int j2 = 0;
    for (j1 = pased_index + 1; j1 < cmd.size; ++j1) {
        str_B[j2] = cmd.str[j1];
        j2++;
    }
    str_B[j2] = NULL;
    cmd_B = find_dir(str_B, current_path);


    fflush(stdout);

    int pid;
    int stat;

    pid_t temp = fork();

    if (temp == -1) {
        perror("fork");
    } else if (temp == 0) {
        perform_piped_cmd(str_A, str_B, cmd_A, cmd_B);
    } else {
        pid = wait(&stat);
        return 0;
    }
    return 1;
}

int fout_cmd(int passed_in_index) {
    char *cmd_name;
    char *str[5];

    int j;
    for (j = 0; j < passed_in_index; ++j) {
        str[j] = cmd.str[j];
    }

    str[j] = NULL;
    cmd_name = find_dir(str, current_path);
    return exec_fout(cmd_name, str, cmd.str[passed_in_index + 1]);
}

int fin_cmd(int i) {
    char *cmd_name;
    char *str[5];

    int j;
    for (j = 0; j < i; ++j) {
        str[j] = cmd.str[j];
    }


    str[j] = NULL;
    cmd_name = find_dir(str, current_path);


    fflush(stdout);

    int pid;
    int stat;

    pid_t temp = fork();

    if (temp == -1) {
        perror("fork");
    } else if (temp == 0) {
        exec_fin_file_cmd(cmd_name, str, cmd.str[i + 1]);
    } else {
        pid = wait(&stat);
        return 0;
    }
    return 0;
}

int analyze_piped_cmds() {

    int pip_ln = 0;


    int fin = 0;
    int fout = 0;

    char *fin_name;
    char *fout_name;


    int i;
    for (i = 0; i < cmd.size; ++i) {
        if (strcmp(cmd.str[i], "<") == 0) { // file in command of pip
            return fin_cmd(i);
        } else if (strcmp(cmd.str[i], ">") == 0) { // file out command of pip
            return fout_cmd(i);
        } else if (strcmp(cmd.str[i], "|") == 0) { // normal pip
            return analyze_pip_cmd(i);
        }
    }
    return exec_systeml_commands();
}

void perform_commands() {
    if (strcmp("cd", cmd.str[0]) == 0) {
        if (cmd.str[1] == NULL) { // if going back home
            chdir(getenv("HOME"));
        } else {
            if (strcmp(cmd.str[1], "..") == 0) { // If going back to a previous folder
                if (chdir(cmd.str[1]) == -1) {
                    printf("%s: No such directory in the current path\n", cmd.str[1]);
                }
            } else if (cmd.size == 2) {
                if (chdir(cmd.str[1]) == -1) {
                    printf("%s: No such directory in the current path\n", cmd.str[1]);
                }
            } else { // if accessing folder within directories
                char check_dr_str[1024];
                strcpy(check_dr_str, "");
                for (int i = 1; i < cmd.size; ++i) { // check for folders with spaces
                    if (i < cmd.size - 1) {
                        strcat(check_dr_str, cmd.str[i]);
                        check_dr_str[strlen(check_dr_str) - 1] = '\0';
                        strcat(check_dr_str, " ");
                    } else {
                        strcat(check_dr_str, cmd.str[i]);
                    }
                }
                
                if (chdir(check_dr_str) == -1) {
                    printf("%s: No such directory in the current path\n", check_dr_str);
                }
            }
        }
    } else if (strcmp("clear", cmd.str[0]) == 0) {
        printf("\033[2J\033[1;1H");
    } else {
        cmd.name = find_dir(cmd.str, current_path);

        if (cmd.name == NULL) {
            printf("Error command!!\n");
        }

        analyze_piped_cmds();
    }
}

#endif