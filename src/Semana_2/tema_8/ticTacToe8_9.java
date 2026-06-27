/* 3 stars
(Game: play a tic-tac-toe game) In a game of tic-tac-toe, two players take turns
marking an available cell in a 3 * 3 grid with their respective tokens (either X
or O). When one player has placed three tokens in a horizontal, vertical, or diago-
nal row on the grid, the game is over and that player has won. A draw (no winner)
occurs when all the cells on the grid have been filled with tokens and neither
player has achieved a win. Create a program for playing a tic-tac-toe game.
The program prompts two players to alternately enter an X token and O token.
Whenever a token is entered, the program redisplays the board on the console and
determines the status of the game (win, draw, or continue). Here is a sample run:
 */
package Semana_2.tema_8;

import java.util.Scanner;

public class ticTacToe8_9 {
    public static void main(String[] args) {
        char[][] board = {{' ', ' ', ' '}, {' ', ' ', ' '}, {' ', ' ', ' '}};
        Scanner input = new Scanner(System.in);
        char player = 'X';
        int filled = 0;

        displayBoard(board);

        while (true) {
            System.out.print("Enter a row (0, 1, or 2) for player " + player + ": ");
            int row = input.nextInt();
            System.out.print("Enter a column (0, 1, or 2) for player " + player + ": ");
            int col = input.nextInt();

            if (row < 0 || row > 2 || col < 0 || col > 2 || board[row][col] != ' ') {
                System.out.println("Invalid cell. Try again.");
                continue;
            }

            board[row][col] = player;
            filled++;
            displayBoard(board);

            if (hasWon(board, player)) {
                System.out.println(player + " player won");
                break;
            }

            if (filled == 9) {
                System.out.println("Draw! No winner");
                break;
            }

            player = (player == 'X') ? 'O' : 'X';
        }
    }

    public static void displayBoard(char[][] board) {
        System.out.println("-------------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " | ");
            }
            System.out.println("\n-------------");
        }
    }

    public static boolean hasWon(char[][] board, char player) {
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == player && board[i][1] == player && board[i][2] == player)
                return true;
            if (board[0][i] == player && board[1][i] == player && board[2][i] == player)
                return true;
        }
        if (board[0][0] == player && board[1][1] == player && board[2][2] == player)
            return true;
        if (board[0][2] == player && board[1][1] == player && board[2][0] == player)
            return true;
        return false;
    }
}

