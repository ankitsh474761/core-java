import javax.swing.*;
import java.awt.*;

public class swinggraphics4 extends JFrame {
    swinggraphics4(){
        setBounds(100,100,500,600);
        setTitle("MY FRAME");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        swinggraphics5 panel = new swinggraphics5(780,560);
        panel.setBackground(Color.black);
        add(panel);
    }

    public static void main(String[] args) {
         new swinggraphics4().setVisible(true);
    }
}
