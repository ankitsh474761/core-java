import javax.swing.*;
import java.awt.*;

public class swinggraphics5 extends JPanel {
    int max_x,max_y;
    int x =0;
    int y =0;
    int ballWidth = 50;
    int ballHeight = 50;
    int speedX = 10;
    int speedY = 10;

    swinggraphics5(int w , int h){
        this.max_x = w - ballWidth;
        this.max_y = h - ballHeight;

    }
    public void paint(Graphics g){
        super.paint(g);

        g.setColor(Color.red);
        g.fillOval(x,y,ballWidth,ballHeight);

        if(x>max_x || x < 0)
            speedX = - speedX;

        if(y>max_y || y <0)
            speedY = -speedY;

        x = x+speedX;
        y = y+speedY;

        try {
            Thread.sleep(50);
        }
        catch (Exception e){
            e.printStackTrace();
        }

        repaint();

    }
}
