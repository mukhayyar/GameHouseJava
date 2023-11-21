package SuitGame;

import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import GameHouse.FrameNavigator;
import ViewUtama.BackButton;
import ViewUtama.ListGameView;

public class SuitGame_View extends BackButton {

    JFrame frame;
    boolean status = false;

    public SuitGame_View() {
        initComponents();
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

    private void formKeyPressed(java.awt.event.KeyEvent evt) {                                
    }        
    
    private void formWindowActivated(java.awt.event.WindowEvent evt) {                                     
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

        txtC8.setFont(new java.awt.Font("DigifaceWide", 1, 24)); // NOI18N
        txtC8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtC8.setText("0");
        txtC8.setEnabled(false);

        txtC7.setFont(new java.awt.Font("DigifaceWide", 1, 24)); // NOI18N
        txtC7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtC7.setEnabled(false);

        txtC6.setFont(new java.awt.Font("DigifaceWide", 1, 24)); // NOI18N
        txtC6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtC6.setEnabled(false);

        txtC5.setFont(new java.awt.Font("DigifaceWide", 1, 24)); // NOI18N
        txtC5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtC5.setEnabled(false);

        txtC4.setFont(new java.awt.Font("DigifaceWide", 1, 24)); // NOI18N
        txtC4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtC4.setEnabled(false);

        txtC3.setFont(new java.awt.Font("DigifaceWide", 1, 24)); // NOI18N
        txtC3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtC3.setEnabled(false);

        txtC2.setFont(new java.awt.Font("DigifaceWide", 1, 24)); // NOI18N
        txtC2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtC2.setEnabled(false);

        txtC1.setFont(new java.awt.Font("DigifaceWide", 1, 24)); // NOI18N
        txtC1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtC1.setEnabled(false);

        lblCpu.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        lblCpu.setText("CPU");

        jLabel1.setFont(new java.awt.Font("Showcard Gothic", 0, 48)); // NOI18N
        jLabel1.setText("Suit Game");

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

        txtY1.setFont(new java.awt.Font("DigifaceWide", 1, 24)); // NOI18N
        txtY1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtY1.setEnabled(false);

        lblYou.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        lblYou.setText("YOU");

        txtY2.setFont(new java.awt.Font("DigifaceWide", 1, 24)); // NOI18N
        txtY2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtY2.setEnabled(false);

        txtY3.setFont(new java.awt.Font("DigifaceWide", 1, 24)); // NOI18N
        txtY3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtY3.setEnabled(false);

        txtY4.setFont(new java.awt.Font("DigifaceWide", 1, 24)); // NOI18N
        txtY4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtY4.setEnabled(false);

        txtY5.setFont(new java.awt.Font("DigifaceWide", 1, 24)); // NOI18N
        txtY5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtY5.setEnabled(false);

        txtY6.setFont(new java.awt.Font("DigifaceWide", 1, 24)); // NOI18N
        txtY6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtY6.setEnabled(false);

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel2.setText("YOU");

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel3.setText("Computer");

        k2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/ck2.png"))); // NOI18N

        g2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/cg2.png"))); // NOI18N

        b2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/cb2.png"))); // NOI18N
        b2.setFocusCycleRoot(true);

        b1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/b2.png"))); // NOI18N
        b1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b1MouseClicked(evt);
            }
        });

        g1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/g2.png"))); // NOI18N
        g1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                g1MouseClicked(evt);
            }
        });

        k1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/k2.png"))); // NOI18N
        k1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                k1MouseClicked(evt);
            }
        });

        txtY7.setFont(new java.awt.Font("DigifaceWide", 1, 24)); // NOI18N
        txtY7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtY7.setEnabled(false);

        txtY8.setFont(new java.awt.Font("DigifaceWide", 1, 24)); // NOI18N
        txtY8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtY8.setText("0");
        txtY8.setEnabled(false);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/background_new.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(360, 360, 360)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(100, 100, 100)
                        .addComponent(b2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(g1)
                        .addGap(480, 480, 480)
                        .addComponent(g2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(jLabel2)
                        .addGap(156, 156, 156)
                        .addComponent(btnLanjut)
                        .addGap(40, 40, 40)
                        .addComponent(btnUlang, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(90, 90, 90)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(lblYou)
                        .addGap(26, 26, 26)
                        .addComponent(txtY1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addComponent(txtY2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addComponent(txtY3, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addComponent(txtY4, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addComponent(txtY5, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addComponent(txtY6, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addComponent(txtY7, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(txtY8, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(lblCpu, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(98, 98, 98)
                        .addComponent(txtC2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(78, 78, 78)
                        .addComponent(txtC4, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addComponent(txtC5, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addComponent(txtC6, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(108, 108, 108)
                        .addComponent(txtC8, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(230, 230, 230)
                        .addComponent(txtC1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(650, 650, 650)
                        .addComponent(txtC7, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(710, 710, 710)
                        .addComponent(k2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(370, 370, 370)
                        .addComponent(txtC3, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(b1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(k1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(b2)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(g1)
                    .addComponent(g2))
                .addGap(110, 110, 110)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnLanjut)
                    .addComponent(btnUlang, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lblYou))
                    .addComponent(txtY1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtY2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtY3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtY4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtY5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtY6, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtY7, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtY8, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lblCpu))
                    .addComponent(txtC2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtC4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtC5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtC6, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtC8, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(layout.createSequentialGroup()
                .addGap(520, 520, 520)
                .addComponent(txtC1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(520, 520, 520)
                .addComponent(txtC7, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(260, 260, 260)
                .addComponent(k2))
            .addGroup(layout.createSequentialGroup()
                .addGap(520, 520, 520)
                .addComponent(txtC3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(b1))
            .addGroup(layout.createSequentialGroup()
                .addGap(260, 260, 260)
                .addComponent(k1))
            .addComponent(jLabel4)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void Reset(String ket)
    {
        b1.setBounds(130, 60,b1.getWidth(),b1.getHeight());
        g1.setBounds(130, 160,g1.getWidth(),g1.getHeight());
        k1.setBounds(130, 260,k1.getWidth(),k1.getHeight());

        b2.setBounds(710, 60,b2.getWidth(),b2.getHeight());
        g2.setBounds(710, 160,g2.getWidth(),g2.getHeight());
        k2.setBounds(710, 260,k2.getWidth(),k2.getHeight());
        status = false;

        if (ket.equals("ALL"))
        {
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

    public int Acak()
    {
        int nilai = 0;
        Random acak = new Random();
        int n = 3;
        nilai = acak.nextInt(n + 1);        
        return nilai;
    }

    public void Lawan(String ket)
    {
        int nilaiAcak = 0;
        nilaiAcak = Acak();
        if (nilaiAcak == 1)
        {
            b2.setBounds(490, 169,b2.getWidth(),b2.getHeight());
            if (ket.equals("k"))
            {
                Nilai("1");
            }
            else if (ket.equals("g"))
            {
                Nilai("0");
            }
        }
        else if (nilaiAcak == 2)
        {
            g2.setBounds(490, 160,g2.getWidth(),g2.getHeight());
            if (ket.equals("b"))
            {
                Nilai("1");
            }
            else if (ket.equals("k"))
            {
                Nilai("0");
            }
        }
        else
        {
            k2.setBounds(490, 160,k2.getWidth(),k2.getHeight());
            if (ket.equals("g"))
            {
                Nilai("1");
            }
            else if (ket.equals("b"))
            {
                Nilai("0");
            }
        }
    }

    public void Nilai(String ket)
    {
        if (ket.equals("1"))
        {
            if (txtY1.getText().equals(""))
            {
                txtY1.setText("V");
                txtC1.setText("-");
                txtY8.setText(String.valueOf(Integer.parseInt(txtY8.getText())+5));
            }
            else if (txtY2.getText().equals(""))
            {
                txtY2.setText("V");
                txtC2.setText("-");
                txtY8.setText(String.valueOf(Integer.parseInt(txtY8.getText())+5));
            }
            else if (txtY3.getText().equals(""))
            {
                txtY3.setText("V");
                txtC3.setText("-");
                txtY8.setText(String.valueOf(Integer.parseInt(txtY8.getText())+5));
            }
            else if (txtY4.getText().equals(""))
            {
                txtY4.setText("V");
                txtC4.setText("-");
                txtY8.setText(String.valueOf(Integer.parseInt(txtY8.getText())+5));
            }
            else if (txtY5.getText().equals(""))
            {
                txtY5.setText("V");
                txtC5.setText("-");
                txtY8.setText(String.valueOf(Integer.parseInt(txtY8.getText())+5));
            }
            else if (txtY6.getText().equals(""))
            {
                txtY6.setText("V");
                txtC6.setText("-");
                txtY8.setText(String.valueOf(Integer.parseInt(txtY8.getText())+5));
            }
            else if (txtY7.getText().equals(""))
            {
                txtY7.setText("V");
                txtC7.setText("-");
                txtY8.setText(String.valueOf(Integer.parseInt(txtY8.getText())+5));                
                if(Integer.parseInt(txtY8.getText()) < Integer.parseInt(txtC8.getText())){
                    JOptionPane.showMessageDialog(frame, "Anda kalah");                    
                }
                else if(Integer.parseInt(txtY8.getText()) > Integer.parseInt(txtC8.getText())){
                    JOptionPane.showMessageDialog(frame, "Anda menang");
                }  
                Reset("ALL");
            }
        }
        else
        {
            if (txtY1.getText().equals(""))
            {
                txtY1.setText("-");
                txtC1.setText("V");
                txtC8.setText(String.valueOf(Integer.parseInt(txtC8.getText())+5));
            }
            else if (txtY2.getText().equals(""))
            {
                txtY2.setText("-");
                txtC2.setText("V");
                txtC8.setText(String.valueOf(Integer.parseInt(txtC8.getText())+5));
            }
            else if (txtY3.getText().equals(""))
            {
                txtY3.setText("-");
                txtC3.setText("V");
                txtC8.setText(String.valueOf(Integer.parseInt(txtC8.getText())+5));
            }
            else if (txtY4.getText().equals(""))
            {
                txtY4.setText("-");
                txtC4.setText("V");
                txtC8.setText(String.valueOf(Integer.parseInt(txtC8.getText())+5));
            }
            else if (txtY5.getText().equals(""))
            {
                txtY5.setText("-");
                txtC5.setText("V");
                txtC8.setText(String.valueOf(Integer.parseInt(txtC8.getText())+5));
            }
            else if (txtY6.getText().equals(""))
            {
                txtY6.setText("-");
                txtC6.setText("V");
                txtC8.setText(String.valueOf(Integer.parseInt(txtC8.getText())+5));
            }
            else if (txtY7.getText().equals(""))
            {
                txtY7.setText("-");
                txtC7.setText("V");
                txtC8.setText(String.valueOf(Integer.parseInt(txtC8.getText())+5));
                if(Integer.parseInt(txtY8.getText()) < Integer.parseInt(txtC8.getText())){
                    JOptionPane.showMessageDialog(frame, "Anda kalah");                    
                }
                else if(Integer.parseInt(txtY8.getText()) > Integer.parseInt(txtC8.getText())){
                    JOptionPane.showMessageDialog(frame, "Anda menang");
                }
                Reset("ALL");
            }
        }
    }
    
    private void btnLanjutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLanjutMouseClicked
        Reset("");
    }//GEN-LAST:event_btnLanjutMouseClicked

    private void btnLanjutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLanjutMouseEntered
        btnLanjut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/btnLanjut2.png")));
    }//GEN-LAST:event_btnLanjutMouseEntered

    private void btnLanjutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLanjutMouseExited
        btnLanjut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/btnLanjut1.png")));
    }//GEN-LAST:event_btnLanjutMouseExited

    private void btnUlangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUlangMouseClicked
        Reset("ALL");
    }//GEN-LAST:event_btnUlangMouseClicked

    private void btnUlangMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUlangMouseEntered
        btnUlang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/btnUlang2.png")));
    }//GEN-LAST:event_btnUlangMouseEntered

    private void btnUlangMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUlangMouseExited
        btnUlang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/btnUlang1.png")));
    }//GEN-LAST:event_btnUlangMouseExited

    private void b1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b1MouseClicked
        if (status == false)
        {
            b1.setBounds(370, 160,b1.getWidth(),b1.getHeight());
            status = true;
            Lawan("b");
        }
    }//GEN-LAST:event_b1MouseClicked

    private void g1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_g1MouseClicked
        if (status == false)
        {
            g1.setBounds(370, 160,g1.getWidth(),g1.getHeight());
            status = true;
            Lawan("g");
        }
    }//GEN-LAST:event_g1MouseClicked

    private void k1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_k1MouseClicked
        if (status == false)
        {
            k1.setBounds(370, 160,k1.getWidth(),k1.getHeight());
            status = true;
            Lawan("k");
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
                new SuitGame_View().setVisible(true);
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
