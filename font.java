import javax.swing.*;
import java.awt.*;

public class font {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        Font font = new Font("Arial",Font.BOLD,20);
        JLabel label = new JLabel("ankit sharma");
        label.setFont(font);
        label.setForeground(new Color(36, 46, 187));
        label.setBounds(20,20,200,30);
        f.setLayout(null);
        f.add(label);
        f.setBounds(100,100,500,400);
        f.setVisible(true);
    }
}
