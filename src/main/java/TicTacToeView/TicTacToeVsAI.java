/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package TicTacToeView;

import Blueprint.BoardGame;
import Blueprint.GameResultChecker;
import Blueprint.Score;
import GameHouse.Player;
import GameHouse.TicTacToeAIClass;
import java.awt.Font;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author Rifqi
 */
public class TicTacToeVsAI extends BaseTicTacToe implements BoardGame, GameResultChecker, Score {

    private char[][] board;
    private final TicTacToeAIClass ai;
    private boolean playerTurn;

    /**
     * Creates new form TicTacToeAI
     * @param player
     */
    public TicTacToeVsAI(Player player) {
        super(player);
        initComponents();
        setTitleAndInfo("VS AI", "Computer: O");
        buttons = new JButton[][]{{btn1, btn2, btn3}, {btn4, btn5, btn6}, {btn7, btn8, btn9}};
        board = new char[3][3];
        ai = new TicTacToeAIClass('O', 'X'); // AI menggunakan 'O', pemain menggunakan 'X'            
        // Inisialisasi tombol dan tambahkan ke layout frame
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
                    if (playerTurn && row != -1 && col != -1 && board[row][col] == ' ') {
                        button.setText("X"); // Atur teks pada tombol yang diklik menjadi "X" (langkah pemain)
                        button.setEnabled(false); // Nonaktifkan tombol setelah digunakan
                        board[row][col] = 'X'; // Update 'board' sesuai langkah pemain
                        
                        // Setelah pemain melakukan langkah, giliran AI
                        playerTurn = false;
                        if (!isGameOver()) {
                            performAIMove(); // Lakukan langkah AI setelah pemain
                        }
                    }
                });

            }
        }

        playerTurn = true; // Giliran pemain yang pertama

        initializeBoard();
    }

    private boolean isGameOver() {
        if (ai.evaluate(board) == 10) {
            cekWin('O');
            return true;
        }
        
        if (ai.evaluate(board) == -10) {
            cekWin('X');
            return true;
        }

        // Check if the board is full (draw)
        if (ai.isBoardFull(board)) {
            cekDraw();
            return true;
        }
        return false;
    }

    @Override
    public void add(String status, int score) {
        int currentWin = player.getWinTicTacToe();
        int currentLose = player.getLoseTicTacToe();
        int currentDraw = player.getDrawTicTacToe();
        System.out.println(status);
        switch (status) {
            case "WIN" ->
                player.setWinTicTacToe(currentWin + score);
            case "LOSE" ->
                player.setLoseTicTacToe(currentLose + score);
            default ->
                player.setDrawTicTacToe(currentDraw + score);
        }
    }

    @Override
    public void cekWin(char winner) {
        String message = (winner == 'X') ? "Player" : "AI";
        System.out.println(message+message.equals("Player"));
        if (message.equals("Player")) {
            add("WIN", 1);
        } else {
            add("LOSE", 1);
        }
        message += " wins!";
        JOptionPane.showMessageDialog(this, message);
        resetBoard();
    }

    @Override
    public void cekDraw() {
        JOptionPane.showMessageDialog(this, "It's a draw!");
        add("DRAW", 1);
        resetBoard();
    }

    private void performAIMove() {
        int bestMove = ai.findBestMove(board, WIDTH);
        int row = bestMove / 3;
        int col = bestMove % 3;

        buttons[row][col].setText("O");
        buttons[row][col].setEnabled(false);
        board[row][col] = 'O';
        playerTurn = true;
        isGameOver();
    }

    @Override
    public void initializeBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                buttons[i][j].setText("");
                buttons[i][j].setEnabled(true);
                board[i][j] = ' ';
            }
        }
    }

    @Override
    public void resetBoard() {
        initializeBoard();
        playerTurn = true;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel7.setFont(new java.awt.Font("Showcard Gothic", 0, 18)); // NOI18N
        jLabel7.setText("COMPUTER: O");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(770, 300, 120, 23);

        jLabel3.setFont(new java.awt.Font("Showcard Gothic", 0, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("VS Ai");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(400, 110, 160, 40);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TicTacToeAIClass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TicTacToeAIClass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TicTacToeAIClass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TicTacToeAIClass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TicTacToeVsAI(new Player("bagas")).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables

}
