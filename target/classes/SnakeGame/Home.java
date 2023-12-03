package SnakeGame;

import Blueprint.Game;
import GameHouse.FrameNavigator;
import GameHouse.Player;
import ViewUtama.BackButton;
import ViewUtama.ListGameView;
import javax.swing.JFrame;

public class Home extends BackButton implements Game {
    private final Player player;
    private final String nama;
    public Home(Player player) {
        this.player = player;
        this.nama = player.getName();
        initComponents();
        label_welcome.setText("Selamat Datang "+ nama);
        addClickListener(btnBack,
                () -> FrameNavigator.switchToFrame(this, new ListGameView(player)));
    }

    @Override
    public void play(String pilih){
        this.dispose();
        JFrame frame = new JFrame("Snake Game");
        SnakeGame game = new SnakeGame(600, 600,nama,player);
        frame.add(game);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnPlay = new javax.swing.JLabel();
        lblJudul = new javax.swing.JLabel();
        label_welcome = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(960, 720));
        setMinimumSize(new java.awt.Dimension(960, 720));
        setPreferredSize(new java.awt.Dimension(960, 720));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        getContentPane().add(btnPlay, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, 950, 60));

        lblJudul.setFont(new java.awt.Font("Showcard Gothic", 1, 48)); // NOI18N
        lblJudul.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblJudul.setText("SNAKE GAME");
        lblJudul.setDisplayedMnemonicIndex(1);
        getContentPane().add(lblJudul, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 171, -1, -1));

        label_welcome.setFont(new java.awt.Font("Segoe UI Black", 2, 14)); // NOI18N
        label_welcome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(label_welcome, new org.netbeans.lib.awtextra.AbsoluteConstraints(313, 120, 300, 30));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/snakeView.png"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -40, 970, 800));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnPlayMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPlayMouseClicked
        play("default");
    }//GEN-LAST:event_btnPlayMouseClicked

    private void btnPlayMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPlayMouseEntered
        btnPlay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/btnPlay2.png")));
    }//GEN-LAST:event_btnPlayMouseEntered

    private void btnPlayMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPlayMouseExited
        btnPlay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/btnPlay1.png")));
    }//GEN-LAST:event_btnPlayMouseExited
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JLabel btnPlay;
    private javax.swing.JLabel label_welcome;
    private javax.swing.JLabel lblJudul;
    // End of variables declaration//GEN-END:variables
}
