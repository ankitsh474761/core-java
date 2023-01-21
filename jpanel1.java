import javax.swing.*;
import java.awt.*;

public class jpanel1 extends JPanel {
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.red);
        g.setFont(new Font(Font.SANS_SERIF,Font.BOLD,30));

        g.drawString("hello world",50,23);

        g.drawLine(100,100,200,100);
        g.drawRect(550,200,100,50);
       // g.fillRect(200,300,100,30);
        g.drawOval(300,200,100,80);
        g.fillOval(400,300,100,80);
       // g.drawArc(200,400,100,200,90,90);// 0 and 90
         g.fillArc(200,400,100,200,0,90);// 0 and 90
        int x[]={100,200,300};
        int y[] ={400,300,400};
        int n =3;
        //g.drawPolygon(x,y,n);
        g.fillPolygon(x,y,n);
        int xpoints[]={100,300,400};
        int ypoints[]={400,300,400};
        int npoints = 3;
        g.drawPolyline(xpoints,ypoints,npoints);
        String url="C:\\Users\\ankitsh671\\IdeaProjects\\training\\src\\Ok-icon.png";
        Image image = new ImageIcon(url).getImage();

        g.drawImage(image,300,50,200,100,null);
        g.clearRect(0,0,500,500);





    }
}
