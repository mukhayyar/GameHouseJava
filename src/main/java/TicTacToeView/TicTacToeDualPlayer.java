/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package TicTacToeView;

import GameHouse.FrameNavigator;
import ViewUtama.BackButton;
import java.awt.Font;
import javax.swing.JOptionPane;


/**
 *
 * @author Rifqi
 */
public class TicTacToeDualPlayer extends BackButton  {

    int nilai, nilaiX, nilaiO;
    
    /**
     * Creates new form TicTacToeFrame
     */
    public TicTacToeDualPlayer() {
        initComponents();
        nilai = 1;
        nilaiX = 0;
        nilaiO = 0;  
        btnBack.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBackMouseClicked(evt);
            }
        });
    }      
    
    private void btnBackMouseClicked(java.awt.event.MouseEvent evt) {
        FrameNavigator.switchToFrame(this, new MainTicTacToe());
    }
    
    void pemenang() {
        if (btn1.getText() == "X" && btn2.getText() == "X" && btn3.getText() == "X") {
            JOptionPane.showMessageDialog(rootPane, "X win !!");
            reset();
        } else if (btn4.getText() == "X" && btn5.getText() == "X" && btn6.getText() == "X") {
            JOptionPane.showMessageDialog(rootPane, "X win !!");
            reset();
        } else if (btn7.getText() == "X" && btn8.getText() == "X" && btn9.getText() == "X") {
            JOptionPane.showMessageDialog(rootPane, "X win !!");
            reset();
        } else if (btn1.getText() == "X" && btn5.getText() == "X" && btn9.getText() == "X") {
            JOptionPane.showMessageDialog(rootPane, "X win !!");
            reset();
        } else if (btn3.getText() == "X" && btn5.getText() == "X" && btn7.getText() == "X") {
            JOptionPane.showMessageDialog(rootPane, "X win !!");
            reset();
        } else if (btn1.getText() == "X" && btn4.getText() == "X" && btn7.getText() == "X") {
            JOptionPane.showMessageDialog(rootPane, "X win !!");
            reset();
        } else if (btn2.getText() == "X" && btn5.getText() == "X" && btn8.getText() == "X") {
            JOptionPane.showMessageDialog(rootPane, "X win !!");
            reset();
        } else if (btn3.getText() == "X" && btn6.getText() == "X" && btn9.getText() == "X") {
            JOptionPane.showMessageDialog(rootPane, "X win !!");
            reset();
        }

        if (btn1.getText() == "O" && btn2.getText() == "O" && btn3.getText() == "O") {
            JOptionPane.showMessageDialog(rootPane, "O win !!");
            reset();
        } else if (btn4.getText() == "O" && btn5.getText() == "O" && btn6.getText() == "O") {
            JOptionPane.showMessageDialog(rootPane, "O win !!");
            reset();
        } else if (btn7.getText() == "O" && btn8.getText() == "O" && btn9.getText() == "O") {
            JOptionPane.showMessageDialog(rootPane, "O win !!");
            reset();
        } else if (btn1.getText() == "O" && btn5.getText() == "O" && btn9.getText() == "O") {
            JOptionPane.showMessageDialog(rootPane, "O win !!");
            reset();
        } else if (btn3.getText() == "O" && btn5.getText() == "O" && btn7.getText() == "O") {
            JOptionPane.showMessageDialog(rootPane, "O win !!");
            reset();
        } else if (btn1.getText() == "O" && btn4.getText() == "O" && btn7.getText() == "O") {
            JOptionPane.showMessageDialog(rootPane, "O win !!");
            reset();
        } else if (btn2.getText() == "O" && btn5.getText() == "O" && btn8.getText() == "O") {
            JOptionPane.showMessageDialog(rootPane, "O win !!");
            reset();
        } else if (btn3.getText() == "O" && btn6.getText() == "O" && btn9.getText() == "O") {
            JOptionPane.showMessageDialog(rootPane, "O win !!");
            reset();
        }
       cekDraw();
    }
    
    void cekDraw() {    
    if (!btn1.isEnabled() && !btn2.isEnabled() && !btn3.isEnabled() &&
        !btn4.isEnabled() && !btn5.isEnabled() && !btn6.isEnabled() &&
        !btn7.isEnabled() && !btn8.isEnabled() && !btn9.isEnabled()) {
        JOptionPane.showMessageDialog(rootPane, "It's a draw!");
        reset();
    }
}


    void reset() {
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

        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        getContentPane().add(btn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 210, 126, 113));

        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });
        getContentPane().add(btn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 210, 123, 113));

        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });
        getContentPane().add(btn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 210, 123, 110));

        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });
        getContentPane().add(btn4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 340, 126, 113));

        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });
        getContentPane().add(btn5, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 340, 123, 113));

        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });
        getContentPane().add(btn6, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 340, 123, 110));

        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });
        getContentPane().add(btn7, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 470, 126, 113));

        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });
        getContentPane().add(btn8, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 470, 123, 113));

        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });
        getContentPane().add(btn9, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 470, 123, 110));

        jLabel1.setFont(new java.awt.Font("Showcard Gothic", 0, 48)); // NOI18N
        jLabel1.setText("Tic Tac Toe");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 50, 280, 70));

        jLabel3.setFont(new java.awt.Font("Showcard Gothic", 0, 24)); // NOI18N
        jLabel3.setText("Dual Player");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 110, 160, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/background_new.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
         if (nilai == 1) {
            btn2.setText("X");
            btn2.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 40));
            btn2.setEnabled(false);
            nilai -= 1;
            nilaiX += 1;
            
            pemenang();
        } else {
            btn2.setText("O");
            btn2.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 40));
            btn2.setEnabled(false);
            nilai += 1;
            nilaiO += 1;
            
            pemenang();
        }       
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        if (nilai == 1) {
            btn3.setText("X");
            btn3.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 40));
            btn3.setEnabled(false);
            nilai -= 1;
            nilaiX += 1;
            
            pemenang();
        } else {
            btn3.setText("O");
            btn3.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 40));
            btn3.setEnabled(false);
            nilai += 1;
            nilaiO += 1;
            
            pemenang();
        }
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        if (nilai == 1) {
            btn4.setText("X");
            btn4.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 40));
            btn4.setEnabled(false);
            nilai -= 1;
            nilaiX += 1;
            
            pemenang();
        } else {
            btn4.setText("O");
            btn4.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 40));
            btn4.setEnabled(false);
            nilai += 1;
            nilaiO += 1;
            
            pemenang();
        }
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        if (nilai == 1) {
            btn6.setText("X");
            btn6.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 40));
            btn6.setEnabled(false);
            nilai -= 1;
            nilaiX += 1;
            
            pemenang();
        } else {
            btn6.setText("O");
            btn6.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 40));
            btn6.setEnabled(false);
            nilai += 1;
            nilaiO += 1;
            
            pemenang();
        }
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        if (nilai == 1) {
            btn7.setText("X");
            btn7.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 40));
            btn7.setEnabled(false);
            nilai -= 1;
            nilaiX += 1;
            
            pemenang();
        } else {
            btn7.setText("O");
            btn7.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 40));
            btn7.setEnabled(false);
            nilai += 1;
            nilaiO += 1;
            
            pemenang();
        }
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        if (nilai == 1) {
            btn8.setText("X");
            btn8.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 40));
            btn8.setEnabled(false);
            nilai -= 1;
            nilaiX += 1;
            
            pemenang();
        } else {
            btn8.setText("O");
            btn8.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 40));
            btn8.setEnabled(false);
            nilai += 1;
            nilaiO += 1;
            
            pemenang();
        }
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        if (nilai == 1) {
            btn9.setText("X");
            btn9.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 40));
            btn9.setEnabled(false);
            nilai -= 1;
            nilaiX += 1;
            
            pemenang();
        } else {
            btn9.setText("O");
            btn9.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 40));
            btn9.setEnabled(false);
            nilai += 1;
            nilaiO += 1;
            
            pemenang();
        }
    }//GEN-LAST:event_btn9ActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        if (nilai == 1) {
            btn1.setText("X");
            btn1.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 40));
            btn1.setEnabled(false);
            nilai -= 1;
            nilaiX += 1;
            
            pemenang();
        } else {
            btn1.setText("O");
            btn1.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 40));
            btn1.setEnabled(false);
            nilai += 1;
            nilaiO += 1;
            
            pemenang();
        }
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        if (nilai == 1) {
            btn5.setText("X");
            btn5.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 40));
            btn5.setEnabled(false);
            nilai -= 1;
            nilaiX += 1;
            
            pemenang();
        } else {
            btn5.setText("O");
            btn5.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 40));
            btn5.setEnabled(false);
            nilai += 1;
            nilaiO += 1;
            
            pemenang();
        }
    }//GEN-LAST:event_btn5ActionPerformed

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
                new TicTacToeDualPlayer().setVisible(true);
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
