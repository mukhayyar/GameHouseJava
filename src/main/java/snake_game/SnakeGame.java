 package snake.game;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SnakeGame extends JPanel implements ActionListener, KeyListener {
    private int lebarPapan;
    private int tinggiPapan;
    private String nama;
    

    private Snake ular;
    private Food makanan;

    private boolean gameover = false;
    private boolean paused = false;

    private JButton btnRestart;
    private JButton btnKembali;

    private Timer main;

    public SnakeGame(int lebarPapan, int tinggiPapan, String nama) {
        this.nama = nama;
        this.lebarPapan = lebarPapan;
        this.tinggiPapan = tinggiPapan;
        setPreferredSize(new Dimension(this.lebarPapan, this.tinggiPapan));
        setBackground(Color.GRAY);
        addKeyListener(this);
        setFocusable(true);

        ular = new Snake(5, 5);
        makanan = new Food(this.lebarPapan, this.tinggiPapan);
        tombol();
        main = new Timer(150, this);
        main.start();
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        gambar(g);
    }

    public void gambar(Graphics g) {
        makanan.gambar(g);
        ular.gambar(g);

        g.setFont(new Font("Arial", Font.PLAIN, 16));

        if (gameover) {
            g.setColor(Color.BLACK); // Latar belakang layar Game Over menjadi hitam
            g.fillRect(0, 0, lebarPapan, tinggiPapan);

            String pesanPermainanBerakhir = "GAME OVER";
            String pesanSkor = "Skor: " + ular.getPanjangTubuh();

            g.setColor(Color.RED);
            Font font = new Font("Arial", Font.BOLD, 40);
            g.setFont(font);

            FontMetrics metrics = g.getFontMetrics(font);
            int lebarPesan = metrics.stringWidth(pesanPermainanBerakhir);
            int tinggiPesan = metrics.getHeight();

            int xPesan = (lebarPapan - lebarPesan) / 2;
            int yPesan = (tinggiPapan - tinggiPesan) / 2;

            g.drawString(pesanPermainanBerakhir, xPesan, yPesan);

            font = new Font("Arial", Font.PLAIN, 24);
            g.setFont(font);

            metrics = g.getFontMetrics(font);
            int lebarSkor = metrics.stringWidth(pesanSkor);

            int xSkor = (lebarPapan - lebarSkor) / 2;
            int ySkor = yPesan + tinggiPesan + 20;

            g.drawString(pesanSkor, xSkor, ySkor);
            btnRestart.setVisible(true);
            btnKembali.setVisible(true);
        } else if (paused) {
            g.setColor(Color.BLUE);
            Font font = new Font("Arial", Font.BOLD, 36);
            g.setFont(font);

            String pesanJeda = "Paused";
            int lebarPesan = g.getFontMetrics().stringWidth(pesanJeda);
            int tinggiPesan = g.getFontMetrics().getHeight();

            int xPesan = (lebarPapan - lebarPesan) / 2;
            int yPesan = (tinggiPapan - tinggiPesan) / 2;

            g.drawString(pesanJeda, xPesan, yPesan);
        } else {
            g.setColor(Color.GREEN);
            g.drawString("Skor: " + ular.getPanjangTubuh(), 10, 20);
        }
    }

    public void tombol() {
        setLayout(null);
        btnRestart = new JButton("Ulang");
        btnRestart.setBounds(170, 370, 100, 30); // Mengatur posisi dan ukuran tombol
        btnRestart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gameover = false;
                paused = false;
                btnRestart.setVisible(false);
                btnKembali.setVisible(false);
                ular.reset();
                makanan.randomPosisi();
                main.setDelay(150);
                
            }
        });
        add(btnRestart);

        btnKembali = new JButton("Kembali");
        btnKembali.setBounds(330, 370, 100, 30);
        btnKembali.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame currentFrame = (JFrame) SwingUtilities.getWindowAncestor(SnakeGame.this);
                currentFrame.dispose();
                Home home = new Home(nama);
                home.setVisible(true);
            }
        });
        add(btnKembali);

        btnRestart.setVisible(false);
        btnKembali.setVisible(false);
    }

    public void pergerakan() {
        if (!gameover && !paused) {
            ular.pergerakan();
            if (ular.tertabrakDenganMakanan(makanan)) {
                ular.makanMakanan();
                makanan.randomPosisi();
                 
                if (ular.getPanjangTubuh() % 5 == 0) {
                    
                    int currentDelay = main.getDelay();
                    if (currentDelay > 10) { // Pastikan interval timer tidak menjadi negatif
                        main.setDelay(currentDelay - 10); 
                    }
                }
            }
            if (ular.tertabrakDenganBatasPapan(lebarPapan, tinggiPapan) || ular.tertabrakDenganDirinyaSendiri()) {
                gameover = true;
            }
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        pergerakan();
        repaint();
        
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (!gameover) {
            int tombol = e.getKeyCode();
            if (tombol == KeyEvent.VK_W && ular.getArah() != Snake.Arah.BAWAH) {
                ular.setArah(Snake.Arah.ATAS);
            } else if (tombol == KeyEvent.VK_S && ular.getArah() != Snake.Arah.ATAS) {
                ular.setArah(Snake.Arah.BAWAH);
            } else if (tombol == KeyEvent.VK_A && ular.getArah() != Snake.Arah.KANAN) {
                ular.setArah(Snake.Arah.KIRI);
            } else if (tombol == KeyEvent.VK_D && ular.getArah() != Snake.Arah.KIRI) {
                ular.setArah(Snake.Arah.KANAN);
            }if (tombol == KeyEvent.VK_UP && ular.getArah() != Snake.Arah.BAWAH) {
                ular.setArah(Snake.Arah.ATAS);
            } else if (tombol == KeyEvent.VK_DOWN && ular.getArah() != Snake.Arah.ATAS) {
                ular.setArah(Snake.Arah.BAWAH);
            } else if (tombol == KeyEvent.VK_LEFT && ular.getArah() != Snake.Arah.KANAN) {
                ular.setArah(Snake.Arah.KIRI);
            } else if (tombol == KeyEvent.VK_RIGHT && ular.getArah() != Snake.Arah.KIRI) {
                ular.setArah(Snake.Arah.KANAN);
            } else if (tombol == KeyEvent.VK_SPACE) {
                paused = !paused;
            }
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {
      
    }

    @Override
    public void keyReleased(KeyEvent e) {
      
    }

    
}