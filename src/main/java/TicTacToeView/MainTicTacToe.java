/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package TicTacToeView;

import GameHouse.FrameNavigator;
import ViewUtama.BackButton;
import ViewUtama.HomeView;
import ViewUtama.ListGameView;

/**
 *
 * @author Rifqi
 */
public class MainTicTacToe extends BackButton {

    /**
     * Creates new form MainTicTacToe
     */
    public MainTicTacToe() {
        initComponents();
        setLocationRelativeTo(null);
        btnBack.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBackMouseClicked(evt);
            }
        });
    }
    
    private void btnBackMouseClicked(java.awt.event.MouseEvent evt) {
        FrameNavigator.switchToFrame(this, new ListGameView());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnDual = new javax.swing.JLabel();
        btnSingle = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Showcard Gothic", 0, 48)); // NOI18N
        jLabel2.setText("Tic Tac Toe");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 190, 280, 120));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 320, -1, -1));

        btnDual.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/btnDual1.png"))); // NOI18N
        btnDual.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDualMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnDualMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDualMouseExited(evt);
            }
        });
        getContentPane().add(btnDual, new org.netbeans.lib.awtextra.AbsoluteConstraints(387, 340, 190, 60));

        btnSingle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/btnSingle1.png"))); // NOI18N
        btnSingle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSingleMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSingleMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSingleMouseExited(evt);
            }
        });
        getContentPane().add(btnSingle, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 410, -1, 60));
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 660, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/background_new.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnDualMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDualMouseEntered
        btnDual.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/btnDual2.png")));
    }//GEN-LAST:event_btnDualMouseEntered

    private void btnDualMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDualMouseExited
        btnDual.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/btnDual1.png")));
    }//GEN-LAST:event_btnDualMouseExited

    private void btnDualMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDualMouseClicked
        FrameNavigator.switchToFrame(this, new TicTacToeDualPlayer());
    }//GEN-LAST:event_btnDualMouseClicked

    private void btnSingleMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSingleMouseEntered
        btnSingle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/btnSingle2.png")));
    }//GEN-LAST:event_btnSingleMouseEntered

    private void btnSingleMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSingleMouseExited
        btnSingle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/btnSingle1.png")));
    }//GEN-LAST:event_btnSingleMouseExited

    private void btnSingleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSingleMouseClicked
        FrameNavigator.switchToFrame(this, new TicTacToeVsAI());
    }//GEN-LAST:event_btnSingleMouseClicked

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
            java.util.logging.Logger.getLogger(MainTicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainTicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainTicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainTicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainTicTacToe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnDual;
    private javax.swing.JLabel btnSingle;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
