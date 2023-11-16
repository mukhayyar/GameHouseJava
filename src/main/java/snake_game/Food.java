package snake.game;

import java.awt.*;
import java.util.Random;

public class Food {
    private Point posisi;
    private Random random;

    public Food(int lebarPapan, int tinggiPapan) {
        random = new Random();
        posisi = new Point(random.nextInt(lebarPapan / 20), random.nextInt(tinggiPapan / 20));
    }

    public Point getPosisi() {
        return posisi;
    }

    public void randomPosisi() {
        posisi.setLocation(random.nextInt(20), random.nextInt(20));
    }

    public void gambar(Graphics g) {
        g.setColor(Color.RED);
        g.fill3DRect(posisi.x * 20, posisi.y * 20, 20, 20, true);
    }
}
