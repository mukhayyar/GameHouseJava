/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package TicTacToeView;

import Blueprint.BoardGame;
import Blueprint.Score;
import GameHouse.FrameNavigator;
import GameHouse.Player;
import ViewUtama.BackButton;
import java.awt.Font;
import javax.swing.JOptionPane;

/**
 *
 * @author Rifqi
 */
public class TicTacToeDualPlayer extends BaseTicTacToe implements BoardGame, Score {

    private Player player;
    int nilai, nilaiX, nilaiO;

    /**
     * Creates new form TicTacToeFrame
     */
    public TicTacToeDualPlayer(Player player) {
        initComponents();
        setTitleAndInfo("Dual Player", "Player 2: O");
        this.player = player;
        nilai = 1;
        nilaiX = 0;
        nilaiO = 0;
    }

    @Override
    protected void btnBackMouseClicked(java.awt.event.MouseEvent evt) {
        FrameNavigator.switchToFrame(this, new MainTicTacToe(player));
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

    @Override
    public void cekWin(char winner) {
        if (btn1.getText() == "X" && btn2.getText() == "X" && btn3.getText() == "X") {
            JOptionPane.showMessageDialog(rootPane, "X win !!");
            add("WIN", 1);
            resetBoard();
        } else if (btn4.getText() == "X" && btn5.getText() == "X" && btn6.getText() == "X") {
            JOptionPane.showMessageDialog(rootPane, "X win !!");
            add("WIN", 1);
            resetBoard();
        } else if (btn7.getText() == "X" && btn8.getText() == "X" && btn9.getText() == "X") {
            JOptionPane.showMessageDialog(rootPane, "X win !!");
            add("WIN", 1);
            resetBoard();
        } else if (btn1.getText() == "X" && btn5.getText() == "X" && btn9.getText() == "X") {
            JOptionPane.showMessageDialog(rootPane, "X win !!");
            add("WIN", 1);
            resetBoard();
        } else if (btn3.getText() == "X" && btn5.getText() == "X" && btn7.getText() == "X") {
            JOptionPane.showMessageDialog(rootPane, "X win !!");
            add("WIN", 1);
            resetBoard();
        } else if (btn1.getText() == "X" && btn4.getText() == "X" && btn7.getText() == "X") {
            JOptionPane.showMessageDialog(rootPane, "X win !!");
            add("WIN", 1);
            resetBoard();
        } else if (btn2.getText() == "X" && btn5.getText() == "X" && btn8.getText() == "X") {
            JOptionPane.showMessageDialog(rootPane, "X win !!");
            add("WIN", 1);
            resetBoard();
        } else if (btn3.getText() == "X" && btn6.getText() == "X" && btn9.getText() == "X") {
            JOptionPane.showMessageDialog(rootPane, "X win !!");
            add("WIN", 1);
            resetBoard();
        }

        if (btn1.getText() == "O" && btn2.getText() == "O" && btn3.getText() == "O") {
            JOptionPane.showMessageDialog(rootPane, "O win !!");
            add("LOSE", 1);
            resetBoard();
        } else if (btn4.getText() == "O" && btn5.getText() == "O" && btn6.getText() == "O") {
            JOptionPane.showMessageDialog(rootPane, "O win !!");
            add("LOSE", 1);
            resetBoard();
        } else if (btn7.getText() == "O" && btn8.getText() == "O" && btn9.getText() == "O") {
            JOptionPane.showMessageDialog(rootPane, "O win !!");
            add("LOSE", 1);
            resetBoard();
        } else if (btn1.getText() == "O" && btn5.getText() == "O" && btn9.getText() == "O") {
            JOptionPane.showMessageDialog(rootPane, "O win !!");
            add("LOSE", 1);
            resetBoard();
        } else if (btn3.getText() == "O" && btn5.getText() == "O" && btn7.getText() == "O") {
            JOptionPane.showMessageDialog(rootPane, "O win !!");
            add("LOSE", 1);
            resetBoard();
        } else if (btn1.getText() == "O" && btn4.getText() == "O" && btn7.getText() == "O") {
            JOptionPane.showMessageDialog(rootPane, "O win !!");
            add("LOSE", 1);
            resetBoard();
        } else if (btn2.getText() == "O" && btn5.getText() == "O" && btn8.getText() == "O") {
            JOptionPane.showMessageDialog(rootPane, "O win !!");
            add("LOSE", 1);
            resetBoard();
        } else if (btn3.getText() == "O" && btn6.getText() == "O" && btn9.getText() == "O") {
            JOptionPane.showMessageDialog(rootPane, "O win !!");
            add("LOSE", 1);
            resetBoard();
        }
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
    public void resetBoard() {
        nilai = 1;
        nilaiX = 0;
        nilaiO = 0;

        btn1.setText("");
        btn1.setEnabled(true);
        btn2.setText("");
        btn2.setEnabled(true);
        btn3.setText("");
        btn3.setEnabled(true);
        btn4.setText("");
        btn4.setEnabled(true);
        btn5.setText("");
        btn5.setEnabled(true);
        btn6.setText("");
        btn6.setEnabled(true);
        btn7.setText("");
        btn7.setEnabled(true);
        btn8.setText("");
        btn8.setEnabled(true);
        btn9.setText("");
        btn9.setEnabled(true);
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

    @Override
    protected void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        if (nilai == 1) {
            btn2.setText("X");
            btn2.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 40));
            btn2.setEnabled(false);
            nilai -= 1;
            nilaiX += 1;

            cekWin('x');
        } else {
            btn2.setText("O");
            btn2.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 40));
            btn2.setEnabled(false);
            nilai += 1;
            nilaiO += 1;

            cekWin('x');
        }
    }//GEN-LAST:event_btn2ActionPerformed

    @Override
    protected void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        if (nilai == 1) {
            btn3.setText("X");
            btn3.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 40));
            btn3.setEnabled(false);
            nilai -= 1;
            nilaiX += 1;

            cekWin('x');
        } else {
            btn3.setText("O");
            btn3.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 40));
            btn3.setEnabled(false);
            nilai += 1;
            nilaiO += 1;

            cekWin('x');
        }
    }//GEN-LAST:event_btn3ActionPerformed

    @Override
    protected void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        if (nilai == 1) {
            btn4.setText("X");
            btn4.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 40));
            btn4.setEnabled(false);
            nilai -= 1;
            nilaiX += 1;

            cekWin('x');
        } else {
            btn4.setText("O");
            btn4.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 40));
            btn4.setEnabled(false);
            nilai += 1;
            nilaiO += 1;

            cekWin('x');
        }
    }//GEN-LAST:event_btn4ActionPerformed

    @Override
    protected void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        if (nilai == 1) {
            btn6.setText("X");
            btn6.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 40));
            btn6.setEnabled(false);
            nilai -= 1;
            nilaiX += 1;

            cekWin('x');
        } else {
            btn6.setText("O");
            btn6.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 40));
            btn6.setEnabled(false);
            nilai += 1;
            nilaiO += 1;

            cekWin('x');
        }
    }//GEN-LAST:event_btn6ActionPerformed

    @Override
    protected void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        if (nilai == 1) {
            btn7.setText("X");
            btn7.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 40));
            btn7.setEnabled(false);
            nilai -= 1;
            nilaiX += 1;

            cekWin('x');
        } else {
            btn7.setText("O");
            btn7.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 40));
            btn7.setEnabled(false);
            nilai += 1;
            nilaiO += 1;

            cekWin('x');
        }
    }//GEN-LAST:event_btn7ActionPerformed

    @Override
    protected void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        if (nilai == 1) {
            btn8.setText("X");
            btn8.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 40));
            btn8.setEnabled(false);
            nilai -= 1;
            nilaiX += 1;

            cekWin('x');
        } else {
            btn8.setText("O");
            btn8.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 40));
            btn8.setEnabled(false);
            nilai += 1;
            nilaiO += 1;

            cekWin('x');
        }
    }//GEN-LAST:event_btn8ActionPerformed

    @Override
    protected void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        if (nilai == 1) {
            btn9.setText("X");
            btn9.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 40));
            btn9.setEnabled(false);
            nilai -= 1;
            nilaiX += 1;

            cekWin('x');
        } else {
            btn9.setText("O");
            btn9.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 40));
            btn9.setEnabled(false);
            nilai += 1;
            nilaiO += 1;

            cekWin('x');
        }
    }//GEN-LAST:event_btn9ActionPerformed

    @Override
    protected void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        if (nilai == 1) {
            btn1.setText("X");
            btn1.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 40));
            btn1.setEnabled(false);
            nilai -= 1;
            nilaiX += 1;

            cekWin('x');
        } else {
            btn1.setText("O");
            btn1.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 40));
            btn1.setEnabled(false);
            nilai += 1;
            nilaiO += 1;

            cekWin('x');
        }
    }//GEN-LAST:event_btn1ActionPerformed

    @Override
    protected void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        if (nilai == 1) {
            btn5.setText("X");
            btn5.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 40));
            btn5.setEnabled(false);
            nilai -= 1;
            nilaiX += 1;

            cekWin('x');
        } else {
            btn5.setText("O");
            btn5.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 40));
            btn5.setEnabled(false);
            nilai += 1;
            nilaiO += 1;

            cekWin('x');
        }
    }

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
            java.util.logging.Logger.getLogger(TicTacToeDualPlayer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TicTacToeDualPlayer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TicTacToeDualPlayer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TicTacToeDualPlayer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TicTacToeDualPlayer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TicTacToeDualPlayer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TicTacToeDualPlayer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TicTacToeDualPlayer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

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
