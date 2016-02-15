#include "shell.h"

int main(int argc, char* argv[]) {
    get_path(current_path); // get the starting path
    printf("\nCMPT 300 Project 2 - Shell With History\n\nMade by:\n - Faisal Al-Humaimidi\n - Peter Kvac\n\n");
    h.size = 0;
    int loop_flag = 1; // break flag
    while (loop_flag == 1) {
        is_background = false;
        signal(SIGINT, signal_handler);
        char printpath_cmd[1024];
        if (getcwd(printpath_cmd, sizeof (printpath_cmd)) != NULL) {
            printf("%s", getcwd(printpath_cmd, sizeof (printpath_cmd)));
        } else {
            perror("getcwd() of current directory error!!");
        }
        printf("> ");
        inp = getchar(); //determine if to exec just '\n' or entire cmd
        if (flag == 1) {
            flag = 0;
        } else if (inp != '\n') {
            process_one_word_cmd(cmd_line, &inp);

            if ((strcmp(cmd_line, "exit") == 0) || (strcmp(cmd_line, "quit") == 0)) {
                exit(EXIT_SUCCESS);
            } else if ((strcmp(cmd_line, "!!") == 0)) {
                if (h.size > 0) {
                    int i;
                    for (i = 0; i < h.cmds[0].size; ++i) {
                        cmd.cmd_words[i] = h.cmds[0].str[i];
                    }
                    cmd.words_size = h.cmds[0].size;
                    for (i = 0; i < h.cmds[0].size; ++i) {
                        printf("%s ", cmd.cmd_words[i]);
                    }
                    printf("\n");

                    if (strcmp(cmd.cmd_words[cmd.words_size - 1], "&") == 0 && cmd.words_size > 1) {
                        cmd.cmd_words[cmd.words_size - 1] = NULL;
                        cmd.words_size = cmd.words_size - 1;
                        is_background = true;
                    }

                    perform_commands();
                } else {
                    printf("No commands in history!!\n");
                }
            } else if ((strcmp(cmd_line, "!1") == 0)) {
                if (0 < h.size) {
                    int i;
                    for (i = 0; i < h.cmds[0].size; ++i) {
                        cmd.cmd_words[i] = h.cmds[0].str[i];
                    }
                    cmd.words_size = h.cmds[0].size;
                    for (i = 0; i < h.cmds[0].size; ++i) {
                        printf("%s ", cmd.cmd_words[i]);
                    }
                    printf("\n");

                    if (strcmp(cmd.cmd_words[cmd.words_size - 1], "&") == 0 && cmd.words_size > 1) {
                        cmd.cmd_words[cmd.words_size - 1] = NULL;
                        cmd.words_size = cmd.words_size - 1;
                        is_background = true;
                    }

                    perform_commands();
                } else {
                    printf("No saved command in 1!!\n");
                }
            } else if ((strcmp(cmd_line, "!2") == 0)) {
                if (1 < h.size) {
                    int i;
                    for (i = 0; i < h.cmds[1].size; ++i) {
                        cmd.cmd_words[i] = h.cmds[1].str[i];
                    }
                    cmd.words_size = h.cmds[1].size;
                    for (i = 0; i < h.cmds[1].size; ++i) {
                        printf("%s ", cmd.cmd_words[i]);
                    }
                    printf("\n");

                    if (strcmp(cmd.cmd_words[cmd.words_size - 1], "&") == 0 && cmd.words_size > 1) {
                        cmd.cmd_words[cmd.words_size - 1] = NULL;
                        cmd.words_size = cmd.words_size - 1;
                        is_background = true;
                    }

                    perform_commands();
                } else {
                    printf("No saved command in 2!!\n");
                }
            } else if ((strcmp(cmd_line, "!3") == 0)) {
                if (2 < h.size) {
                    int i;
                    for (i = 0; i < h.cmds[2].size; ++i) {
                        cmd.cmd_words[i] = h.cmds[2].str[i];
                    }
                    cmd.words_size = h.cmds[2].size;
                    for (i = 0; i < h.cmds[2].size; ++i) {
                        printf("%s ", cmd.cmd_words[i]);
                    }
                    printf("\n");

                    if (strcmp(cmd.cmd_words[cmd.words_size - 1], "&") == 0 && cmd.words_size > 1) {
                        cmd.cmd_words[cmd.words_size - 1] = NULL;
                        cmd.words_size = cmd.words_size - 1;
                        is_background = true;
                    }

                    perform_commands();
                } else {
                    printf("No saved command in 3!!\n");
                }
            } else if ((strcmp(cmd_line, "!4") == 0)) {
                if (3 < h.size) {
                    int i;
                    for (i = 0; i < h.cmds[3].size; ++i) {
                        cmd.cmd_words[i] = h.cmds[3].str[i];
                    }
                    cmd.words_size = h.cmds[3].size;
                    for (i = 0; i < h.cmds[3].size; ++i) {
                        printf("%s ", cmd.cmd_words[i]);
                    }
                    printf("\n");

                    if (strcmp(cmd.cmd_words[cmd.words_size - 1], "&") == 0 && cmd.words_size > 1) {
                        cmd.cmd_words[cmd.words_size - 1] = NULL;
                        cmd.words_size = cmd.words_size - 1;
                        is_background = true;
                    }

                    perform_commands();
                } else {
                    printf("No saved command in 4!!\n");
                }
            } else if ((strcmp(cmd_line, "!5") == 0)) {
                if (4 < h.size) {
                    int i;
                    for (i = 0; i < h.cmds[4].size; ++i) {
                        cmd.cmd_words[i] = h.cmds[4].str[i];
                    }
                    cmd.words_size = h.cmds[4].size;
                    for (i = 0; i < h.cmds[4].size; ++i) {
                        printf("%s ", cmd.cmd_words[i]);
                    }
                    printf("\n");

                    if (strcmp(cmd.cmd_words[cmd.words_size - 1], "&") == 0 && cmd.words_size > 1) {
                        cmd.cmd_words[cmd.words_size - 1] = NULL;
                        cmd.words_size = cmd.words_size - 1;
                        is_background = true;
                    }

                    perform_commands();
                } else {
                    printf("No saved command in 5!!\n");
                }
            } else if ((strcmp(cmd_line, "!6") == 0)) {
                if (4 < h.size) {
                    int i;
                    for (i = 0; i < h.cmds[5].size; ++i) {
                        cmd.cmd_words[i] = h.cmds[5].str[i];
                    }
                    cmd.words_size = h.cmds[5].size;
                    for (i = 0; i < h.cmds[5].size; ++i) {
                        printf("%s ", cmd.cmd_words[i]);
                    }
                    printf("\n");

                    if (strcmp(cmd.cmd_words[cmd.words_size - 1], "&") == 0 && cmd.words_size > 1) {
                        cmd.cmd_words[cmd.words_size - 1] = NULL;
                        cmd.words_size = cmd.words_size - 1;
                        is_background = true;
                    }

                    perform_commands();
                } else {
                    printf("No saved command in 6!!\n");
                }
            } else if ((strcmp(cmd_line, "!7") == 0)) {
                if (6 < h.size) {
                    int i;
                    for (i = 0; i < h.cmds[6].size; ++i) {
                        cmd.cmd_words[i] = h.cmds[6].str[i];
                    }
                    cmd.words_size = h.cmds[6].size;
                    for (i = 0; i < h.cmds[6].size; ++i) {
                        printf("%s ", cmd.cmd_words[i]);
                    }
                    printf("\n");

                    if (strcmp(cmd.cmd_words[cmd.words_size - 1], "&") == 0 && cmd.words_size > 1) {
                        cmd.cmd_words[cmd.words_size - 1] = NULL;
                        cmd.words_size = cmd.words_size - 1;
                        is_background = true;
                    }

                    perform_commands();
                } else {
                    printf("No saved command in 7!!\n");
                }
            } else if ((strcmp(cmd_line, "!8") == 0)) {
                if (7 < h.size) {
                    int i;
                    for (i = 0; i < h.cmds[7].size; ++i) {
                        cmd.cmd_words[i] = h.cmds[7].str[i];
                    }
                    cmd.words_size = h.cmds[7].size;
                    for (i = 0; i < h.cmds[7].size; ++i) {
                        printf("%s ", cmd.cmd_words[i]);
                    }
                    printf("\n");

                    if (strcmp(cmd.cmd_words[cmd.words_size - 1], "&") == 0 && cmd.words_size > 1) {
                        cmd.cmd_words[cmd.words_size - 1] = NULL;
                        cmd.words_size = cmd.words_size - 1;
                        is_background = true;
                    }

                    perform_commands();
                } else {
                    printf("No saved command in 8!!\n");
                }
            } else if ((strcmp(cmd_line, "!9") == 0)) {
                if (8 < h.size) {
                    int i;
                    for (i = 0; i < h.cmds[8].size; ++i) {
                        cmd.cmd_words[i] = h.cmds[8].str[i];
                    }
                    cmd.words_size = h.cmds[8].size;
                    for (i = 0; i < h.cmds[8].size; ++i) {
                        printf("%s ", cmd.cmd_words[i]);
                    }
                    printf("\n");

                    if (strcmp(cmd.cmd_words[cmd.words_size - 1], "&") == 0 && cmd.words_size > 1) {
                        cmd.cmd_words[cmd.words_size - 1] = NULL;
                        cmd.words_size = cmd.words_size - 1;
                        is_background = true;
                    }

                    perform_commands();
                } else {
                    printf("No saved command in 9!!\n");
                }
            } else if ((strcmp(cmd_line, "!10") == 0)) {
                if (9 < h.size) {
                    int i;
                    for (i = 0; i < h.cmds[9].size; ++i) {
                        cmd.cmd_words[i] = h.cmds[9].str[i];
                    }
                    cmd.words_size = h.cmds[9].size;
                    for (i = 0; i < h.cmds[9].size; ++i) {
                        printf("%s ", cmd.cmd_words[i]);
                    }
                    printf("\n");

                    if (strcmp(cmd.cmd_words[cmd.words_size - 1], "&") == 0 && cmd.words_size > 1) {
                        cmd.cmd_words[cmd.words_size - 1] = NULL;
                        cmd.words_size = cmd.words_size - 1;
                        is_background = true;
                    }

                    perform_commands();
                } else {
                    printf("No saved command in 10!!\n");
                }
            } else if (cmd_line[0] == '!') {
                printf("Wrong history command!!\n");
            } else if ((strcmp(cmd_line, "exit") == 0) || (strcmp(cmd_line, "quit") == 0)) {
                loop_flag = 0;
            } else {
                tokenize_cmd(cmd_line, &cmd);
                insert_history();

                if (strcmp(cmd.cmd_words[cmd.words_size - 1], "&") == 0 && cmd.words_size > 1) {
                    cmd.cmd_words[cmd.words_size - 1] = NULL;
                    cmd.words_size = cmd.words_size - 1;
                    is_background = true;
                }

                perform_commands();
            }
        }
    }

    printf("\n");
    exit(EXIT_SUCCESS);
}