/**
 *
 * @author Heiji Hattori
 */
package suit;

import javax.swing.JFrame;
import java.util.Random;
import javax.swing.JOptionPane;

public class frmMain extends javax.swing.JFrame {

    JFrame frame;

    public frmMain() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblYou = new javax.swing.JLabel();
        lblCpu = new javax.swing.JLabel();
        txtY1 = new javax.swing.JTextField();
        txtC1 = new javax.swing.JTextField();
        txtY2 = new javax.swing.JTextField();
        txtY3 = new javax.swing.JTextField();
        txtY4 = new javax.swing.JTextField();
        txtY5 = new javax.swing.JTextField();
        txtY6 = new javax.swing.JTextField();
        txtY7 = new javax.swing.JTextField();
        txtY8 = new javax.swing.JTextField();
        txtC2 = new javax.swing.JTextField();
        txtC3 = new javax.swing.JTextField();
        txtC4 = new javax.swing.JTextField();
        txtC5 = new javax.swing.JTextField();
        txtC6 = new javax.swing.JTextField();
        txtC7 = new javax.swing.JTextField();
        txtC8 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        b1 = new javax.swing.JLabel();
        g1 = new javax.swing.JLabel();
        k1 = new javax.swing.JLabel();
        b2 = new javax.swing.JLabel();
        g2 = new javax.swing.JLabel();
        k2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnLanjut = new javax.swing.JButton();
        btnUlang = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        lblYou.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        lblYou.setText("YOU");

        lblCpu.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        lblCpu.setText("CPU");

        txtY1.setFont(new java.awt.Font("DigifaceWide", 1, 24)); // NOI18N
        txtY1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtY1.setEnabled(false);

        txtC1.setFont(new java.awt.Font("DigifaceWide", 1, 24)); // NOI18N
        txtC1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtC1.setEnabled(false);

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

        txtY7.setFont(new java.awt.Font("DigifaceWide", 1, 24)); // NOI18N
        txtY7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtY7.setEnabled(false);

        txtY8.setFont(new java.awt.Font("DigifaceWide", 1, 24)); // NOI18N
        txtY8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtY8.setText("0");
        txtY8.setEnabled(false);

        txtC2.setFont(new java.awt.Font("DigifaceWide", 1, 24)); // NOI18N
        txtC2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtC2.setEnabled(false);

        txtC3.setFont(new java.awt.Font("DigifaceWide", 1, 24)); // NOI18N
        txtC3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtC3.setEnabled(false);

        txtC4.setFont(new java.awt.Font("DigifaceWide", 1, 24)); // NOI18N
        txtC4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtC4.setEnabled(false);

        txtC5.setFont(new java.awt.Font("DigifaceWide", 1, 24)); // NOI18N
        txtC5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtC5.setEnabled(false);

        txtC6.setFont(new java.awt.Font("DigifaceWide", 1, 24)); // NOI18N
        txtC6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtC6.setEnabled(false);

        txtC7.setFont(new java.awt.Font("DigifaceWide", 1, 24)); // NOI18N
        txtC7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtC7.setEnabled(false);

        txtC8.setFont(new java.awt.Font("DigifaceWide", 1, 24)); // NOI18N
        txtC8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtC8.setText("0");
        txtC8.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblYou)
                        .addGap(18, 18, 18)
                        .addComponent(txtY1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtY2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtY3, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtY4, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtY5, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtY6, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtY7, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                        .addComponent(txtY8, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblCpu)
                        .addGap(18, 18, 18)
                        .addComponent(txtC1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtC2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtC3, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtC4, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtC5, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtC6, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtC7, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                        .addComponent(txtC8, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtY1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblYou)
                    .addComponent(txtY2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtY3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtY4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtY5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtY6, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtY7, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtY8, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCpu)
                    .addComponent(txtC1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtC2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtC3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtC4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtC5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtC6, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtC7, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtC8, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(13, Short.MAX_VALUE))
        );

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

        b2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/cb2.png"))); // NOI18N

        g2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/cg2.png"))); // NOI18N

        k2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/ck2.png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 48)); // NOI18N
        jLabel1.setText("VS");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(k1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 482, Short.MAX_VALUE)
                        .addComponent(k2))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(b1)
                            .addComponent(g1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 222, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(209, 209, 209)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(b2)
                            .addComponent(g2))))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(b1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(g1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(k1))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(b2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(g2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(k2))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        btnLanjut.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        btnLanjut.setText("LANJUT");
        btnLanjut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLanjutActionPerformed(evt);
            }
        });

        btnUlang.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        btnUlang.setText("ULANG");
        btnUlang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUlangActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel2.setText("YOU");

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel3.setText("CPU");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel2)
                .addGap(184, 184, 184)
                .addComponent(btnLanjut)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnUlang)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 170, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnLanjut)
                        .addComponent(btnUlang))
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    boolean status = false;

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
    }//GEN-LAST:event_formKeyPressed


    public void Reset(String ket)
    {
        b1.setBounds(21, 12,b1.getWidth(),b1.getHeight());
        g1.setBounds(21, 118,g1.getWidth(),g1.getHeight());
        k1.setBounds(21, 224,k1.getWidth(),k1.getHeight());

        b2.setBounds(600, 12,b2.getWidth(),b2.getHeight());
        g2.setBounds(600, 118,g2.getWidth(),g2.getHeight());
        k2.setBounds(600, 224,k2.getWidth(),k2.getHeight());
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
            b2.setBounds(367, 118,b2.getWidth(),b2.getHeight());
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
            g2.setBounds(367, 118,g2.getWidth(),g2.getHeight());
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
            k2.setBounds(367, 118,k2.getWidth(),k2.getHeight());
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

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
    }//GEN-LAST:event_formWindowActivated

    private void btnUlangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUlangActionPerformed
        Reset("ALL");
    }//GEN-LAST:event_btnUlangActionPerformed

    private void btnLanjutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLanjutActionPerformed
        Reset("");
    }//GEN-LAST:event_btnLanjutActionPerformed

    private void b1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b1MouseClicked
        if (status == false)
        {
            b1.setBounds(245, 118,b1.getWidth(),b1.getHeight());
            status = true;
            Lawan("b");
        }
    }//GEN-LAST:event_b1MouseClicked

    private void g1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_g1MouseClicked
        if (status == false)
        {
            g1.setBounds(245, 118,g1.getWidth(),g1.getHeight());
            status = true;
            Lawan("g");
        }
    }//GEN-LAST:event_g1MouseClicked

    private void k1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_k1MouseClicked
        if (status == false)
        {
            k1.setBounds(245, 118,k1.getWidth(),k1.getHeight());
            status = true;
            Lawan("k");
        }
    }//GEN-LAST:event_k1MouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
                Reset("ALL");
    }//GEN-LAST:event_formWindowOpened

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel b1;
    private javax.swing.JLabel b2;
    private javax.swing.JButton btnLanjut;
    private javax.swing.JButton btnUlang;
    private javax.swing.JLabel g1;
    private javax.swing.JLabel g2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
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
