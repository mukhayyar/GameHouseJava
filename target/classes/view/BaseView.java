package View;
public class BaseView extends javax.swing.JFrame {

    
    public BaseView() {
        initComponents();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblJudul = new javax.swing.JLabel();
        lblSuit = new javax.swing.JLabel();
        lblTicTacToe = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnSnake = new javax.swing.JLabel();
        btnSuit = new javax.swing.JLabel();
        btnTicTacToe = new javax.swing.JLabel();
        btnBack = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblJudul.setFont(new java.awt.Font("Showcard Gothic", 1, 48)); // NOI18N
        lblJudul.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblJudul.setText("<<judul>>");
        lblJudul.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lblJudul, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 960, -1));

        lblSuit.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        lblSuit.setText("SUIT");
        getContentPane().add(lblSuit, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 400, -1, -1));

        lblTicTacToe.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        lblTicTacToe.setText("TicTacToe");
        getContentPane().add(lblTicTacToe, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 400, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        jLabel4.setText("SNAKE");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 400, -1, -1));

        btnSnake.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/snake.png"))); // NOI18N
        getContentPane().add(btnSnake, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, -1, -1));

        btnSuit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/suit.png"))); // NOI18N
        getContentPane().add(btnSuit, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 200, -1, -1));

        btnTicTacToe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/tictactoe.png"))); // NOI18N
        btnTicTacToe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTicTacToeMouseClicked(evt);
            }
        });
        getContentPane().add(btnTicTacToe, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 200, -1, -1));

        btnBack.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/btnBack1.png"))); // NOI18N
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
        getContentPane().add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 620, 960, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/background_new.png"))); // NOI18N
        jLabel5.setText("jLabel5");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBackMouseEntered
        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/btnBack2.png")));
    }//GEN-LAST:event_btnBackMouseEntered

    private void btnBackMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBackMouseExited
        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/btnBack1.png")));
    }//GEN-LAST:event_btnBackMouseExited

    private void btnBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBackMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBackMouseClicked

    private void btnTicTacToeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTicTacToeMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTicTacToeMouseClicked
           
    
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
            java.util.logging.Logger.getLogger(BaseView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BaseView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BaseView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BaseView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BaseView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnBack;
    public javax.swing.JLabel btnSnake;
    public javax.swing.JLabel btnSuit;
    public javax.swing.JLabel btnTicTacToe;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    public javax.swing.JLabel lblJudul;
    private javax.swing.JLabel lblSuit;
    private javax.swing.JLabel lblTicTacToe;
    // End of variables declaration//GEN-END:variables
}
