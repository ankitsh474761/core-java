import javax.swing.*;
import java.awt.*;

//JPassword Field
public class swing4 {
    public static void main(String[] args) {

        JFrame frame = new JFrame();

        frame.setBounds(20, 20, 600, 600);//setLocation+setSizee
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("MY frame");


        Container c = frame.getContentPane();
//        Color color = new Color(124,56,233);
//        c.setBackground(color);
        c.setBackground(new Color(124,56,233));
        c.setLayout(null);

        JPasswordField pass = new JPasswordField();
        pass.setBounds(100,50,120,30);
        c.add(pass);

        pass.setText("123456");
        pass.setFont(new Font("Arial",Font.PLAIN,30));

        pass.setForeground(Color.GREEN);
        pass.setBackground(Color.YELLOW);

        pass.setEchoChar('*');
        pass.setEchoChar((char)0);//to show the passoword


        frame.setVisible(true);
    }
}
