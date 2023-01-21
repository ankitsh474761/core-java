import javax.swing.*;
import java.awt.*;

public class oval extends JPanel {
    @Override
    public void paint(Graphics g) {
        g.setColor(Color.RED);
        g.drawOval(40,40,100,60);

        g.setColor(Color.YELLOW);
        g.fillOval(100,100,100,100);
    }

    public static void main(String[] args) {
        oval g = new oval();
        JFrame f = new JFrame();
        f.setSize(500,500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = f.getContentPane();
        c.setBackground(Color.gray);
        c.add(g);
        f.setVisible(true);
    }
}
