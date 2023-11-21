package snake_game;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import javax.imageio.ImageIO;

public class Snake {

    private ArrayList<Point> tubuh;
    private Arah arah;

    private BufferedImage headRightImage;
    private BufferedImage headLeftImage;
    private BufferedImage headUpImage;
    private BufferedImage headDownImage;
    private BufferedImage bodyImage;
    private BufferedImage tailImage;
    private BufferedImage tailRightImage;
    private BufferedImage tailLeftImage;
    private BufferedImage tailUpImage;
    private BufferedImage tailDownImage;

    public enum Arah {
        ATAS, BAWAH, KIRI, KANAN
    }

    public Snake(int startX, int startY) {
        tubuh = new ArrayList<>();
        tubuh.add(new Point(startX, startY));
        arah = Arah.KANAN;

        // Load head, body, and tail images
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            headRightImage = ImageIO.read(classLoader.getResourceAsStream("snake_game/head_right_image.png"));
            headLeftImage = ImageIO.read(classLoader.getResourceAsStream("snake_game/head_left_image.png"));
            headUpImage = ImageIO.read(classLoader.getResourceAsStream("snake_game/head_up_image.png"));
            headDownImage = ImageIO.read(classLoader.getResourceAsStream("snake_game/head_down_image.png"));
            bodyImage = ImageIO.read(classLoader.getResourceAsStream("snake_game/body_image.png"));
//            tailImage = ImageIO.read(classLoader.getResourceAsStream("snake_game/tail_image.png"));
            tailRightImage = ImageIO.read(classLoader.getResourceAsStream("snake_game/tail_right_image.png"));
            tailLeftImage = ImageIO.read(classLoader.getResourceAsStream("snake_game/tail_left_image.png"));
            tailUpImage = ImageIO.read(classLoader.getResourceAsStream("snake_game/tail_up_image.png"));
            tailDownImage = ImageIO.read(classLoader.getResourceAsStream("snake_game/tail_down_image.png"));

        } catch (IOException e) {
        }
    }

    public void pergerakan() {
        Point kepala = tubuh.get(0);
        Point kepalaBaru = (Point) kepala.clone();

        switch (arah) {
            case ATAS ->
                kepalaBaru.translate(0, -1);
            case BAWAH ->
                kepalaBaru.translate(0, 1);
            case KIRI ->
                kepalaBaru.translate(-1, 0);
            case KANAN ->
                kepalaBaru.translate(1, 0);
        }

        tubuh.add(0, kepalaBaru);
        tubuh.remove(tubuh.size() - 1);
    }

    public void setArah(Arah arahBaru) {
        arah = arahBaru;
    }

    public Arah getArah() {
        return arah;
    }

    public boolean tertabrakDenganMakanan(Food makanan) {
        return tubuh.get(0).equals(makanan.getPosisi());
    }

    public void makanMakanan() {
        Point tail = tubuh.get(tubuh.size() - 1);
        switch (arah) {
            case ATAS ->
                tubuh.add(new Point(tail.x, tail.y + 1));
            case BAWAH ->
                tubuh.add(new Point(tail.x, tail.y - 1));
            case KANAN ->
                tubuh.add(new Point(tail.x - 1, tail.y));
            case KIRI ->
                tubuh.add(new Point(tail.x + 1, tail.y));
        }

    }

    public boolean tertabrakDenganBatasPapan(int lebarPapan, int tinggiPapan) {
        Point kepala = tubuh.get(0);
        return kepala.x < 0 || kepala.x >= (lebarPapan / 20) || kepala.y < 0 || kepala.y >= (tinggiPapan / 20);

    }

    public void reset() {
        tubuh.clear(); // Mengosongkan tubuh ular
        tubuh.add(new Point(5, 5)); // Menambahkan posisi awal kepala ular
        arah = Arah.KANAN; // Mengatur arah awal ular
    }

    public boolean tertabrakDenganDirinyaSendiri() {
        Point kepala = tubuh.get(0);
        for (int i = 1; i < tubuh.size(); i++) {
            if (tubuh.get(i).equals(kepala)) {
                return true;
            }
        }
        return false;
    }

    public void gambar(Graphics g) {
//        g.setColor(Color.GREEN);
        Point kepala = tubuh.get(0);
//        g.fillRoundRect(kepala.x * 20, kepala.y * 20, 20, 20, 20, 20);
//        g.drawImage(headRightImage, kepala.x * 20, kepala.y * 20, 20, 20,null);
        drawHeadImage(g, kepala.x * 20, kepala.y * 20, 20, 20);

        for (int i = 1; i < tubuh.size(); i++) {
            Point segmen = tubuh.get(i);
            if (i == 0) {
                // Draw head image for the first segment
                drawHeadImage(g, segmen.x * 20, segmen.y * 20, 20, 20);
            } else if (i == tubuh.size() - 1) {
                // Draw tail image for the last segment
                drawTailImage(g, segmen.x * 20, segmen.y * 20, 20, 20);
            } else {
                // Draw body image for the middle segments
                g.drawImage(bodyImage, segmen.x * 20, segmen.y * 20, 20, 20, null);
            }
        }
    }

    private void drawHeadImage(Graphics g, int x, int y, int width, int height) {
        switch (arah) {
            case KANAN ->
                g.drawImage(headRightImage, x, y, width, height, null);
            case KIRI ->
                g.drawImage(headLeftImage, x, y, width, height, null);
            case ATAS ->
                g.drawImage(headUpImage, x, y, width, height, null);
            case BAWAH ->
                g.drawImage(headDownImage, x, y, width, height, null);
        }
    }

    private void drawTailImage(Graphics g, int x, int y, int width, int height) {
        switch (arah) {
            case KANAN ->
                g.drawImage(tailRightImage, x, y, width, height, null);
            case KIRI ->
                g.drawImage(tailLeftImage, x, y, width, height, null);
            case ATAS ->
                g.drawImage(tailUpImage, x, y, width, height, null);
            case BAWAH ->
                g.drawImage(tailDownImage, x, y, width, height, null);
        }
    }

    public int getPanjangTubuh() {
        return tubuh.size();
    }
}
