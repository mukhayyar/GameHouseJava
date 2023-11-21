/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ViewUtama;
import GameHouse.FrameNavigator;
import ViewUtama.BackButton;
/**
 *
 * @author Asus
 */
public class StatsView extends BackButton {

    /**
     * Creates new form StatsView
     */
    public StatsView() {
        initComponents();
        btnBack.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBackMouseClicked(evt);
            }
        });
    }
    
        private void btnBackMouseClicked(java.awt.event.MouseEvent evt) {
        FrameNavigator.switchToFrame(this, new HomeView());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        lblTictactoe = new javax.swing.JLabel();
        lblSnake = new javax.swing.JLabel();
        lblSuit = new javax.swing.JLabel();
        gbrTTT = new javax.swing.JLabel();
        gbrSuit = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        scoreSnake = new javax.swing.JLabel();
        winSuit = new javax.swing.JLabel();
        loseSuit = new javax.swing.JLabel();
        drawSuit = new javax.swing.JLabel();
        tttWin = new javax.swing.JLabel();
        tttLose = new javax.swing.JLabel();
        tttDraw = new javax.swing.JLabel();
        totalScore = new javax.swing.JLabel();
        jmlWinSuit = new javax.swing.JLabel();
        jmlLoseSuit = new javax.swing.JLabel();
        jmlDrawSuit = new javax.swing.JLabel();
        jmlWinTTT = new javax.swing.JLabel();
        jmlLoseTTT = new javax.swing.JLabel();
        jmlDrawTTT = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        gbrSnake = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("StatsView"); // NOI18N
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 153, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setForeground(new java.awt.Color(0, 153, 0));

        lblTictactoe.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        lblTictactoe.setForeground(new java.awt.Color(255, 255, 255));
        lblTictactoe.setText("CHART TIC TAC TOE");

        lblSnake.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        lblSnake.setForeground(new java.awt.Color(255, 255, 255));
        lblSnake.setText("CHART SNAKE");

        lblSuit.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        lblSuit.setForeground(new java.awt.Color(255, 255, 255));
        lblSuit.setText("CHART SUIT");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(lblSnake)
                .addGap(219, 219, 219)
                .addComponent(lblSuit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 175, Short.MAX_VALUE)
                .addComponent(lblTictactoe)
                .addGap(29, 29, 29))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSuit)
                    .addComponent(lblTictactoe)
                    .addComponent(lblSnake))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 860, 60));

        gbrTTT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/tictactoe_fix.png"))); // NOI18N
        getContentPane().add(gbrTTT, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 240, -1, 120));

        gbrSuit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/snake_fix.png"))); // NOI18N
        getContentPane().add(gbrSuit, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, 120, 120));

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        scoreSnake.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        scoreSnake.setText("HIGH SCORE");

        winSuit.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        winSuit.setText("WIN");

        loseSuit.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        loseSuit.setText("LOSE");

        drawSuit.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        drawSuit.setText("DRAW");

        tttWin.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        tttWin.setText("WIN");

        tttLose.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        tttLose.setText("LOSE");

        tttDraw.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        tttDraw.setText("DRAW");

        totalScore.setText("<<score>>");

        jmlWinSuit.setText("<<win>>");

        jmlLoseSuit.setText("<<lose>>");

        jmlDrawSuit.setText("<<draw>>");

        jmlWinTTT.setText("<<win>>");

        jmlLoseTTT.setText("<<lose>>");

        jmlDrawTTT.setText("<<draw>>");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scoreSnake, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(totalScore, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(212, 212, 212)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(winSuit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(jmlWinSuit, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(loseSuit, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(drawSuit))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jmlLoseSuit)
                            .addComponent(jmlDrawSuit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 207, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(tttDraw, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jmlDrawTTT))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(tttLose)
                        .addGap(24, 24, 24)
                        .addComponent(jmlLoseTTT, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(tttWin)
                        .addGap(32, 32, 32)
                        .addComponent(jmlWinTTT, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tttWin)
                            .addComponent(winSuit)
                            .addComponent(jmlWinSuit)
                            .addComponent(jmlWinTTT)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(scoreSnake, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(tttLose)
                                .addComponent(jmlLoseTTT))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(totalScore)))
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tttDraw)
                            .addComponent(drawSuit)
                            .addComponent(jmlDrawSuit)
                            .addComponent(jmlDrawTTT)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(loseSuit)
                        .addComponent(jmlLoseSuit)))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 390, 860, -1));

        jLabel2.setFont(new java.awt.Font("Showcard Gothic", 0, 48)); // NOI18N
        jLabel2.setText("STATISTICS");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 70, -1, -1));

        gbrSnake.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/suit_fix.png"))); // NOI18N
        getContentPane().add(gbrSnake, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 240, 120, 120));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/background_new.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1130, -1));

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
            java.util.logging.Logger.getLogger(StatsView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StatsView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StatsView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StatsView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StatsView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel drawSuit;
    private javax.swing.JLabel gbrSnake;
    private javax.swing.JLabel gbrSuit;
    private javax.swing.JLabel gbrTTT;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel jmlDrawSuit;
    private javax.swing.JLabel jmlDrawTTT;
    private javax.swing.JLabel jmlLoseSuit;
    private javax.swing.JLabel jmlLoseTTT;
    private javax.swing.JLabel jmlWinSuit;
    private javax.swing.JLabel jmlWinTTT;
    private javax.swing.JLabel lblSnake;
    private javax.swing.JLabel lblSuit;
    private javax.swing.JLabel lblTictactoe;
    private javax.swing.JLabel loseSuit;
    private javax.swing.JLabel scoreSnake;
    private javax.swing.JLabel totalScore;
    private javax.swing.JLabel tttDraw;
    private javax.swing.JLabel tttLose;
    private javax.swing.JLabel tttWin;
    private javax.swing.JLabel winSuit;
    // End of variables declaration//GEN-END:variables
}