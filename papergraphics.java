import javax.swing.*;
import java.awt.*;

public class papergraphics extends JPanel {
    @Override
    public void paint(Graphics g){
        g.setColor(new Color(20, 28, 147));
        g.drawRect(50,50,30,30);

        g.setColor(new Color(233,34,45));
        g.drawOval(100,200,30,30);

        g.setColor(new Color(233,54,56));
        g.drawRect(100,50,30,30);

        g.setColor(new Color(100,0,0));
        g.drawOval(200,40,30,30);

        g.setColor(new Color(200,0,0));
        g.drawRoundRect(100,300,40,40,20,20);

        g.fillRect(20,200,40,40);
    }

    public static void main(String[] args) {
        papergraphics g = new papergraphics();
        JFrame f = new JFrame();
        Container c = f.getContentPane();

        f.setBounds(200,200,600,600);

        c.add(g);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
