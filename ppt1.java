import javax.swing.*;
import java.awt.*;
public class ppt1 extends JTextField  {
    public static JTextField t1,t2,t3,t4,t5;
    public static Container c ;
    public static void main(String[] args) {
        ppt1 t = new ppt1();
        JFrame frame = new JFrame("My Frame");
        frame.setLayout(null);
        frame.setBounds(100,100,400,500);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        c = frame.getContentPane();
         t1 = new JTextField();//it will simply constructs a new TextField()
        t1.setBounds(20,20,200,20);
        c.add(t1);
                   t2 = new JTextField("Enter your name here");
                   t2.setBounds(20,50,200,20);
                   c.add(t2);
        t3 = new JTextField(4);
        t3.setBounds(20,90,200,20);
        c.add(t3);
                   t4 = new JTextField("Ankit Sharma",10);
                   t4.setBounds(20,140,200,20);
                   c.add(t4);
        frame.setVisible(true);
    }
}
