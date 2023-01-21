import javax.swing.*;
import java.awt.*;

public class graphics extends JPanel {
    public void paint(Graphics g){
//       super.paintComponent (g);
        g.drawRect(10,10,250,250);
        g.setColor(Color.YELLOW);
        g.fillOval(20, 20, 200, 200);

        g.setColor(Color.BLACK);
        g.fillOval(65, 75, 30, 30);
        g.fillOval(145, 75, 30, 30);

        g.fillOval(50, 110, 120, 60);

        g.setColor(Color.YELLOW);
        g.fillRect(50, 110, 120, 30);
        g.fillOval(50, 120, 120, 40);

    }
    public static void main(String[] args) {

        graphics g = new graphics();
        JFrame frame = new JFrame();
        Container c = frame.getContentPane();
        c.setBackground(Color.BLACK);
        frame.setBounds(100,100,400,500);
        frame.add(g);

        frame.setVisible(true);
    }
}
