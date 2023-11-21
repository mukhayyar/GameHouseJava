package SnakeGame;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Random;
import javax.imageio.ImageIO;

public class Food {

    private Point posisi;
    private Random random;
    private BufferedImage appleImage;

    public Food(int lebarPapan, int tinggiPapan) {
        random = new Random();
        posisi = new Point(random.nextInt(lebarPapan / 20), random.nextInt(tinggiPapan / 20));
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            appleImage = ImageIO.read(classLoader.getResourceAsStream("SnakeGame/apple_image.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Point getPosisi() {
        return posisi;
    }

    public void randomPosisi() {
        posisi.setLocation(random.nextInt(20), random.nextInt(20));
    }

    public void gambar(Graphics g) {
//        g.setColor(Color.RED);
//        g.fill3DRect(posisi.x * 20, posisi.y * 20, 20, 20, true);
        g.drawImage(appleImage, posisi.x * 20, posisi.y * 20, 20, 20, null);
    }
}
