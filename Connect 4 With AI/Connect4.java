package connect4;

import java.util.Scanner;
import java.util.*;

public class Connect4 {

    public static Scanner input = new Scanner(System.in);

    public static ArrayList stringTokinzer(String inp) {
        ArrayList words = new ArrayList();
        for (int i = 0; i < inp.length(); ++i) {
            if (inp.charAt(i) != ' ' && inp.charAt(i) != '\n' && inp.charAt(i) != '\0') {
                String currentWord = "";
                int currentJ = 0;
                for (int j = i; j < inp.length() && (inp.charAt(j) != ' ' && inp.charAt(j) != '\n' && inp.charAt(j) != '\0'); ++j) {
                    currentJ = j;
                    currentWord += inp.charAt(j);
                }
                i = currentJ;
                words.add(currentWord);
            }
        }
        return words;
    }

    public static int isGoingToWin(ArrayList board, String playerNum) {
        boolean choiceDone = false;
        int winCount = 0;
        int waitingTime = 90000000;

        for (int i = 0; i < waitingTime; ++i);
        if (choiceDone == false) {
            for (int i = 0; i < board.size(); ++i) {
                for (int j = 0; j < ((ArrayList) board.get(i)).size(); ++j) {
                    int tempSizeI = board.size();
                    int tempSizeJ = ((ArrayList) board.get(i)).size();
                    if (i + 1 < tempSizeI && j + 3 < tempSizeJ) {
                        if ((char) ((ArrayList) board.get(i)).get(j) == playerNum.charAt(0)
                                && (char) ((ArrayList) board.get(i)).get(j + 1) == playerNum.charAt(0)
                                && (char) ((ArrayList) board.get(i)).get(j + 2) == playerNum.charAt(0)
                                && (char) ((ArrayList) board.get(i)).get(j + 3) == '*'
                                && (char) ((ArrayList) board.get(i + 1)).get(j + 3) != '*') {
                            ++winCount;
                        }
                    }
                }
            }
        }

        for (int i = 0; i < waitingTime; ++i);
        if (choiceDone == false) {
            for (int i = board.size() - 1; i < board.size(); ++i) {
                for (int j = 0; j < ((ArrayList) board.get(i)).size(); ++j) {
                    int tempSizeJ = ((ArrayList) board.get(i)).size();
                    if (j + 3 < tempSizeJ) {
                        if ((char) ((ArrayList) board.get(i)).get(j) == playerNum.charAt(0)
                                && (char) ((ArrayList) board.get(i)).get(j + 1) == playerNum.charAt(0)
                                && (char) ((ArrayList) board.get(i)).get(j + 2) == playerNum.charAt(0)
                                && (char) ((ArrayList) board.get(i)).get(j + 3) == '*') {
                            ++winCount;
                        }
                    }
                }
            }
        }

        for (int i = 0; i < waitingTime; ++i);
        if (choiceDone == false) {
            for (int i = 0; i < board.size(); ++i) {
                for (int j = 0; j < ((ArrayList) board.get(i)).size(); ++j) {
                    int tempSizeI = board.size();
                    int tempSizeJ = ((ArrayList) board.get(i)).size();
                    if (i + 1 < tempSizeI && j + 3 < tempSizeJ) {
                        if ((char) ((ArrayList) board.get(i)).get(j) == '*'
                                && (char) ((ArrayList) board.get(i)).get(j + 1) == playerNum.charAt(0)
                                && (char) ((ArrayList) board.get(i)).get(j + 2) == playerNum.charAt(0)
                                && (char) ((ArrayList) board.get(i)).get(j + 3) == playerNum.charAt(0)
                                && (char) ((ArrayList) board.get(i + 1)).get(j) != '*') {
                            ++winCount;
                        }
                    }
                }
            }
        }

        for (int i = 0; i < waitingTime; ++i);
        if (choiceDone == false) {
            for (int i = board.size() - 1; i < board.size(); ++i) {
                for (int j = 0; j < ((ArrayList) board.get(i)).size(); ++j) {
                    int tempSizeJ = ((ArrayList) board.get(i)).size();
                    if (j + 3 < tempSizeJ) {
                        if ((char) ((ArrayList) board.get(i)).get(j) == '*'
                                && (char) ((ArrayList) board.get(i)).get(j + 1) == playerNum.charAt(0)
                                && (char) ((ArrayList) board.get(i)).get(j + 2) == playerNum.charAt(0)
                                && (char) ((ArrayList) board.get(i)).get(j + 3) == playerNum.charAt(0)) {
                            ++winCount;
                        }
                    }
                }
            }
        }

        for (int i = 0; i < waitingTime; ++i);
        if (choiceDone == false) {
            for (int i = 0; i < board.size(); ++i) {
                for (int j = 0; j < ((ArrayList) board.get(i)).size(); ++j) {
                    int tempSizeI = board.size();
                    int tempSizeJ = ((ArrayList) board.get(i)).size();
                    if (i + 1 < tempSizeI && j + 3 < tempSizeJ) {
                        if ((char) ((ArrayList) board.get(i)).get(j) == playerNum.charAt(0)
                                && (char) ((ArrayList) board.get(i)).get(j + 1) == '*'
                                && (char) ((ArrayList) board.get(i)).get(j + 2) == playerNum.charAt(0)
                                && (char) ((ArrayList) board.get(i)).get(j + 3) == playerNum.charAt(0)
                                && (char) ((ArrayList) board.get(i + 1)).get(j + 1) != '*') {
                            ++winCount;
                        }
                    }
                }
            }
        }

        for (int i = 0; i < waitingTime; ++i);
        if (choiceDone == false) {
            for (int i = board.size() - 1; i < board.size(); ++i) {
                for (int j = 0; j < ((ArrayList) board.get(i)).size(); ++j) {
                    int tempSizeJ = ((ArrayList) board.get(i)).size();
                    if (j + 3 < tempSizeJ) {
                        if ((char) ((ArrayList) board.get(i)).get(j) == playerNum.charAt(0)
                                && (char) ((ArrayList) board.get(i)).get(j + 1) == '*'
                                && (char) ((ArrayList) board.get(i)).get(j + 2) == playerNum.charAt(0)
                                && (char) ((ArrayList) board.get(i)).get(j + 3) == playerNum.charAt(0)) {
                            ++winCount;
                        }
                    }
                }
            }
        }

        for (int i = 0; i < waitingTime; ++i);
        if (choiceDone == false) {
            for (int i = 0; i < board.size(); ++i) {
                for (int j = 0; j < ((ArrayList) board.get(i)).size(); ++j) {
                    int tempSizeI = board.size();
                    int tempSizeJ = ((ArrayList) board.get(i)).size();
                    if (i + 1 < tempSizeI && j + 3 < tempSizeJ) {
                        if ((char) ((ArrayList) board.get(i)).get(j) == playerNum.charAt(0)
                                && (char) ((ArrayList) board.get(i)).get(j + 1) == playerNum.charAt(0)
                                && (char) ((ArrayList) board.get(i)).get(j + 2) == '*'
                                && (char) ((ArrayList) board.get(i)).get(j + 3) == playerNum.charAt(0)
                                && (char) ((ArrayList) board.get(i + 1)).get(j + 2) != '*') {
                            ++winCount;
                        }
                    }
                }
            }
        }

        for (int i = 0; i < waitingTime; ++i);
        if (choiceDone == false) {
            for (int i = board.size() - 1; i < board.size(); ++i) {
                for (int j = 0; j < ((ArrayList) board.get(i)).size(); ++j) {
                    int tempSizeJ = ((ArrayList) board.get(i)).size();
                    if (j + 3 < tempSizeJ) {
                        if ((char) ((ArrayList) board.get(i)).get(j) == playerNum.charAt(0)
                                && (char) ((ArrayList) board.get(i)).get(j + 1) == playerNum.charAt(0)
                                && (char) ((ArrayList) board.get(i)).get(j + 2) == '*'
                                && (char) ((ArrayList) board.get(i)).get(j + 3) == playerNum.charAt(0)) {
                            ++winCount;
                        }
                    }
                }
            }
        }

        for (int i = 0; i < waitingTime; ++i);
        if (choiceDone == false) {
            for (int i = 0; i < board.size(); ++i) {
                for (int j = 0; j < ((ArrayList) board.get(i)).size(); ++j) {
                    int tempSizeI = board.size();
                    int tempSizeJ = ((ArrayList) board.get(i)).size();
                    if (i + 4 < tempSizeI && j + 3 < tempSizeJ) {
                        if ((char) ((ArrayList) board.get(i)).get(j) == playerNum.charAt(0)
                                && (char) ((ArrayList) board.get(i + 1)).get(j + 1) == playerNum.charAt(0)
                                && (char) ((ArrayList) board.get(i + 2)).get(j + 2) == playerNum.charAt(0)
                                && (char) ((ArrayList) board.get(i + 3)).get(j + 3) == '*'
                                && (char) ((ArrayList) board.get(i + 4)).get(j + 3) != '*') {
                            ++winCount;
                        }
                    }
                }
            }
        }

        for (int i = 0; i < waitingTime; ++i);
        if (choiceDone == false) {
            for (int i = board.size() - 4; i < board.size(); ++i) {
                for (int j = 0; j < ((ArrayList) board.get(i)).size(); ++j) {
                    int tempSizeI = board.size();
                    int tempSizeJ = ((ArrayList) board.get(i)).size();
                    if (i + 3 < tempSizeI && j + 3 < tempSizeJ) {
                        if ((char) ((ArrayList) board.get(i)).get(j) == playerNum.charAt(0)
                                && (char) ((ArrayList) board.get(i + 1)).get(j + 1) == playerNum.charAt(0)
                                && (char) ((ArrayList) board.get(i + 2)).get(j + 2) == playerNum.charAt(0)
                                && (char) ((ArrayList) board.get(i + 3)).get(j + 3) == '*') {
                            ++winCount;
                        }
                    }
                }
            }
        }

        for (int i = 0; i < waitingTime; ++i);
        if (choiceDone == false) {
            for (int i = 0; i < board.size(); ++i) {
                for (int j = 0; j < ((ArrayList) board.get(i)).size(); ++j) {
                    int tempSizeI = board.size();
                    int tempSizeJ = ((ArrayList) board.get(i)).size();
                    if (i + 3 < tempSizeI && j + 3 < tempSizeJ) {
                        if ((char) ((ArrayList) board.get(i)).get(j) == playerNum.charAt(0)
                                && (char) ((ArrayList) board.get(i + 1)).get(j + 1) == playerNum.charAt(0)
                                && (char) ((ArrayList) board.get(i + 2)).get(j + 2) == '*'
                                && (char) ((ArrayList) board.get(i + 3)).get(j + 3) == playerNum.charAt(0)
                                && (char) ((ArrayList) board.get(i + 3)).get(j + 2) != '*') {
                            ++winCount;
                        }
                    }
                }
            }
        }

        for (int i = 0; i < waitingTime; ++i);
        if (choiceDone == false) {
            for (int i = 0; i < board.size(); ++i) {
                for (int j = 0; j < ((ArrayList) board.get(i)).size(); ++j) {
                    int tempSizeI = board.size();
                    int tempSizeJ = ((ArrayList) board.get(i)).size();
                    if (i + 3 < tempSizeI && j + 3 < tempSizeJ) {
                        if ((char) ((ArrayList) board.get(i)).get(j) == playerNum.charAt(0)
                                && (char) ((ArrayList) board.get(i + 1)).get(j + 1) == '*'
                                && (char) ((ArrayList) board.get(i + 2)).get(j + 2) == playerNum.charAt(0)
                                && (char) ((ArrayList) board.get(i + 3)).get(j + 3) == playerNum.charAt(0)
                                && (char) ((ArrayList) board.get(i + 2)).get(j + 1) != '*') {
                            ++winCount;
                        }
                    }
                }
            }
        }

        for (int i = 0; i < waitingTime; ++i);
        if (choiceDone == false) {
            for (int i = 0; i < board.size(); ++i) {
                for (int j = 0; j < ((ArrayList) board.get(i)).size(); ++j) {
                    int tempSizeI = board.size();
                    int tempSizeJ = ((ArrayList) board.get(i)).size();
                    if (i + 3 < tempSizeI && j + 3 < tempSizeJ) {
                        if ((char) ((ArrayList) board.get(i)).get(j) == '*'
                                && (char) ((ArrayList) board.get(i + 1)).get(j + 1) == playerNum.charAt(0)
                                && (char) ((ArrayList) board.get(i + 2)).get(j + 2) == playerNum.charAt(0)
                                && (char) ((ArrayList) board.get(i + 3)).get(j + 3) == playerNum.charAt(0)
                                && (char) ((ArrayList) board.get(i + 1)).get(j) != '*') {
                            ++winCount;
                        }
                    }
                }
            }
        }

        for (int i = 0; i < waitingTime; ++i);
        if (choiceDone == false) {
            for (int i = 0; i < board.size(); ++i) {
                for (int j = ((ArrayList) board.get(i)).size() - 1; j >= 0; --j) {
                    int tempSizeI = board.size();
                    if (i + 4 < tempSizeI && j - 3 >= 0) {
                        if ((char) ((ArrayList) board.get(i)).get(j) == playerNum.charAt(0)
                                && (char) ((ArrayList) board.get(i + 1)).get(j - 1) == playerNum.charAt(0)
                                && (char) ((ArrayList) board.get(i + 2)).get(j - 2) == playerNum.charAt(0)
                                && (char) ((ArrayList) board.get(i + 3)).get(j - 3) == '*'
                                && (char) ((ArrayList) board.get(i + 4)).get(j - 3) != '*') {
                            ++winCount;
                        }
                    }
                }
            }
        }

        for (int i = 0; i < waitingTime; ++i);
        if (choiceDone == false) {
            for (int i = board.size() - 4; i < board.size(); ++i) {
                for (int j = ((ArrayList) board.get(i)).size() - 1; j >= 0; --j) {
                    int tempSizeI = board.size();
                    if (i + 3 < tempSizeI && j - 3 >= 0) {
                        if ((char) ((ArrayList) board.get(i)).get(j) == playerNum.charAt(0)
                                && (char) ((ArrayList) board.get(i + 1)).get(j - 1) == playerNum.charAt(0)
                                && (char) ((ArrayList) board.get(i + 2)).get(j - 2) == playerNum.charAt(0)
                                && (char) ((ArrayList) board.get(i + 3)).get(j - 3) == '*') {
                            ++winCount;
                        }
                    }
                }
            }
        }

        for (int i = 0; i < waitingTime; ++i);
        if (choiceDone == false) {
            for (int i = 0; i < board.size(); ++i) {
                for (int j = ((ArrayList) board.get(i)).size() - 1; j >= 0; --j) {
                    int tempSizeI = board.size();
                    if (i + 3 < tempSizeI && j - 3 >= 0) {
                        if ((char) ((ArrayList) board.get(i)).get(j) == playerNum.charAt(0)
                                && (char) ((ArrayList) board.get(i + 1)).get(j - 1) == playerNum.charAt(0)
                                && (char) ((ArrayList) board.get(i + 2)).get(j - 2) == '*'
                                && (char) ((ArrayList) board.get(i + 3)).get(j - 3) == playerNum.charAt(0)
                                && (char) ((ArrayList) board.get(i + 3)).get(j - 2) != '*') {
                            ++winCount;
                        }
                    }
                }
            }
        }

        for (int i = 0; i < waitingTime; ++i);
        if (choiceDone == false) {
            for (int i = 0; i < board.size(); ++i) {
                for (int j = ((ArrayList) board.get(i)).size() - 1; j >= 0; --j) {
                    int tempSizeI = board.size();
                    if (i + 3 < tempSizeI && j - 3 >= 0) {
                        if ((char) ((ArrayList) board.get(i)).get(j) == playerNum.charAt(0)
                                && (char) ((ArrayList) board.get(i + 1)).get(j - 1) == '*'
                                && (char) ((ArrayList) board.get(i + 2)).get(j - 2) == playerNum.charAt(0)
                                && (char) ((ArrayList) board.get(i + 3)).get(j - 3) == playerNum.charAt(0)
                                && (char) ((ArrayList) board.get(i + 2)).get(j - 1) != '*') {
                            ++winCount;
                        }
                    }
                }
            }
        }

        for (int i = 0; i < waitingTime; ++i);
        if (choiceDone == false) {
            for (int i = 0; i < board.size(); ++i) {
                for (int j = ((ArrayList) board.get(i)).size() - 1; j >= 0; --j) {
                    int tempSizeI = board.size();
                    if (i + 3 < tempSizeI && j - 3 >= 0) {
                        if ((char) ((ArrayList) board.get(i)).get(j) == '*'
                                && (char) ((ArrayList) board.get(i + 1)).get(j - 1) == playerNum.charAt(0)
                                && (char) ((ArrayList) board.get(i + 2)).get(j - 2) == playerNum.charAt(0)
                                && (char) ((ArrayList) board.get(i + 3)).get(j - 3) == playerNum.charAt(0)
                                && (char) ((ArrayList) board.get(i + 1)).get(j) != '*') {
                            ++winCount;
                        }
                    }
                }
            }
        }

        for (int i = 0; i < waitingTime; ++i);
        if (choiceDone == false) {
            for (int i = 0; i < board.size(); ++i) {
                for (int j = 0; j < ((ArrayList) board.get(i)).size(); ++j) {
                    int tempSizeI = board.size();
                    if (i + 3 < tempSizeI) {
                        if ((char) ((ArrayList) board.get(i)).get(j) == '*'
                                && (char) ((ArrayList) board.get(i + 1)).get(j) == playerNum.charAt(0)
                                && (char) ((ArrayList) board.get(i + 2)).get(j) == playerNum.charAt(0)
                                && (char) ((ArrayList) board.get(i + 3)).get(j) == playerNum.charAt(0)) {
                            ++winCount;
                        }
                    }
                }
            }
        }
        return winCount;
    }

    public static String request(String question, String errorMessage, ArrayList choices) {
        boolean repeat = true;
        while (repeat == true) {
            System.out.print(question);
            String userInput = input.nextLine();

            ArrayList words = stringTokinzer(userInput);
            if (words.size() == 1) {
                for (int i = 0; i < choices.size(); ++i) {
                    if (words.get(0).toString().equals(choices.get(i).toString())) {
                        repeat = false;
                        return choices.get(i).toString();
                    }
                }
                System.out.print(errorMessage);
                repeat = true;
            } else {
                System.out.print(errorMessage);
                repeat = true;
            }
        }
        return "";
    }

    public static boolean allFull(ArrayList board) {
        for (int i = 0; i < board.size(); ++i) {
            for (int j = 0; j < ((ArrayList) board.get(i)).size(); ++j) {
                if ((char) ((ArrayList) board.get(i)).get(j) == '*') {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean winning(String num, ArrayList board) {
        char match = ' ';
        if (num.equals("1") == true) {
            match = '1';
        } else {
            match = '2';
        }

        for (int i = 0; i < board.size(); ++i) {
            for (int j = 0; j < ((ArrayList) board.get(i)).size(); ++j) {
                int tempISize = board.size();
                int tempJSize = ((ArrayList) board.get(i)).size();
                if (j >= 0 && j - 1 >= 0 && j - 2 >= 0 && j - 3 >= 0) {
                    if ((((char) ((ArrayList) board.get(i)).get(j - 0)) == match)
                            && (((char) ((ArrayList) board.get(i)).get(j - 1)) == match)
                            && (((char) ((ArrayList) board.get(i)).get(j - 2)) == match)
                            && (((char) ((ArrayList) board.get(i)).get(j - 3)) == match)) {
                        return true;
                    }
                }

                if (i >= 0 && i - 1 >= 0 && i - 2 >= 0 && i - 3 >= 0
                        && j >= 0 && j - 1 >= 0 && j - 2 >= 0 && j - 3 >= 0) {
                    if ((((char) ((ArrayList) board.get(i - 0)).get(j - 0)) == match)
                            && (((char) ((ArrayList) board.get(i - 1)).get(j - 1)) == match)
                            && (((char) ((ArrayList) board.get(i - 2)).get(j - 2)) == match)
                            && (((char) ((ArrayList) board.get(i - 3)).get(j - 3)) == match)) {
                        return true;
                    }
                }

                if (i >= 0 && i - 1 >= 0 && i - 2 >= 0 && i - 3 >= 0) {
                    if ((((char) ((ArrayList) board.get(i - 0)).get(j)) == match)
                            && (((char) ((ArrayList) board.get(i - 1)).get(j)) == match)
                            && (((char) ((ArrayList) board.get(i - 2)).get(j)) == match)
                            && (((char) ((ArrayList) board.get(i - 3)).get(j)) == match)) {
                        return true;
                    }
                }

                if (i >= 0 && i - 1 >= 0 && i - 2 >= 0 && i - 3 >= 0
                        && j < tempJSize && j + 1 < tempJSize && j + 2 < tempJSize && j + 3 < tempJSize) {
                    if ((((char) ((ArrayList) board.get(i - 0)).get(j + 0)) == match)
                            && (((char) ((ArrayList) board.get(i - 1)).get(j + 1)) == match)
                            && (((char) ((ArrayList) board.get(i - 2)).get(j + 2)) == match)
                            && (((char) ((ArrayList) board.get(i - 3)).get(j + 3)) == match)) {
                        return true;
                    }
                }

                if (j < tempJSize && j + 1 < tempJSize && j + 2 < tempJSize && j + 3 < tempJSize) {
                    if ((((char) ((ArrayList) board.get(i)).get(j + 0)) == match)
                            && (((char) ((ArrayList) board.get(i)).get(j + 1)) == match)
                            && (((char) ((ArrayList) board.get(i)).get(j + 2)) == match)
                            && (((char) ((ArrayList) board.get(i)).get(j + 3)) == match)) {
                        return true;
                    }
                }

                if (i < tempISize && i + 1 < tempISize && i + 2 < tempISize && i + 3 < tempISize
                        && j < tempJSize && j + 1 < tempJSize && j + 2 < tempJSize && j + 3 < tempJSize) {
                    if ((((char) ((ArrayList) board.get(i + 0)).get(j + 0)) == match)
                            && (((char) ((ArrayList) board.get(i + 1)).get(j + 1)) == match)
                            && (((char) ((ArrayList) board.get(i + 2)).get(j + 2)) == match)
                            && (((char) ((ArrayList) board.get(i + 3)).get(j + 3)) == match)) {
                        return true;
                    }
                }

                if (i < tempISize && i + 1 < tempISize && i + 2 < tempISize && i + 3 < tempISize) {
                    if ((((char) ((ArrayList) board.get(i + 0)).get(j)) == match)
                            && (((char) ((ArrayList) board.get(i + 1)).get(j)) == match)
                            && (((char) ((ArrayList) board.get(i + 2)).get(j)) == match)
                            && (((char) ((ArrayList) board.get(i + 3)).get(j)) == match)) {
                        return true;
                    }
                }

                if (i < tempISize && i + 1 < tempISize && i + 2 < tempISize && i + 3 < tempISize
                        && j >= 0 && j - 1 >= 0 && j - 2 >= 0 && j - 3 >= 0) {
                    if ((((char) ((ArrayList) board.get(i + 0)).get(j - 0)) == match)
                            && (((char) ((ArrayList) board.get(i + 1)).get(j - 1)) == match)
                            && (((char) ((ArrayList) board.get(i + 2)).get(j - 2)) == match)
                            && (((char) ((ArrayList) board.get(i + 3)).get(j - 3)) == match)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static void copyBoard(ArrayList src, ArrayList dst) {
        for (int i = 0; i < src.size(); ++i) {
            for (int j = 0; j < ((ArrayList) src.get(i)).size(); ++j) {
                ((ArrayList) dst.get(i)).set(j, ((ArrayList) src.get(i)).get(j));
            }
        }
    }

    public static ArrayList makeNewBoard(int rows, int columns) {
        ArrayList board = new ArrayList();
        for (int i = 0; i < rows; ++i) {
            ArrayList tempColumns = new ArrayList();
            for (int j = 0; j < columns; ++j) {
                tempColumns.add('*');
            }
            board.add(tempColumns);
        }
        return board;
    }

    public static int availableRow(ArrayList board, int columnNum) {
        for (int i = board.size() - 1; i >= 0; --i) {
            if ((char) ((ArrayList) board.get(i)).get(columnNum) == '*') {
                return i;
            }
        }
        return -1;
    }

    /*
     * Returns the winning status:
     *      0 == Game is still on.
     *      1 == The passed in player has won.
     *      2 == The game ends in a tie.
     */
    public static int responseAndWinningStatus(String player, String diff, String playerNum, ArrayList board) {
        int waitingTime = 90000000;

        String oppositePlayerNum = "";
        if (playerNum.equals("1")) {
            oppositePlayerNum = "2";
        } else {
            oppositePlayerNum = "1";
        }

        if (player.equals("computer") == true) {
            if (diff.equals("easy")) {
                // Computer - Easy mode.
                boolean choiceDone = false;
                int comuputerColumnChoice = -1;
                System.out.println("Thinking...");

                // Completing.
                for (int i = 0; i < waitingTime; ++i);
                if (choiceDone == false) {
                    Random rand = new Random();
                    ArrayList columnChoices = new ArrayList();
                    for (int i = 0; i < 7; ++i) {
                        columnChoices.add(i);
                    }
                    boolean valid = false;
                    while (valid == false && !columnChoices.isEmpty()) {
                        int min = 0;
                        int max = columnChoices.size() - 1;
                        int chosenColumn = rand.nextInt((max - min) + 1) + min;
                        int tempRow = availableRow(board, (int) columnChoices.get(chosenColumn));
                        int tempColumn = (int) columnChoices.get(chosenColumn);
                        if (tempRow != -1) {
                            ArrayList tempBoard = makeNewBoard(6, 7);
                            copyBoard(board, tempBoard);
                            ((ArrayList) tempBoard.get(tempRow)).set(tempColumn, playerNum.charAt(0));

                            if (winning(playerNum, tempBoard) == true) {
                                ((ArrayList) board.get(tempRow)).set(tempColumn, playerNum.charAt(0));
                                comuputerColumnChoice = tempColumn + 1;
                                valid = true;
                                choiceDone = true;
                            }
                        }

                        if (choiceDone == false) {
                            columnChoices.remove(chosenColumn);
                        }
                    }
                }

                // Blocking.
                for (int i = 0; i < waitingTime; ++i);
                if (choiceDone == false) {
                    Random rand = new Random();
                    ArrayList columnChoices = new ArrayList();
                    for (int i = 0; i < 7; ++i) {
                        columnChoices.add(i);
                    }
                    boolean valid = false;
                    while (valid == false && !columnChoices.isEmpty()) {
                        int min = 0;
                        int max = columnChoices.size() - 1;
                        int chosenColumn = rand.nextInt((max - min) + 1) + min;
                        int tempRow = availableRow(board, (int) columnChoices.get(chosenColumn));
                        int tempColumn = (int) columnChoices.get(chosenColumn);
                        if (tempRow != -1) {
                            ArrayList tempBoard = makeNewBoard(6, 7);
                            ArrayList tempBoard2 = makeNewBoard(6, 7);
                            copyBoard(board, tempBoard);
                            copyBoard(tempBoard, tempBoard2);
                            ((ArrayList) tempBoard.get(tempRow)).set(tempColumn, playerNum.charAt(0));

                            if (isGoingToWin(tempBoard, oppositePlayerNum) < isGoingToWin(tempBoard2, oppositePlayerNum)) {
                                ((ArrayList) board.get(tempRow)).set(tempColumn, playerNum.charAt(0));
                                comuputerColumnChoice = tempColumn + 1;
                                valid = true;
                                choiceDone = true;
                            }
                        }

                        if (choiceDone == false) {
                            columnChoices.remove(chosenColumn);
                        }
                    }
                }

                // Random.
                for (int i = 0; i < waitingTime; ++i);
                if (choiceDone == false) {
                    Random rand = new Random();
                    ArrayList columnChoices = new ArrayList();
                    for (int i = 0; i < 7; ++i) {
                        columnChoices.add(i);
                    }
                    boolean valid = false;
                    while (valid == false) {
                        int min = 0;
                        int max = columnChoices.size() - 1;
                        int chosenColumn = rand.nextInt((max - min) + 1) + min;
                        int tempRow = availableRow(board, (int) columnChoices.get(chosenColumn));
                        int tempColumn = (int) columnChoices.get(chosenColumn);
                        if (tempRow != -1) {
                            ((ArrayList) board.get(tempRow)).set(tempColumn, playerNum.charAt(0));
                            comuputerColumnChoice = tempColumn + 1;
                            valid = true;
                            choiceDone = true;
                        }

                        if (choiceDone == false) {
                            columnChoices.remove(chosenColumn);
                        }
                    }
                }

                System.out.println("Player" + playerNum + " chose: " + comuputerColumnChoice);
                for (int i = 0; i < waitingTime; ++i);
            } else {
                // Computer - Hard mode.
                boolean choiceDone = false;
                int comuputerColumnChoice = -1;
                System.out.println("Thinking...");

                // Completing.
                for (int i = 0; i < waitingTime; ++i);
                if (choiceDone == false) {
                    Random rand = new Random();
                    ArrayList columnChoices = new ArrayList();
                    for (int i = 0; i < 7; ++i) {
                        columnChoices.add(i);
                    }
                    boolean valid = false;
                    while (valid == false && !columnChoices.isEmpty()) {
                        int min = 0;
                        int max = columnChoices.size() - 1;
                        int chosenColumn = rand.nextInt((max - min) + 1) + min;
                        int tempRow = availableRow(board, (int) columnChoices.get(chosenColumn));
                        int tempColumn = (int) columnChoices.get(chosenColumn);
                        if (tempRow != -1) {
                            ArrayList tempBoard = makeNewBoard(6, 7);
                            copyBoard(board, tempBoard);
                            ((ArrayList) tempBoard.get(tempRow)).set(tempColumn, playerNum.charAt(0));

                            if (winning(playerNum, tempBoard) == true) {
                                ((ArrayList) board.get(tempRow)).set(tempColumn, playerNum.charAt(0));
                                comuputerColumnChoice = tempColumn + 1;
                                valid = true;
                                choiceDone = true;
                            }
                        }

                        if (choiceDone == false) {
                            columnChoices.remove(chosenColumn);
                        }
                    }
                }

                // Blocking.
                for (int i = 0; i < waitingTime; ++i);
                if (choiceDone == false) {
                    Random rand = new Random();
                    ArrayList columnChoices = new ArrayList();
                    for (int i = 0; i < 7; ++i) {
                        columnChoices.add(i);
                    }
                    boolean valid = false;
                    while (valid == false && !columnChoices.isEmpty()) {
                        int min = 0;
                        int max = columnChoices.size() - 1;
                        int chosenColumn = rand.nextInt((max - min) + 1) + min;
                        int tempRow = availableRow(board, (int) columnChoices.get(chosenColumn));
                        int tempColumn = (int) columnChoices.get(chosenColumn);
                        if (tempRow != -1) {
                            ArrayList tempBoard = makeNewBoard(6, 7);
                            ArrayList tempBoard2 = makeNewBoard(6, 7);
                            copyBoard(board, tempBoard);
                            copyBoard(tempBoard, tempBoard2);
                            ((ArrayList) tempBoard.get(tempRow)).set(tempColumn, playerNum.charAt(0));

                            if (isGoingToWin(tempBoard, oppositePlayerNum) < isGoingToWin(tempBoard2, oppositePlayerNum)) {
                                ((ArrayList) board.get(tempRow)).set(tempColumn, playerNum.charAt(0));
                                comuputerColumnChoice = tempColumn + 1;
                                valid = true;
                                choiceDone = true;
                            }
                        }

                        if (choiceDone == false) {
                            columnChoices.remove(chosenColumn);
                        }
                    }
                }

                // Looking for a chance to get to more than one openning to fill.
                // I.e. opennings that cannot be all blocked on the next move.
                for (int i = 0; i < waitingTime; ++i);
                if (choiceDone == false) {
                    Random rand = new Random();
                    ArrayList columnChoices = new ArrayList();
                    for (int i = 0; i < 7; ++i) {
                        columnChoices.add(i);
                    }
                    boolean valid = false;
                    while (valid == false && !columnChoices.isEmpty()) {
                        int min = 0;
                        int max = columnChoices.size() - 1;
                        int chosenColumn = rand.nextInt((max - min) + 1) + min;
                        int tempRow = availableRow(board, (int) columnChoices.get(chosenColumn));
                        int tempColumn = (int) columnChoices.get(chosenColumn);
                        if (tempRow != -1) {
                            ArrayList tempBoard = makeNewBoard(6, 7);
                            copyBoard(board, tempBoard);
                            ((ArrayList) tempBoard.get(tempRow)).set(tempColumn, playerNum.charAt(0));

                            if (isGoingToWin(tempBoard, oppositePlayerNum) == 0 && isGoingToWin(tempBoard, playerNum) >= 2) {
                                int numOfOppennings = 0;
                                for (int i = 0; i < 7; ++i) {
                                    ArrayList tempBoard2 = makeNewBoard(6, 7);
                                    copyBoard(tempBoard, tempBoard2);
                                    int tempRow2 = availableRow(tempBoard2, i);
                                    if (tempRow2 != -1) {
                                        ((ArrayList) tempBoard2.get(tempRow2)).set(i, playerNum.charAt(0));
                                        if (winning(playerNum, tempBoard2)) {
                                            ++numOfOppennings;
                                        }
                                    }
                                }

                                if (numOfOppennings >= 2) {
                                    System.out.println("\n\nPlayer" + playerNum + " is winning in the next move!!\n\n");
                                    ((ArrayList) board.get(tempRow)).set(tempColumn, playerNum.charAt(0));
                                    comuputerColumnChoice = tempColumn + 1;
                                    valid = true;
                                    choiceDone = true;
                                }
                            }
                        }

                        if (choiceDone == false) {
                            columnChoices.remove(chosenColumn);
                        }
                    }
                }

                // Completing three (without giving a chance for the other player
                // to have three).
                for (int i = 0; i < waitingTime; ++i);
                if (choiceDone == false) {
                    Random rand = new Random();
                    ArrayList columnChoices = new ArrayList();
                    for (int i = 0; i < 7; ++i) {
                        columnChoices.add(i);
                    }
                    boolean valid = false;
                    while (valid == false && !columnChoices.isEmpty()) {
                        int min = 0;
                        int max = columnChoices.size() - 1;
                        int chosenColumn = rand.nextInt((max - min) + 1) + min;
                        int tempRow = availableRow(board, (int) columnChoices.get(chosenColumn));
                        int tempColumn = (int) columnChoices.get(chosenColumn);
                        if (tempRow != -1) {
                            ArrayList tempBoard = makeNewBoard(6, 7);
                            copyBoard(board, tempBoard);
                            ((ArrayList) tempBoard.get(tempRow)).set(tempColumn, playerNum.charAt(0));

                            if (isGoingToWin(tempBoard, oppositePlayerNum) == 0 && isGoingToWin(tempBoard, playerNum) != 0) {
                                ((ArrayList) board.get(tempRow)).set(tempColumn, playerNum.charAt(0));
                                comuputerColumnChoice = tempColumn + 1;
                                valid = true;
                                choiceDone = true;
                            }
                        }

                        if (choiceDone == false) {
                            columnChoices.remove(chosenColumn);
                        }
                    }
                }

                // Not allowing the other player to have the next move a winning
                // one.
                for (int i = 0; i < waitingTime; ++i);
                if (choiceDone == false) {
                    Random rand = new Random();
                    ArrayList columnChoices = new ArrayList();
                    for (int i = 0; i < 7; ++i) {
                        columnChoices.add(i);
                    }
                    boolean valid = false;
                    while (valid == false && !columnChoices.isEmpty()) {
                        int min = 0;
                        int max = columnChoices.size() - 1;
                        int chosenColumn = rand.nextInt((max - min) + 1) + min;
                        int tempRow = availableRow(board, (int) columnChoices.get(chosenColumn));
                        int tempColumn = (int) columnChoices.get(chosenColumn);
                        if (tempRow != -1) {
                            ArrayList tempBoard = makeNewBoard(6, 7);
                            copyBoard(board, tempBoard);
                            ((ArrayList) tempBoard.get(tempRow)).set(tempColumn, playerNum.charAt(0));

                            if (isGoingToWin(tempBoard, oppositePlayerNum) == 0) {
                                ((ArrayList) board.get(tempRow)).set(tempColumn, playerNum.charAt(0));
                                comuputerColumnChoice = tempColumn + 1;
                                valid = true;
                                choiceDone = true;
                            }
                        }

                        if (choiceDone == false) {
                            columnChoices.remove(chosenColumn);
                        }
                    }
                }

                // Random.
                for (int i = 0; i < waitingTime; ++i);
                if (choiceDone == false) {
                    Random rand = new Random();
                    ArrayList columnChoices = new ArrayList();
                    for (int i = 0; i < 7; ++i) {
                        columnChoices.add(i);
                    }
                    boolean valid = false;
                    while (valid == false) {
                        int min = 0;
                        int max = columnChoices.size() - 1;
                        int chosenColumn = rand.nextInt((max - min) + 1) + min;
                        int tempRow = availableRow(board, (int) columnChoices.get(chosenColumn));
                        int tempColumn = (int) columnChoices.get(chosenColumn);
                        if (tempRow != -1) {
                            ((ArrayList) board.get(tempRow)).set(tempColumn, playerNum.charAt(0));
                            comuputerColumnChoice = tempColumn + 1;
                            valid = true;
                            choiceDone = true;
                        }

                        if (choiceDone == false) {
                            columnChoices.remove(chosenColumn);
                        }
                    }
                }

                System.out.println("Player" + playerNum + " chose: " + comuputerColumnChoice);
//                System.out.println("Player" + playerNum + " chose: " + comuputerColumnChoice);
                for (int i = 0; i < waitingTime; ++i);
            }
        } else {
            // Human mode.
            boolean continueChoosing = true;
            while (continueChoosing == true) {
                ArrayList choices = new ArrayList();
                choices.add("1");
                choices.add("2");
                choices.add("3");
                choices.add("4");
                choices.add("5");
                choices.add("6");
                choices.add("7");
                int num = request("Player" + playerNum + ": Choose a column from 1 to 7: ", "Only input a number from 1 to 7.\n" + boardToString(board) + "\n\n", choices).charAt(0) - 48;
                int availableRowNum = availableRow(board, num - 1);

                if (availableRowNum == -1) {
                    System.out.println("This column is full!!");
                    printBoard(board);
                    System.out.println("\n");
                    continueChoosing = true;
                } else {
                    if (playerNum.equals("1")) {
                        ((ArrayList) board.get(availableRowNum)).set(num - 1, '1');
                    } else {
                        ((ArrayList) board.get(availableRowNum)).set(num - 1, '2');
                    }
                    continueChoosing = false;
                }
            }
        }

        if (winning(playerNum, board)
                == true) {
            return 1;
        }

        if (allFull(board)
                == true) {
            return 2;
        }

        return 0;
    }

    public static void printBoard(ArrayList board) {
        System.out.println("\nCurrent board:");

        for (int i = 0; i < ((ArrayList) board.get(0)).size(); ++i) { //     Do you want to play connect 4??
            if (i < ((ArrayList) board.get(0)).size() - 1) {
                System.out.print((i + 1) + " ");
            } else {
                System.out.print((i + 1));
            }
        }

        System.out.println();

        for (int i = 0; i < ((ArrayList) board.get(0)).size(); ++i) { //     Do you want to play connect 4??
            if (i < ((ArrayList) board.get(0)).size() - 1) {
                System.out.print("--");
            } else {
                System.out.print("-");
            }
        }

        System.out.println();

        for (int i = 0; i < board.size(); ++i) {
            for (int j = 0; j < ((ArrayList) board.get(i)).size(); ++j) {
                if (j < ((ArrayList) board.get(i)).size() - 1) {
                    System.out.print((char) ((ArrayList) board.get(i)).get(j) + " ");
                } else {
                    System.out.print((char) ((ArrayList) board.get(i)).get(j));
                }
            }
            if (i < board.size() - 1) {
                System.out.println();
            }
        }
    }

    public static String boardToString(ArrayList board) {
        String out = "";
        out = out.concat("\nCurrent board:\n");

        for (int i = 0; i < ((ArrayList) board.get(0)).size(); ++i) { //     Do you want to play connect 4??
            if (i < ((ArrayList) board.get(0)).size() - 1) {
                out = out.concat((i + 1) + " ");
            } else {
                out = out.concat((i + 1) + "");
            }
        }

        out = out.concat("\n");

        for (int i = 0; i < ((ArrayList) board.get(0)).size(); ++i) { //     Do you want to play connect 4??
            if (i < ((ArrayList) board.get(0)).size() - 1) {
                out = out.concat("--");
            } else {
                out = out.concat("-");
            }
        }

        out = out.concat("\n");

        for (int i = 0; i < board.size(); ++i) {
            for (int j = 0; j < ((ArrayList) board.get(i)).size(); ++j) {
                if (j < ((ArrayList) board.get(i)).size() - 1) {
                    out = out.concat((char) ((ArrayList) board.get(i)).get(j) + " ");
                } else {
                    out = out.concat((char) ((ArrayList) board.get(i)).get(j) + "");
                }
            }
            if (i < board.size() - 1) {
                out = out.concat("\n");
            }
        }
        return out;
    }

    public static void connect4(String you, String opponent, String diffYou, String diffOpponent) {
        ArrayList board = new ArrayList();
        for (int i = 0; i < 6; ++i) {
            ArrayList row = new ArrayList();
            for (int j = 0; j < 7; ++j) {
                row.add('*');
            }
            board.add(row);
        }

        /*
         * Determaines who wins:
         *     0 == Game is still one.
         *     1 == You win.
         *     2 == Opponent wins.
         *     3 == It is a tie.
         */
        int whoWins = 0;
        while (whoWins == 0) {
            boolean continuePlaying = true;
            printBoard(board);
            System.out.println();
            System.out.println();
            String player;
            player = "1";
            int yourRes = responseAndWinningStatus(you, diffYou, player, board);
            if (yourRes == 1) {
                continuePlaying = false;
                whoWins = 1;
            } else if (yourRes == 2) {
                continuePlaying = false;
                whoWins = 3;
            }

            if (continuePlaying == true) {
                printBoard(board);
                System.out.println();
                System.out.println();
                player = "2";
                int opponentRes = responseAndWinningStatus(opponent, diffOpponent, player, board);
                if (opponentRes == 1) {
                    whoWins = 2;
                } else if (opponentRes == 2) {
                    whoWins = 3;
                }
            }
        }

        printBoard(board);
        System.out.println();

        switch (whoWins) {
            case 1:
                System.out.println("\nPlayer 1 wins!!\n");
                break;
            case 2:
                System.out.println("\nPlayer 2 wins!!\n");
                break;
            default:
                System.out.println("\nIt is a tie!!\n");
                break;
        }
    }

    public static void play() {
        ArrayList tempChoices = new ArrayList();
        tempChoices.add("human");
        tempChoices.add("computer");
        String whoAreYou = request("Who are you? (human/computer) ", "Only input \"human\" or \"computer,\" please.\n", tempChoices);
        String opponent = request("Who do you want to be your opponent? (human/computer) ", "Only input \"human\" or \"computer,\" please.\n", tempChoices);
        String diffYou = "None";
        String diffOpponent = "None";

        if (whoAreYou.equals("computer")) {
            tempChoices.clear();
            tempChoices.add("easy");
            tempChoices.add("hard");
            diffOpponent = request("How hard are you? (easy/hard) ", "Only input \"easy\" or \"hard,\" please.\n", tempChoices);
        }

        if (opponent.equals("computer")) {
            tempChoices.clear();
            tempChoices.add("easy");
            tempChoices.add("hard");
            diffOpponent = request("What difficulty do you want to play with? (easy/hard) ", "Only input \"easy\" or \"hard,\" please.\n", tempChoices);
        }
        connect4(whoAreYou, opponent, diffYou, diffOpponent);
    }

    /*
     * Main method
     */
    public static void main(String[] args) {
        boolean repeat = true;
        while (repeat == true) {
            play();
            ArrayList choices = new ArrayList();
            choices.add("y");
            choices.add("n");
            String response = request("Do you want to play again? (y/n) ", "Only input \"y\" or \"n,\" please.\n", choices);
            repeat = response.equals("y");
        }
    }
}