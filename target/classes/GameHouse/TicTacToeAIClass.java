/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GameHouse;

/**
 *
 * @author Rifqi
 */
public class TicTacToeAIClass {

    private final char computerPlayer;
    private final char opponentPlayer;

    public TicTacToeAIClass(char computerPlayer, char opponentPlayer) {
        this.computerPlayer = computerPlayer;
        this.opponentPlayer = opponentPlayer;
    }

    public int findBestMove(char[][] board, int depth) {
        int bestMove = -1;
        int bestScore = Integer.MIN_VALUE;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == ' ') {
                    board[i][j] = computerPlayer;
                    int score = minimax(board, depth + 1, false, Integer.MIN_VALUE, Integer.MAX_VALUE);
                    board[i][j] = ' '; // Undo move

                    if (score > bestScore) {
                        bestScore = score;
                        bestMove = i * 3 + j;
                    }
                }
            }
        }

        return bestMove;
    }

    private int minimax(char[][] board, int depth, boolean isMaximizingPlayer, int alpha, int beta) {
        int score = evaluate(board);

        if (score == 10 || score == -10 || isBoardFull(board) || depth >= 6) {
            return score;
        }

        if (isMaximizingPlayer) {
            int bestScore = Integer.MIN_VALUE;

            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (board[i][j] == ' ') {
                        board[i][j] = computerPlayer;
                        bestScore = Math.max(bestScore, minimax(board, depth + 1, false, alpha, beta));
                        board[i][j] = ' '; // Undo move
                        alpha = Math.max(alpha, bestScore);

                        if (beta <= alpha) {
                            break;
                        }
                    }
                }
            }

            return bestScore;
        } else {
            int bestScore = Integer.MAX_VALUE;

            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (board[i][j] == ' ') {
                        board[i][j] = opponentPlayer;
                        bestScore = Math.min(bestScore, minimax(board, depth + 1, true, alpha, beta));
                        board[i][j] = ' '; // Undo move
                        beta = Math.min(beta, bestScore);

                        if (beta <= alpha) {
                            break;
                        }
                    }
                }
            }

            return bestScore;
        }
    }

    public int evaluate(char[][] board) {
        if (checkWinner(board, computerPlayer)) {
            return 10; // Jika AI menang, berikan skor 10
        } // Mengecek baris, kolom, dan diagonal untuk kemenangan pemain manusia
        else if (checkWinner(board, opponentPlayer)) {
            return -10; // Jika pemain menang, berikan skor -10
        }

        return 0;
    }

    public boolean isBoardFull(char[][] board) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }

    private boolean checkWinner(char[][] board, char player) {
        // Pengecekan baris dan kolom
        for (int i = 0; i < 3; i++) {
            if ((board[i][0] == player && board[i][1] == player && board[i][2] == player)
                    || (board[0][i] == player && board[1][i] == player && board[2][i] == player)) {
                return true;
            }
        }

        // Pengecekan diagonal
        if ((board[0][0] == player && board[1][1] == player && board[2][2] == player)
                || (board[0][2] == player && board[1][1] == player && board[2][0] == player)) {
            return true;
        }

        return false;
    }

}
