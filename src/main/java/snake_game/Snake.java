package snake.game;

import java.awt.*;
import java.util.ArrayList;

public class Snake {
    private ArrayList<Point> tubuh;
    private Arah arah;

    public enum Arah {
        ATAS, BAWAH, KIRI, KANAN
    }

    public Snake(int startX, int startY) {
        tubuh = new ArrayList<>();
        tubuh.add(new Point(startX, startY));
        arah = Arah.KANAN;
    }

    public void pergerakan() {
        Point kepala = tubuh.get(0);
        Point kepalaBaru = (Point) kepala.clone();

        switch (arah) {
            case ATAS:
                kepalaBaru.translate(0, -1);
                break;
            case BAWAH:
                kepalaBaru.translate(0, 1);
                break;
            case KIRI:
                kepalaBaru.translate(-1, 0);
                break;
            case KANAN:
                kepalaBaru.translate(1, 0);
                break;
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
        tubuh.add(new Point(-1, -1));
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
        g.setColor(Color.GREEN);
        Point kepala = tubuh.get(0);
        g.fillRoundRect(kepala.x * 20, kepala.y * 20, 20, 20, 20, 20);

        for (int i = 1; i < tubuh.size(); i++) {
            Point segmen = tubuh.get(i);
            g.fillRoundRect(segmen.x * 20, segmen.y * 20, 20, 20, 20, 20);
        }
    }

    public int getPanjangTubuh() {
        return tubuh.size();
    }
}
