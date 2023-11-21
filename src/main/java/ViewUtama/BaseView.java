package ViewUtama;

import GameHouse.FrameNavigator;

public class BaseView extends BackButton {

    
    public BaseView() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblJudul = new javax.swing.JLabel();
        lblSuit = new javax.swing.JLabel();
        lblTicTacToe = new javax.swing.JLabel();
        lblSnake = new javax.swing.JLabel();
        btnSnake = new javax.swing.JLabel();
        btnSuit = new javax.swing.JLabel();
        btnTicTacToe = new javax.swing.JLabel();
        lblBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        lblJudul.setFont(new java.awt.Font("Showcard Gothic", 1, 48)); // NOI18N
        lblJudul.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblJudul.setText("<< Judul >>");
        lblJudul.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lblJudul);
        lblJudul.setBounds(0, 70, 960, 61);

        lblSuit.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        lblSuit.setText("SUIT");
        getContentPane().add(lblSuit);
        lblSuit.setBounds(480, 400, 60, 33);

        lblTicTacToe.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        lblTicTacToe.setText("TIC TAC TOE");
        getContentPane().add(lblTicTacToe);
        lblTicTacToe.setBounds(722, 400, 150, 33);

        lblSnake.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        lblSnake.setText("SNAKE");
        getContentPane().add(lblSnake);
        lblSnake.setBounds(160, 400, 100, 33);

        btnSnake.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/snake.png"))); // NOI18N
        getContentPane().add(btnSnake);
        btnSnake.setBounds(100, 200, 200, 200);

        btnSuit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/suit.png"))); // NOI18N
        getContentPane().add(btnSuit);
        btnSuit.setBounds(410, 200, 200, 200);

        btnTicTacToe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/tictactoe.png"))); // NOI18N
        getContentPane().add(btnTicTacToe);
        btnTicTacToe.setBounds(690, 200, 200, 200);

        lblBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/background_new.png"))); // NOI18N
        lblBackground.setText("jLabel5");
        getContentPane().add(lblBackground);
        lblBackground.setBounds(0, 0, 960, 720);

        pack();
    }// </editor-fold>//GEN-END:initComponents
           
    protected void addClickListener(javax.swing.JLabel button, Runnable action) {
        button.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                action.run();
            }
        });
    }
    
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


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BaseView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel btnSnake;
    public javax.swing.JLabel btnSuit;
    public javax.swing.JLabel btnTicTacToe;
    private javax.swing.JLabel lblBackground;
    public javax.swing.JLabel lblJudul;
    private javax.swing.JLabel lblSnake;
    private javax.swing.JLabel lblSuit;
    private javax.swing.JLabel lblTicTacToe;
    // End of variables declaration//GEN-END:variables
}
