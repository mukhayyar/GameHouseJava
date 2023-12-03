/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package TicTacToeView;

import Blueprint.BoardGame;
import Blueprint.GameResultChecker;
import Blueprint.Score;
import GameHouse.Player;
import java.awt.Font;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author Rifqi
 */
public class TicTacToeDualPlayer extends BaseTicTacToe implements BoardGame, GameResultChecker, Score {

    int nilai;

    /**
     * Creates new form TicTacToeFrame
     * @param player
     */
    public TicTacToeDualPlayer(Player player) {
        super(player);
        initComponents();
        setTitleAndInfo("Dual Player", "Player 2: O");
        buttons = new JButton[][]{{btn1, btn2, btn3}, {btn4, btn5, btn6}, {btn7, btn8, btn9}};
        nilai = 1;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                buttons[i][j].setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 40));
                buttons[i][j].addActionListener((ActionEvent e) -> {
                    JButton button = (JButton) e.getSource();
                    int row = -1, col = -1;
                    // Temukan tombol yang diklik dalam array tombol
                    for (int i1 = 0; i1 < 3; i1++) {
                        for (int j1 = 0; j1 < 3; j1++) {
                            if (buttons[i1][j1] == button) {
                                row = i1;
                                col = j1;
                                break;
                            }
                        }
                    }
                    performMove(row, col);
                });

            }
        }
    }

    private void performMove(int row, int col) {
        if (nilai == 1) {
            buttons[row][col].setText("X");
            buttons[row][col].setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 40));
            buttons[row][col].setEnabled(false);
            nilai -= 1;
            cekWin('X');
        } else {
            buttons[row][col].setText("O");
            buttons[row][col].setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 40));
            buttons[row][col].setEnabled(false);
            nilai += 1;
            cekWin('O');
        }
    }


    @Override
    public void add(String status, int score) {
        int currentWin = player.getWinTicTacToe();
        int currentLose = player.getLoseTicTacToe();
        int currentDraw = player.getDrawTicTacToe();

        switch (status) {
            case "WIN" ->
                player.setWinTicTacToe(currentWin + score);
            case "LOSE" ->
                player.setLoseTicTacToe(currentLose + score);
            default ->
                player.setDrawTicTacToe(currentDraw + score);
        }
    }

    private boolean isGameOver(char player) {
        for (int i = 0; i < 3; i++) {
            if ((buttons[i][0].getText().equals(String.valueOf(player))
                    && buttons[i][1].getText().equals(String.valueOf(player))
                    && buttons[i][2].getText().equals(String.valueOf(player)))
                    || (buttons[0][i].getText().equals(String.valueOf(player))
                    && buttons[1][i].getText().equals(String.valueOf(player))
                    && buttons[2][i].getText().equals(String.valueOf(player)))) {
                return true;
            }
        }

        // Pengecekan diagonal
        if ((buttons[0][0].getText().equals(String.valueOf(player))
                && buttons[1][1].getText().equals(String.valueOf(player))
                && buttons[2][2].getText().equals(String.valueOf(player)))
                || (buttons[0][2].getText().equals(String.valueOf(player))
                && buttons[1][1].getText().equals(String.valueOf(player))
                && buttons[2][0].getText().equals(String.valueOf(player)))) {
            return true;
        }

        return false;
    }

    @Override
    public void cekWin(char winner) {
        if (isGameOver(winner) && winner == 'X') {
            JOptionPane.showMessageDialog(rootPane, "X win !!");
            add("WIN", 1);
            resetBoard();
        }
        if (isGameOver(winner) && winner == 'O') {
            JOptionPane.showMessageDialog(rootPane, "O win !!");
            add("LOSE", 1);
            resetBoard();
        }
        System.out.println(isGameOver(winner) + " - " + winner);

        cekDraw();
    }

    @Override
    public void cekDraw() {
        if (!btn1.isEnabled() && !btn2.isEnabled() && !btn3.isEnabled()
                && !btn4.isEnabled() && !btn5.isEnabled() && !btn6.isEnabled()
                && !btn7.isEnabled() && !btn8.isEnabled() && !btn9.isEnabled()) {
            JOptionPane.showMessageDialog(rootPane, "It's a draw!");
            add("DRAW", 1);
            resetBoard();
        }
    }

    @Override
    public void initializeBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                buttons[i][j].setText("");
                buttons[i][j].setEnabled(true);
            }
        }
    }

    @Override
    public void resetBoard() {
        nilai = 1;
        initializeBoard();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Showcard Gothic", 0, 18)); // NOI18N
        jLabel6.setText("PLAYER 2: O");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 300, -1, -1));

        jLabel3.setFont(new java.awt.Font("Showcard Gothic", 0, 24)); // NOI18N
        jLabel3.setText("Dual Player");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 110, 160, 40));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TicTacToeDualPlayer(new Player("bagas")).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables

}
