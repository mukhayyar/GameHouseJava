package SuitGame;

import Blueprint.GameResultChecker;
import Blueprint.Score;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import GameHouse.FrameNavigator;
import GameHouse.Player;
import ViewUtama.BackButton;

public class SuitGame_View extends BackButton implements GameResultChecker, Score {

    private final Player player;
    JFrame frame;
    boolean status = false;

    @Override
    public void cekDraw() {

    }

    enum SUIT {
        BATU,
        KERTAS,
        GUNTING
    }

    enum HASIL {
        MENANG,
        KALAH,
        SERI
    }

    public SuitGame_View(Player player) {
        initComponents();
        this.player = player;
        addClickListener(btnBack,
                () -> FrameNavigator.switchToFrame(this, new ViewSuit(player)));
    }

    @Override
    public void add(String status, int score) {
        int currentWin = player.getWinSuit();
        int currentLose = player.getLoseSuit();
        int currentDraw = player.getDrawSuit();

        switch (status) {
            case "WIN" -> player.setWinSuit(currentWin + score);
            case "LOSE" -> player.setLoseSuit(currentLose + score);
            default -> player.setDrawSuit(currentDraw + score);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtC8 = new javax.swing.JTextField();
        txtC7 = new javax.swing.JTextField();
        txtC6 = new javax.swing.JTextField();
        txtC5 = new javax.swing.JTextField();
        txtC4 = new javax.swing.JTextField();
        txtC3 = new javax.swing.JTextField();
        txtC2 = new javax.swing.JTextField();
        txtC1 = new javax.swing.JTextField();
        lblCpu = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnLanjut = new javax.swing.JLabel();
        btnUlang = new javax.swing.JLabel();
        txtY1 = new javax.swing.JTextField();
        lblYou = new javax.swing.JLabel();
        txtY2 = new javax.swing.JTextField();
        txtY3 = new javax.swing.JTextField();
        txtY4 = new javax.swing.JTextField();
        txtY5 = new javax.swing.JTextField();
        txtY6 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        k2 = new javax.swing.JLabel();
        g2 = new javax.swing.JLabel();
        b2 = new javax.swing.JLabel();
        b1 = new javax.swing.JLabel();
        g1 = new javax.swing.JLabel();
        k1 = new javax.swing.JLabel();
        txtY7 = new javax.swing.JTextField();
        txtY8 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtC8.setFont(new java.awt.Font("DigifaceWide", 1, 24)); // NOI18N
        txtC8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtC8.setText("0");
        txtC8.setEnabled(false);
        getContentPane().add(txtC8, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 520, 62, 45));

        txtC7.setFont(new java.awt.Font("DigifaceWide", 1, 24)); // NOI18N
        txtC7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtC7.setEnabled(false);
        getContentPane().add(txtC7, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 520, 62, 45));

        txtC6.setFont(new java.awt.Font("DigifaceWide", 1, 24)); // NOI18N
        txtC6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtC6.setEnabled(false);
        getContentPane().add(txtC6, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 520, 62, 45));

        txtC5.setFont(new java.awt.Font("DigifaceWide", 1, 24)); // NOI18N
        txtC5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtC5.setEnabled(false);
        getContentPane().add(txtC5, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 520, 62, 45));

        txtC4.setFont(new java.awt.Font("DigifaceWide", 1, 24)); // NOI18N
        txtC4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtC4.setEnabled(false);
        getContentPane().add(txtC4, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 520, 62, 45));

        txtC3.setFont(new java.awt.Font("DigifaceWide", 1, 24)); // NOI18N
        txtC3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtC3.setEnabled(false);
        getContentPane().add(txtC3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 520, 62, 45));

        txtC2.setFont(new java.awt.Font("DigifaceWide", 1, 24)); // NOI18N
        txtC2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtC2.setEnabled(false);
        getContentPane().add(txtC2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 520, 62, 45));

        txtC1.setFont(new java.awt.Font("DigifaceWide", 1, 24)); // NOI18N
        txtC1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtC1.setEnabled(false);
        getContentPane().add(txtC1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 520, 62, 45));

        lblCpu.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        lblCpu.setText("CPU");
        getContentPane().add(lblCpu, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 530, -1, -1));

        jLabel1.setFont(new java.awt.Font("Showcard Gothic", 0, 48)); // NOI18N
        jLabel1.setText("Suit Game");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 17, 250, 60));

        btnLanjut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/btnLanjut1.png"))); // NOI18N
        btnLanjut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLanjutMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnLanjutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnLanjutMouseExited(evt);
            }
        });
        getContentPane().add(btnLanjut, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 370, -1, -1));

        btnUlang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/btnUlang1.png"))); // NOI18N
        btnUlang.setText("jLabel5");
        btnUlang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnUlangMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnUlangMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnUlangMouseExited(evt);
            }
        });
        getContentPane().add(btnUlang, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 370, 110, 50));

        txtY1.setFont(new java.awt.Font("DigifaceWide", 1, 24)); // NOI18N
        txtY1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtY1.setEnabled(false);
        getContentPane().add(txtY1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 440, 62, 45));

        lblYou.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        lblYou.setText("YOU");
        getContentPane().add(lblYou, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 450, -1, -1));

        txtY2.setFont(new java.awt.Font("DigifaceWide", 1, 24)); // NOI18N
        txtY2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtY2.setEnabled(false);
        getContentPane().add(txtY2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 440, 62, 45));

        txtY3.setFont(new java.awt.Font("DigifaceWide", 1, 24)); // NOI18N
        txtY3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtY3.setEnabled(false);
        getContentPane().add(txtY3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 440, 62, 45));

        txtY4.setFont(new java.awt.Font("DigifaceWide", 1, 24)); // NOI18N
        txtY4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtY4.setEnabled(false);
        getContentPane().add(txtY4, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 440, 62, 45));

        txtY5.setFont(new java.awt.Font("DigifaceWide", 1, 24)); // NOI18N
        txtY5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtY5.setEnabled(false);
        getContentPane().add(txtY5, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 440, 62, 45));

        txtY6.setFont(new java.awt.Font("DigifaceWide", 1, 24)); // NOI18N
        txtY6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtY6.setEnabled(false);
        getContentPane().add(txtY6, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 440, 62, 45));

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel2.setText("YOU");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 380, -1, -1));

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel3.setText("Computer");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 380, -1, -1));

        k2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/ck2.png"))); // NOI18N
        getContentPane().add(k2, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 260, -1, -1));

        g2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/cg2.png"))); // NOI18N
        getContentPane().add(g2, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 160, -1, -1));

        b2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/cb2.png"))); // NOI18N
        b2.setFocusCycleRoot(true);
        getContentPane().add(b2, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 60, -1, -1));

        b1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/b2.png"))); // NOI18N
        b1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b1MouseClicked(evt);
            }
        });
        getContentPane().add(b1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, -1, -1));

        g1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/g2.png"))); // NOI18N
        g1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                g1MouseClicked(evt);
            }
        });
        getContentPane().add(g1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, -1, -1));

        k1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/k2.png"))); // NOI18N
        k1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                k1MouseClicked(evt);
            }
        });
        getContentPane().add(k1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 260, -1, -1));

        txtY7.setFont(new java.awt.Font("DigifaceWide", 1, 24)); // NOI18N
        txtY7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtY7.setEnabled(false);
        getContentPane().add(txtY7, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 440, 62, 45));

        txtY8.setFont(new java.awt.Font("DigifaceWide", 1, 24)); // NOI18N
        txtY8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtY8.setText("0");
        txtY8.setEnabled(false);
        getContentPane().add(txtY8, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 440, 62, 45));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/SuitViewGame.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void initPosition() {
        b1.setBounds(130, 60, b1.getWidth(), b1.getHeight());
        g1.setBounds(130, 160, g1.getWidth(), g1.getHeight());
        k1.setBounds(130, 260, k1.getWidth(), k1.getHeight());

        b2.setBounds(710, 60, b2.getWidth(), b2.getHeight());
        g2.setBounds(710, 160, g2.getWidth(), g2.getHeight());
        k2.setBounds(710, 260, k2.getWidth(), k2.getHeight());
        status = false;
    }

    private void resetPoin(String ket) {
        initPosition();
        if (ket.equals("ALL")) {
            txtC1.setText("");
            txtC2.setText("");
            txtC3.setText("");
            txtC4.setText("");
            txtC5.setText("");
            txtC6.setText("");
            txtC7.setText("");
            txtC8.setText("0");

            txtY1.setText("");
            txtY2.setText("");
            txtY3.setText("");
            txtY4.setText("");
            txtY5.setText("");
            txtY6.setText("");
            txtY7.setText("");
            txtY8.setText("0");
        }
    }

    private int random() {
        int nilai;
        Random acak = new Random();
        int n = 3;
        nilai = acak.nextInt(n + 1);
        return nilai;
    }

    private void fight(SUIT suit) {
        int nilaiAcak;
        nilaiAcak = random();
        switch (nilaiAcak) {
            case 1 -> {
                b2.setBounds(490, 169, b2.getWidth(), b2.getHeight());
                if (suit == SUIT.KERTAS) {
                    cekWin('1');
                } else if (suit == SUIT.GUNTING) {
                    cekWin('0');
                }
            }
            case 2 -> {
                g2.setBounds(490, 160, g2.getWidth(), g2.getHeight());
                if (suit == SUIT.BATU) {
                    cekWin('1');
                } else if (suit == SUIT.KERTAS) {
                    cekWin('0');
                }
            }
            default -> {
                k2.setBounds(490, 160, k2.getWidth(), k2.getHeight());
                if (suit == SUIT.GUNTING) {
                    cekWin('1');
                } else if (suit == SUIT.BATU) {
                    cekWin('0');
                }
            }
        }
    }

    @Override
    public void cekWin(char winner) {
        String ket = String.valueOf(winner);
        if (ket.equals("1")) {
            if (txtY1.getText().equals("")) {
                txtY1.setText("V");
                txtC1.setText("-");
                txtY8.setText(String.valueOf(Integer.parseInt(txtY8.getText()) + 5));
            } else if (txtY2.getText().equals("")) {
                txtY2.setText("V");
                txtC2.setText("-");
                txtY8.setText(String.valueOf(Integer.parseInt(txtY8.getText()) + 5));
            } else if (txtY3.getText().equals("")) {
                txtY3.setText("V");
                txtC3.setText("-");
                txtY8.setText(String.valueOf(Integer.parseInt(txtY8.getText()) + 5));
            } else if (txtY4.getText().equals("")) {
                txtY4.setText("V");
                txtC4.setText("-");
                txtY8.setText(String.valueOf(Integer.parseInt(txtY8.getText()) + 5));
            } else if (txtY5.getText().equals("")) {
                txtY5.setText("V");
                txtC5.setText("-");
                txtY8.setText(String.valueOf(Integer.parseInt(txtY8.getText()) + 5));
            } else if (txtY6.getText().equals("")) {
                txtY6.setText("V");
                txtC6.setText("-");
                txtY8.setText(String.valueOf(Integer.parseInt(txtY8.getText()) + 5));
            } else if (txtY7.getText().equals("")) {
                txtY7.setText("V");
                txtC7.setText("-");
                txtY8.setText(String.valueOf(Integer.parseInt(txtY8.getText()) + 5));
                if (Integer.parseInt(txtY8.getText()) < Integer.parseInt(txtC8.getText())) {
                    JOptionPane.showMessageDialog(frame, "Anda kalah");
                    add("LOSE", 1);
                } else if (Integer.parseInt(txtY8.getText()) > Integer.parseInt(txtC8.getText())) {
                    JOptionPane.showMessageDialog(frame, "Anda menang");
                    add("WIN", 1);
                } else {
                    JOptionPane.showMessageDialog(frame, "Permainan Seri");
                    add("DRAW", 1);
                }
                resetPoin("ALL");
            }
        } else {
            if (txtY1.getText().equals("")) {
                txtY1.setText("-");
                txtC1.setText("V");
                txtC8.setText(String.valueOf(Integer.parseInt(txtC8.getText()) + 5));
            } else if (txtY2.getText().equals("")) {
                txtY2.setText("-");
                txtC2.setText("V");
                txtC8.setText(String.valueOf(Integer.parseInt(txtC8.getText()) + 5));
            } else if (txtY3.getText().equals("")) {
                txtY3.setText("-");
                txtC3.setText("V");
                txtC8.setText(String.valueOf(Integer.parseInt(txtC8.getText()) + 5));
            } else if (txtY4.getText().equals("")) {
                txtY4.setText("-");
                txtC4.setText("V");
                txtC8.setText(String.valueOf(Integer.parseInt(txtC8.getText()) + 5));
            } else if (txtY5.getText().equals("")) {
                txtY5.setText("-");
                txtC5.setText("V");
                txtC8.setText(String.valueOf(Integer.parseInt(txtC8.getText()) + 5));
            } else if (txtY6.getText().equals("")) {
                txtY6.setText("-");
                txtC6.setText("V");
                txtC8.setText(String.valueOf(Integer.parseInt(txtC8.getText()) + 5));
            } else if (txtY7.getText().equals("")) {
                txtY7.setText("-");
                txtC7.setText("V");
                txtC8.setText(String.valueOf(Integer.parseInt(txtC8.getText()) + 5));
                if (Integer.parseInt(txtY8.getText()) < Integer.parseInt(txtC8.getText())) {
                    JOptionPane.showMessageDialog(frame, "Anda kalah");
                    add("LOSE", 1);
                } else if (Integer.parseInt(txtY8.getText()) > Integer.parseInt(txtC8.getText())) {
                    JOptionPane.showMessageDialog(frame, "Anda menang");
                    add("WIN", 1);
                } else {
                    JOptionPane.showMessageDialog(frame, "Permainan Seri");
                    add("DRAW", 1);
                }
                resetPoin("ALL");
            }
        }
    }

    private void btnLanjutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLanjutMouseClicked
        resetPoin("");
    }//GEN-LAST:event_btnLanjutMouseClicked

    private void btnLanjutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLanjutMouseEntered
        btnLanjut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/btnLanjut2.png")));
    }//GEN-LAST:event_btnLanjutMouseEntered

    private void btnLanjutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLanjutMouseExited
        btnLanjut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/btnLanjut1.png")));
    }//GEN-LAST:event_btnLanjutMouseExited

    private void btnUlangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUlangMouseClicked
        resetPoin("ALL");
    }//GEN-LAST:event_btnUlangMouseClicked

    private void btnUlangMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUlangMouseEntered
        btnUlang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/btnUlang2.png")));
    }//GEN-LAST:event_btnUlangMouseEntered

    private void btnUlangMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUlangMouseExited
        btnUlang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/btnUlang1.png")));
    }//GEN-LAST:event_btnUlangMouseExited

    private void b1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b1MouseClicked
        if (status == false) {
            b1.setBounds(370, 160, b1.getWidth(), b1.getHeight());
            status = true;
            fight(SUIT.BATU);
        }
    }//GEN-LAST:event_b1MouseClicked

    private void g1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_g1MouseClicked
        if (status == false) {
            g1.setBounds(370, 160, g1.getWidth(), g1.getHeight());
            status = true;
            fight(SUIT.GUNTING);
        }
    }//GEN-LAST:event_g1MouseClicked

    private void k1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_k1MouseClicked
        if (status == false) {
            k1.setBounds(370, 160, k1.getWidth(), k1.getHeight());
            status = true;
            fight(SUIT.KERTAS);
        }
    }//GEN-LAST:event_k1MouseClicked

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
            java.util.logging.Logger.getLogger(SuitGame_View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SuitGame_View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SuitGame_View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SuitGame_View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SuitGame_View(new Player("bagas")).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel b1;
    private javax.swing.JLabel b2;
    private javax.swing.JLabel btnLanjut;
    private javax.swing.JLabel btnUlang;
    private javax.swing.JLabel g1;
    private javax.swing.JLabel g2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel k1;
    private javax.swing.JLabel k2;
    private javax.swing.JLabel lblCpu;
    private javax.swing.JLabel lblYou;
    private javax.swing.JTextField txtC1;
    private javax.swing.JTextField txtC2;
    private javax.swing.JTextField txtC3;
    private javax.swing.JTextField txtC4;
    private javax.swing.JTextField txtC5;
    private javax.swing.JTextField txtC6;
    private javax.swing.JTextField txtC7;
    private javax.swing.JTextField txtC8;
    private javax.swing.JTextField txtY1;
    private javax.swing.JTextField txtY2;
    private javax.swing.JTextField txtY3;
    private javax.swing.JTextField txtY4;
    private javax.swing.JTextField txtY5;
    private javax.swing.JTextField txtY6;
    private javax.swing.JTextField txtY7;
    private javax.swing.JTextField txtY8;
    // End of variables declaration//GEN-END:variables
}
