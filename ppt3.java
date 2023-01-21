import javax.swing.*;
import java.awt.*;
public class ppt3 {
    public static JTextField t1, t2, t3, t4, t5;
    public static Container c;
    public static void main(String[] args) {
        ppt1 t = new ppt1();
        JFrame frame = new JFrame("My Frame");
        frame.setLayout(null);
        frame.setBounds(100, 100, 600, 500);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
          c = frame.getContentPane();
          c.setBackground(new Color(25,234,23));
                      t1 = new JTextField(10);
                      t1.setBounds(100,100,200,20);
                      t1.setText("Hello World");                     //setText()
                      Font f = new Font("Arial",Font.BOLD,23);
                      t1.setFont(f);                              //setFont()
        System.out.println(t1.getColumns());//getColumns()
        System.out.println(t1.getText());   //getText()
        System.out.println("the size is:"+t1.getPreferredSize());
                  t1.setColumns(20);
                  t1.setForeground(Color.green);
                  t1.setBackground(Color.YELLOW);
                  c.add(t1);
        frame.setVisible(true);
    }
}
