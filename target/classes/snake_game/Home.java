package snake_game;

import javax.swing.JFrame;

public class Home extends javax.swing.JFrame {
    private String nama;
    public Home(String nama) {
        this.nama = nama;
        initComponents();
        label_welcome.setText("Selamat Datang "+ nama);
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnPlay = new javax.swing.JButton();
        label_welcome = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(960, 720));
        setMinimumSize(new java.awt.Dimension(960, 720));
        setPreferredSize(new java.awt.Dimension(960, 720));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Showcard Gothic", 1, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SNAKE GAME");
        jLabel1.setDisplayedMnemonicIndex(1);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 171, -1, -1));

        btnPlay.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        btnPlay.setForeground(new java.awt.Color(0, 102, 102));
        btnPlay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/btnPlay1.png"))); // NOI18N
        btnPlay.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.gray, java.awt.Color.white, null, null));
        btnPlay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlayActionPerformed(evt);
            }
        });
        getContentPane().add(btnPlay, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 290, 150, 60));

        label_welcome.setFont(new java.awt.Font("Segoe UI Black", 2, 14)); // NOI18N
        label_welcome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(label_welcome, new org.netbeans.lib.awtextra.AbsoluteConstraints(313, 120, 300, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/btnBack1.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(407, 390, 130, 80));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/background_new.png"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -40, 970, 800));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnPlayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlayActionPerformed
        this.dispose();
        JFrame frame = new JFrame("Snake Game");
        SnakeGame game = new SnakeGame(600, 600,nama);
        frame.add(game);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    
    }//GEN-LAST:event_btnPlayActionPerformed

    private void simpanFunction()
    {
        this.dispose();
        JFrame frame = new JFrame("Snake Game");
        SnakeGame game = new SnakeGame(600, 600,nama);
        frame.add(game);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JButton btnPlay;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel label_welcome;
    // End of variables declaration//GEN-END:variables
}
