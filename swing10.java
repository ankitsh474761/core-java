import javax.swing.*;
import java.awt.*;

//JCheckBox
public class swing10 {
    public static void main(String[] args) {
        Container c ;
        JFrame frame = new JFrame("MY frame");
        c= frame.getContentPane();
        frame.setBounds(100,100,400,500);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        c.setLayout(null);
        JCheckBox c1 = new JCheckBox("High School");
        JCheckBox c2 = new JCheckBox("Intermediate");
        JCheckBox c3 = new JCheckBox("Graduation");
        JCheckBox c4 = new JCheckBox("PostGraduation");

        c1.setBounds(100,50,200,20);
        c2.setBounds(100,100,200,20);
        c3.setBounds(100,150,200,20);
        c4.setBounds(100,200,200,20);

        c.add(c1);
        c.add(c2);
        c.add(c3);
        c.add(c4);

        c1.setSelected(true);//c1 is already selected

        c4.setEnabled(false);//c4 will not be selected anymore

        Font f = new Font("arial",Font.BOLD,20);
        c1.setFont(f);
        c2.setFont(f);
        c3.setFont(f);
        c4.setFont(f);
        frame.setVisible(true);
    }
}
