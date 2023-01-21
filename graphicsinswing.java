import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

//anti-aliasing we need RederingHints

public class graphicsinswing extends JComponent {
    private int width;
    private int height;

    public  graphicsinswing(int w,int h){
        width = w;
        height = h;
    }
    protected void paintComponent(Graphics g){
        Graphics2D g2d = (Graphics2D)g;

        RenderingHints rh = new RenderingHints(
        RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);

        g2d.setRenderingHints(rh);
        Rectangle2D.Double r = new Rectangle2D.Double(0,0,width,height);
        g2d.setColor(new Color(100, 237, 205));
        g2d.fill(r);
        Ellipse2D.Double r1 = new Ellipse2D.Double(200,78,100,100);
        g2d.setColor(Color.RED);
        g2d.fill(r1);

        Line2D.Double line = new Line2D.Double(100,250,300,75);
        g2d.setColor(Color.BLACK);
        g2d.draw(line);



    }
    public static void main(String[] args) {

    }
}
