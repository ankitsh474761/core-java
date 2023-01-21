//JPanel
//components are of two types
//1.lightweight components-
//that can be added to some other components
//e.g JButton , JRadioButton etc.
//
//2.heavyweight components-
//that cannot be added to any other component
//e.g - JFrame ,JDialog etc.
//
//JPanel is a light weight component
//JPanel - JFrame
//2. JPanel is a COntainer also
//JLabel - JFrame
//JButton = JFrame
//JPanel = JPanel
import javax.swing.*;
import java.awt.*;

public class swing13 {

    public static void main(String[] args) {
        Container c ;
        JFrame frame = new JFrame("MY panel");
        c= frame.getContentPane();
        frame.setBounds(100,100,400,400);

        frame.setLocationRelativeTo(null);//it will set the location of the frame to the center

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        c.setLayout(null);
        JPanel panel = new JPanel();
       // panel.setLayout(null);
        panel.setBounds(0,0,200,200);
        panel.setBackground(Color.YELLOW);
        c.add(panel);

        JPanel panel1 = new JPanel();
        panel1.setBounds(0,200,100,150);
        panel1.setBackground(Color.GREEN);
        panel.add(panel1);

        JButton btn = new JButton("button");
        panel1.add(btn);

        frame.setVisible(true);

    }
}
