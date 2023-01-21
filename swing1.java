import javax.swing.*;
import java.awt.*;

public class swing1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setBounds(20,20,300,400);//setLocation+setSizee
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("MY frame");
        ImageIcon icon = new ImageIcon("C:\\Users\\ankitsh671\\IdeaProjects\\training\\src\\Ok-icon.png");//
        //copy the image in the folder
        frame.setIconImage(icon.getImage());

        Container c = frame.getContentPane();//getcontenpane is a type of Container
        // container is contained in awt

        Color color = new Color(255,34,223);
       // c.setBackground(Color.red);
        c.setBackground(color);
        frame.setResizable(false);//also disables the maximizee in frame

    }
}
