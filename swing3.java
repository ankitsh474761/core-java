import javax.swing.*;
import java.awt.*;

//textfield
public class swing3 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();

        frame.setBounds(20, 20, 600, 600);//setLocation+setSizee
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("MY frame");

        Container c = frame.getContentPane();
        c.setLayout(null);
        JTextField t1 = new JTextField();
        t1.setBounds(100,50,220,30);
        c.add(t1);
        t1.setText("Ankit Sharma ");
        Font f = new Font("Arial",Font.BOLD,23);
        t1.setFont(f);

        t1.setForeground(Color.green);
        t1.setBackground(Color.YELLOW);

        t1.setEditable(false);

        frame.setVisible(true);
    }
}
