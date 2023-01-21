import javax.swing.*;
import java.awt.*;

public class swinggraphics1 extends JFrame {
    swinggraphics1(){
        setBounds(100,100,800,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        jpanel1 panel = new jpanel1();
        panel.setBackground(Color.black);
        add(panel);
    }
    public static void main(String[] args) {
        new swinggraphics1().setVisible(true);
    }
}
