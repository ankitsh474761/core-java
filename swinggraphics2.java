import javax.swing.*;
import java.awt.*;

//linked with swinggraphics3
public class swinggraphics2 extends JFrame {
    swinggraphics2(){
        setBounds(100,100,500,600);
        setTitle("MY FRAME");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        swinggraphics3 panel = new swinggraphics3(780,560);
        panel.setBackground(Color.black);
        add(panel);

    }
    public static void main(String[] args) {
        new swinggraphics2().setVisible(true);
    }
}
