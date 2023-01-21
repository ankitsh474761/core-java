import javax.swing.*;
import java.awt.*;

//jscroll pane
public class swing30 {
    public static void main(String[] args) {
        JLabel label  = new JLabel();
        label.setBounds(100,300,100,100);
        JFrame frame = new JFrame("JScroll pane");
        frame.setLayout(new FlowLayout());
        JTextArea ta = new JTextArea(10,15);
       // JScrollPane sp = new JScrollPane(ta,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);

        JScrollPane sp = new JScrollPane(ta,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);

        frame.add(sp);
        frame.setSize(400,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setVisible(true);
    }
}
