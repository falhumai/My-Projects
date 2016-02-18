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

        if (inp != '\n') {
            process_one_word_cmd(cmd_line, &inp);

            // The command line will not execute if there is nothing in the command line
            // If this code was not made, empty inputs will cause the program to crash
            bool is_empty = true;
            int i;
            for (i = 0; i < strlen(cmd_line); ++i) {
                if (cmd_line[i] != ' ' && cmd_line[i] != '\n' && cmd_line[i] != '\t' && cmd_line[i] != '\0') {
                    is_empty = false;
                }
            }

            if (is_empty == false) {
                if ((strcmp(cmd_line, "exit") == 0) || (strcmp(cmd_line, "quit") == 0)) {
                    mini_garbage_collector_for_saved_ptrs();
                    exit(EXIT_SUCCESS);
                } else if ((strcmp(cmd_line, "!!") == 0)) {
                    if (h.size > 0) {
                        int i;
                        for (i = 0; i < h.cmds[0].word_count; ++i) {
                            cmd.cmd_words[i] = h.cmds[0].cmd_words[i];
                        }
                        cmd.word_count = h.cmds[0].word_count;
                        for (i = 0; i < h.cmds[0].word_count; ++i) {
                            printf("%s ", cmd.cmd_words[i]);
                        }
                        printf("\n");

                        if (strcmp(cmd.cmd_words[cmd.word_count - 1], "&") == 0 && cmd.word_count > 1) {
                            cmd.cmd_words[cmd.word_count - 1] = NULL;
                            cmd.word_count = cmd.word_count - 1;
                            is_background = true;
                        }

                        perform_commands();
                    } else {
                        printf("No commands in history!!\n");
                    }
                } else if ((strcmp(cmd_line, "!1") == 0)) {
                    if (0 < h.size) {
                        int i;
                        for (i = 0; i < h.cmds[0].word_count; ++i) {
                            cmd.cmd_words[i] = h.cmds[0].cmd_words[i];
                        }
                        cmd.word_count = h.cmds[0].word_count;
                        for (i = 0; i < h.cmds[0].word_count; ++i) {
                            printf("%s ", cmd.cmd_words[i]);
                        }
                        printf("\n");

                        if (strcmp(cmd.cmd_words[cmd.word_count - 1], "&") == 0 && cmd.word_count > 1) {
                            cmd.cmd_words[cmd.word_count - 1] = NULL;
                            cmd.word_count = cmd.word_count - 1;
                            is_background = true;
                        }

                        perform_commands();
                    } else {
                        printf("No saved command in 1!!\n");
                    }
                } else if ((strcmp(cmd_line, "!2") == 0)) {
                    if (1 < h.size) {
                        int i;
                        for (i = 0; i < h.cmds[1].word_count; ++i) {
                            cmd.cmd_words[i] = h.cmds[1].cmd_words[i];
                        }
                        cmd.word_count = h.cmds[1].word_count;
                        for (i = 0; i < h.cmds[1].word_count; ++i) {
                            printf("%s ", cmd.cmd_words[i]);
                        }
                        printf("\n");

                        if (strcmp(cmd.cmd_words[cmd.word_count - 1], "&") == 0 && cmd.word_count > 1) {
                            cmd.cmd_words[cmd.word_count - 1] = NULL;
                            cmd.word_count = cmd.word_count - 1;
                            is_background = true;
                        }

                        perform_commands();
                    } else {
                        printf("No saved command in 2!!\n");
                    }
                } else if ((strcmp(cmd_line, "!3") == 0)) {
                    if (2 < h.size) {
                        int i;
                        for (i = 0; i < h.cmds[2].word_count; ++i) {
                            cmd.cmd_words[i] = h.cmds[2].cmd_words[i];
                        }
                        cmd.word_count = h.cmds[2].word_count;
                        for (i = 0; i < h.cmds[2].word_count; ++i) {
                            printf("%s ", cmd.cmd_words[i]);
                        }
                        printf("\n");

                        if (strcmp(cmd.cmd_words[cmd.word_count - 1], "&") == 0 && cmd.word_count > 1) {
                            cmd.cmd_words[cmd.word_count - 1] = NULL;
                            cmd.word_count = cmd.word_count - 1;
                            is_background = true;
                        }

                        perform_commands();
                    } else {
                        printf("No saved command in 3!!\n");
                    }
                } else if ((strcmp(cmd_line, "!4") == 0)) {
                    if (3 < h.size) {
                        int i;
                        for (i = 0; i < h.cmds[3].word_count; ++i) {
                            cmd.cmd_words[i] = h.cmds[3].cmd_words[i];
                        }
                        cmd.word_count = h.cmds[3].word_count;
                        for (i = 0; i < h.cmds[3].word_count; ++i) {
                            printf("%s ", cmd.cmd_words[i]);
                        }
                        printf("\n");

                        if (strcmp(cmd.cmd_words[cmd.word_count - 1], "&") == 0 && cmd.word_count > 1) {
                            cmd.cmd_words[cmd.word_count - 1] = NULL;
                            cmd.word_count = cmd.word_count - 1;
                            is_background = true;
                        }

                        perform_commands();
                    } else {
                        printf("No saved command in 4!!\n");
                    }
                } else if ((strcmp(cmd_line, "!5") == 0)) {
                    if (4 < h.size) {
                        int i;
                        for (i = 0; i < h.cmds[4].word_count; ++i) {
                            cmd.cmd_words[i] = h.cmds[4].cmd_words[i];
                        }
                        cmd.word_count = h.cmds[4].word_count;
                        for (i = 0; i < h.cmds[4].word_count; ++i) {
                            printf("%s ", cmd.cmd_words[i]);
                        }
                        printf("\n");

                        if (strcmp(cmd.cmd_words[cmd.word_count - 1], "&") == 0 && cmd.word_count > 1) {
                            cmd.cmd_words[cmd.word_count - 1] = NULL;
                            cmd.word_count = cmd.word_count - 1;
                            is_background = true;
                        }

                        perform_commands();
                    } else {
                        printf("No saved command in 5!!\n");
                    }
                } else if ((strcmp(cmd_line, "!6") == 0)) {
                    if (4 < h.size) {
                        int i;
                        for (i = 0; i < h.cmds[5].word_count; ++i) {
                            cmd.cmd_words[i] = h.cmds[5].cmd_words[i];
                        }
                        cmd.word_count = h.cmds[5].word_count;
                        for (i = 0; i < h.cmds[5].word_count; ++i) {
                            printf("%s ", cmd.cmd_words[i]);
                        }
                        printf("\n");

                        if (strcmp(cmd.cmd_words[cmd.word_count - 1], "&") == 0 && cmd.word_count > 1) {
                            cmd.cmd_words[cmd.word_count - 1] = NULL;
                            cmd.word_count = cmd.word_count - 1;
                            is_background = true;
                        }

                        perform_commands();
                    } else {
                        printf("No saved command in 6!!\n");
                    }
                } else if ((strcmp(cmd_line, "!7") == 0)) {
                    if (6 < h.size) {
                        int i;
                        for (i = 0; i < h.cmds[6].word_count; ++i) {
                            cmd.cmd_words[i] = h.cmds[6].cmd_words[i];
                        }
                        cmd.word_count = h.cmds[6].word_count;
                        for (i = 0; i < h.cmds[6].word_count; ++i) {
                            printf("%s ", cmd.cmd_words[i]);
                        }
                        printf("\n");

                        if (strcmp(cmd.cmd_words[cmd.word_count - 1], "&") == 0 && cmd.word_count > 1) {
                            cmd.cmd_words[cmd.word_count - 1] = NULL;
                            cmd.word_count = cmd.word_count - 1;
                            is_background = true;
                        }

                        perform_commands();
                    } else {
                        printf("No saved command in 7!!\n");
                    }
                } else if ((strcmp(cmd_line, "!8") == 0)) {
                    if (7 < h.size) {
                        int i;
                        for (i = 0; i < h.cmds[7].word_count; ++i) {
                            cmd.cmd_words[i] = h.cmds[7].cmd_words[i];
                        }
                        cmd.word_count = h.cmds[7].word_count;
                        for (i = 0; i < h.cmds[7].word_count; ++i) {
                            printf("%s ", cmd.cmd_words[i]);
                        }
                        printf("\n");

                        if (strcmp(cmd.cmd_words[cmd.word_count - 1], "&") == 0 && cmd.word_count > 1) {
                            cmd.cmd_words[cmd.word_count - 1] = NULL;
                            cmd.word_count = cmd.word_count - 1;
                            is_background = true;
                        }

                        perform_commands();
                    } else {
                        printf("No saved command in 8!!\n");
                    }
                } else if ((strcmp(cmd_line, "!9") == 0)) {
                    if (8 < h.size) {
                        int i;
                        for (i = 0; i < h.cmds[8].word_count; ++i) {
                            cmd.cmd_words[i] = h.cmds[8].cmd_words[i];
                        }
                        cmd.word_count = h.cmds[8].word_count;
                        for (i = 0; i < h.cmds[8].word_count; ++i) {
                            printf("%s ", cmd.cmd_words[i]);
                        }
                        printf("\n");

                        if (strcmp(cmd.cmd_words[cmd.word_count - 1], "&") == 0 && cmd.word_count > 1) {
                            cmd.cmd_words[cmd.word_count - 1] = NULL;
                            cmd.word_count = cmd.word_count - 1;
                            is_background = true;
                        }

                        perform_commands();
                    } else {
                        printf("No saved command in 9!!\n");
                    }
                } else if ((strcmp(cmd_line, "!10") == 0)) {
                    if (9 < h.size) {
                        int i;
                        for (i = 0; i < h.cmds[9].word_count; ++i) {
                            cmd.cmd_words[i] = h.cmds[9].cmd_words[i];
                        }
                        cmd.word_count = h.cmds[9].word_count;
                        for (i = 0; i < h.cmds[9].word_count; ++i) {
                            printf("%s ", cmd.cmd_words[i]);
                        }
                        printf("\n");

                        if (strcmp(cmd.cmd_words[cmd.word_count - 1], "&") == 0 && cmd.word_count > 1) {
                            cmd.cmd_words[cmd.word_count - 1] = NULL;
                            cmd.word_count = cmd.word_count - 1;
                            is_background = true;
                        }

                        perform_commands();
                    } else {
                        printf("No saved command in 10!!\n");
                    }
                } else if (cmd_line[0] == '!') {
                    printf("Wrong history command!!\n");
                } else {
                    tokenize_cmd(cmd_line, &cmd);
                    insert_history();

                    if (strcmp(cmd.cmd_words[cmd.word_count - 1], "&") == 0 && cmd.word_count > 1) {
                        cmd.cmd_words[cmd.word_count - 1] = NULL;
                        cmd.word_count = cmd.word_count - 1;
                        is_background = true;
                    }

                    perform_commands();
                }
            }
        }
    }

    printf("\n");
    mini_garbage_collector_for_saved_ptrs();
    exit(EXIT_SUCCESS);
}