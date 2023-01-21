import javax.swing.*;
import java.awt.*;

//panel for swinggraphics2
public class swinggraphics3 extends JPanel {
    int x =0;
    int y = 100;
    int width = 100;
    int height = 50;
    int stepsize = 10;
    int max_x,max_y;

    swinggraphics3(int w,int h){
        this.max_x = w;
        this.max_y = h;

    }

    public void paint(Graphics g){
        super.paint(g);

        g.setColor(Color.WHITE);
        g.fillRect(x,y,width,height);

        if(x + width  > max_x || x < 0)//if frame width is greater than panel width reverse it
            stepsize = -stepsize;


        x = x + stepsize;
        try {
            Thread.sleep(40);
        }
        catch (Exception e){
            e.printStackTrace();
        }
        repaint();
    }

}
