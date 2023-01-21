import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ppt5 {
    public static Container c;
    public static JTextField text1,text2;
    public static JButton swap;
    public static void main(String[] args) {
        ppt1 t = new ppt1();
        JFrame frame = new JFrame("My Frame");
        frame.setLayout(null);
        frame.setBounds(100, 100, 600, 500);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        c = frame.getContentPane();
        c.setBackground(new Color(25,234,23));
        text1 = new JTextField(20);
        text1.setBounds(100,100,150,30);
        text1.setBackground(Color.YELLOW);
        text1.setForeground(Color.BLUE);
        c.add(text1);

        text2 = new JTextField(20);
        text2.setBounds(400,100,130,30);
        text2.setBackground(Color.YELLOW);
        text2.setForeground(Color.BLUE);
        c.add(text2);

        swap = new JButton("SWAP");
        swap.setBounds(200,200,100,30);
        c.add(swap);
        swap.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String t1 = text1.getText();
                String t2 = text2.getText();
                text1.setText(t2);
                text2.setText(t1);
            }
        });
        frame.setVisible(true);
    }
}
