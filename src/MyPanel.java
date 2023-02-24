import javax.swing.*;
import java.awt.*;

public class MyPanel extends JPanel {
    public MyPanel() {
        setBorder(BorderFactory.createLineBorder(Color.black));
    }

    public Dimension getPrefferedSize() {
        return new Dimension(1500, 700);
    }

    private int x = 0;
    private int y = 0;
    private int width = 100;
    private int height = 100;

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.drawLine(x, y, width, height);
    }
}