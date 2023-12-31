package ViewUtama;

import GameHouse.FrameNavigator;
import GameHouse.Player;
import javax.swing.JOptionPane;

public class HomeView extends javax.swing.JFrame {

    private Player player;

    public HomeView() {
        initComponents();
        if (player == null) {
            player = new Player();
            String name = JOptionPane.showInputDialog("Siapa namamu?");
            player.setName(name);
        }
        lblWelcome.setText("Selamat Datang, " + player.getName() + "!");
        setLocationRelativeTo(null);
    }

    public HomeView(Player player) {
        initComponents();
        this.player = player;
        lblWelcome.setText("Selamat Datang, " + player.getName() + "!");
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblJudul = new javax.swing.JLabel();
        btnPlay = new javax.swing.JLabel();
        btnStats = new javax.swing.JLabel();
        btnHow = new javax.swing.JLabel();
        lblWelcome = new javax.swing.JLabel();
        lblBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(960, 720));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblJudul.setFont(new java.awt.Font("Showcard Gothic", 1, 48)); // NOI18N
        lblJudul.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblJudul.setText("GAME HOUSE");
        getContentPane().add(lblJudul, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 100, 950, 90));

        btnPlay.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnPlay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/btnPlay1.png"))); // NOI18N
        btnPlay.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPlayMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnPlayMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnPlayMouseExited(evt);
            }
        });
        getContentPane().add(btnPlay, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 250, 950, 60));

        btnStats.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnStats.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/btnStats1.png"))); // NOI18N
        btnStats.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnStatsMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnStatsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnStatsMouseExited(evt);
            }
        });
        getContentPane().add(btnStats, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 320, 960, 60));

        btnHow.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnHow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/btnHow1.png"))); // NOI18N
        btnHow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnHowMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnHowMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnHowMouseExited(evt);
            }
        });
        getContentPane().add(btnHow, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 390, 950, 60));

        lblWelcome.setFont(new java.awt.Font("Showcard Gothic", 0, 24)); // NOI18N
        lblWelcome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblWelcome.setText("Selamat Datang <<nama>>!");
        getContentPane().add(lblWelcome, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 960, -1));

        lblBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Home.png"))); // NOI18N
        getContentPane().add(lblBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPlayMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPlayMouseEntered
        btnPlay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/btnPlay2.png")));
    }//GEN-LAST:event_btnPlayMouseEntered

    private void btnPlayMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPlayMouseExited
        btnPlay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/btnPlay1.png")));
    }//GEN-LAST:event_btnPlayMouseExited

    private void btnStatsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnStatsMouseEntered
        btnStats.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/btnStats2.png")));
    }//GEN-LAST:event_btnStatsMouseEntered

    private void btnStatsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnStatsMouseExited
        btnStats.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/btnStats1.png")));
    }//GEN-LAST:event_btnStatsMouseExited

    private void btnHowMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHowMouseEntered
        btnHow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/btnHow2.png")));
    }//GEN-LAST:event_btnHowMouseEntered

    private void btnHowMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHowMouseExited
        btnHow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/btnHow1.png")));
    }//GEN-LAST:event_btnHowMouseExited

    private void btnPlayMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPlayMouseClicked
        ListGameView frame = new ListGameView(player);
        FrameNavigator.switchToFrame(this, frame);
    }//GEN-LAST:event_btnPlayMouseClicked

    private void btnStatsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnStatsMouseClicked
        StatsView frame = new StatsView();
        frame.setPlayer(player);
        frame.updateData();
        FrameNavigator.switchToFrame(this, frame);
    }//GEN-LAST:event_btnStatsMouseClicked

    private void btnHowMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHowMouseClicked
        HowToPlayView frame = new HowToPlayView(player);
        FrameNavigator.switchToFrame(this, frame);
    }//GEN-LAST:event_btnHowMouseClicked

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
            java.util.logging.Logger.getLogger(HomeView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomeView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomeView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomeView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomeView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnHow;
    private javax.swing.JLabel btnPlay;
    private javax.swing.JLabel btnStats;
    private javax.swing.JLabel lblBackground;
    private javax.swing.JLabel lblJudul;
    private javax.swing.JLabel lblWelcome;
    // End of variables declaration//GEN-END:variables
}
