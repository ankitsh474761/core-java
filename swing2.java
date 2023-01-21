import javax.swing.*;
import java.awt.*;

//label
public class swing2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setBounds(20, 20, 600, 600);//setLocation+setSizee
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("MY frame");
        Container c = frame.getContentPane();
        c.setLayout(null);
        JLabel label = new JLabel("Username");
        label.setBounds(100,50,200,30);
       // label.setText("Password");//changing name of label

        Font f = new Font("Arial", Font.PLAIN,30);
        label.setFont(f);
        c.add(label);
//
        ImageIcon icon = new ImageIcon("C:\\Users\\ankitsh671\\IdeaProjects\\training\\src\\Ok-icon.png");
        JLabel label1 = new JLabel(icon);
//          Font f1 = new Font("Arial", Font.PLAIN,30);
//          label1.setFont(f1);
          label1.setBounds(100,100,icon.getIconWidth(),icon.getIconHeight());
        c.add(label1);

//         JLabel label2 = new JLabel("Password");
//         label2.setBounds(100,150,200,30);
//         c.add(label2);

//        JLabel label3  = new JLabel("Password",icon,JLabel.CENTER);
//        label3.setIconTextGap(3);
//        label3.setBounds(100,250,icon.getIconWidth(),icon.getIconHeight());
//        c.add(label3);




    }

}
