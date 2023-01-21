import javax.swing.*;
import java.awt.*;

public class rectangle extends JPanel {
    @Override
    public void paint(Graphics g) {
        g.setColor(Color.RED);
        g.drawRect(10,10,30,40);

        g.setColor(Color.YELLOW);
        g.fillRect(10,70,30,40);

        g.clearRect(10,60,30,40);

         g.setColor(new Color(43, 34, 40));
         g.drawRoundRect(80,60,50,70,20,20);

         g.setColor(new Color(89,4,43));
         g.fillRoundRect(90,150,100,80,40,50);

    }

    public static void main(String[] args) {
        rectangle g = new rectangle();
        JFrame f = new JFrame();
        f.setSize(500,500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       // f.setLayout(null);
        Container c = f.getContentPane();
        c.setBackground(Color.gray);
        c.add(g);

     //   f.add(g);




        f.setVisible(true);

    }
}
