/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package TicTacToeView;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author Rifqi
 */
public class TicTacToeVsAI extends javax.swing.JFrame {

    private JButton[][] buttons;
    private char[][] board;
    private TicTacToeAI ai;
    private boolean playerTurn;

    /**
     * Creates new form TicTacToeAI
     */
    public TicTacToeVsAI() {
        initComponents();
        buttons = new JButton[][]{{btn1, btn2, btn3}, {btn4, btn5, btn6}, {btn7, btn8, btn9}};
        board = new char[3][3];
        ai = new TicTacToeAI('O', 'X'); // AI menggunakan 'O', pemain menggunakan 'X'            
        // Inisialisasi tombol dan tambahkan ke layout frame
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                buttons[i][j].setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 40));
                buttons[i][j].addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        JButton button = (JButton) e.getSource();
                        int row = -1, col = -1;

                        // Temukan tombol yang diklik dalam array tombol
                        for (int i = 0; i < 3; i++) {
                            for (int j = 0; j < 3; j++) {
                                if (buttons[i][j] == button) {
                                    row = i;
                                    col = j;
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

                    }

                });
                
            }
        }

        playerTurn = true; // Giliran pemain yang pertama

        initializeBoard();
    }

    private boolean isGameOver() {
        for (int i = 0; i < 3; i++) {
            if (board[i][0] != ' ' && board[i][0] == board[i][1] && board[i][0] == board[i][2]) {
                declareWinner(board[i][0]);
                return true;
            }
        }

        // Check vertical lines
        for (int i = 0; i < 3; i++) {
            if (board[0][i] != ' ' && board[0][i] == board[1][i] && board[0][i] == board[2][i]) {
                declareWinner(board[0][i]);
                return true;
            }
        }

        // Check diagonals
        if (board[0][0] != ' ' && board[0][0] == board[1][1] && board[0][0] == board[2][2]) {
            declareWinner(board[0][0]);
            return true;
        }
        if (board[0][2] != ' ' && board[0][2] == board[1][1] && board[0][2] == board[2][0]) {
            declareWinner(board[0][2]);
            return true;
        }

        // Check if the board is full (draw)
        boolean boardFull = true;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == ' ') {
                    boardFull = false;
                    break;
                }
            }
        }
        if (boardFull) {
            declareDraw();
            return true;
        }

        return false;
    }

    private void declareWinner(char winner) {
        String message = (winner == 'X') ? "Player" : "AI";
        message += " wins!";

        JOptionPane.showMessageDialog(this, message);
        resetBoard();
    }

    private void declareDraw() {
        JOptionPane.showMessageDialog(this, "It's a draw!");
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
        if (!isGameOver()) {
        }
    }

    private void initializeBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                buttons[i][j].setText("");
                buttons[i][j].setEnabled(true);
                board[i][j] = ' ';
            }
        }
    }

    private void resetBoard() {
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

        jLabel2 = new javax.swing.JLabel();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btnBack = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Showcard Gothic", 1, 48)); // NOI18N
        jLabel2.setText("Tic Tac Toe");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(336, 60, 290, 70));
        getContentPane().add(btn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 200, 130, 120));
        getContentPane().add(btn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 200, 130, 120));
        getContentPane().add(btn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 200, 130, 120));
        getContentPane().add(btn4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 340, 130, 120));
        getContentPane().add(btn5, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 340, 130, 120));
        getContentPane().add(btn6, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 340, 130, 120));
        getContentPane().add(btn7, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 480, 130, 120));
        getContentPane().add(btn8, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 480, 130, 120));
        getContentPane().add(btn9, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 480, 130, 120));

        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/btnBack1.png"))); // NOI18N
        btnBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBackMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnBackMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnBackMouseExited(evt);
            }
        });
        getContentPane().add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 640, 130, 60));

        jLabel4.setFont(new java.awt.Font("Showcard Gothic", 0, 18)); // NOI18N
        jLabel4.setText("VS AI");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 130, 50, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/background_new.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBackMouseEntered
        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/btnBack2.png")));
    }//GEN-LAST:event_btnBackMouseEntered

    private void btnBackMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBackMouseExited
        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/btnBack1.png")));
    }//GEN-LAST:event_btnBackMouseExited

    private void btnBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBackMouseClicked
        MainTicTacToe main = new MainTicTacToe();
        main.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnBackMouseClicked

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
            java.util.logging.Logger.getLogger(TicTacToeAI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TicTacToeAI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TicTacToeAI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TicTacToeAI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TicTacToeVsAI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JLabel btnBack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
