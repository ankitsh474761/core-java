import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//event handling using another class
public class swing7 {
    public static Container c;
    public static void main(String[] args) {
        JFrame f = new JFrame("Action demo2");
        f.setBounds(100,100,700,500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
         c = f.getContentPane();
        c.setLayout(null);

        JButton red = new JButton("RED");
        JButton yellow = new JButton("YELLOW");
        JButton green = new JButton("GREEN");

        red.setBounds(100,100,100,50);
        yellow.setBounds(100,200,100,50);
        green.setBounds(100,300,100,50);

        c.add(red);
        c.add(yellow);
        c.add(green);

        red.addActionListener(new Redclass());
        yellow.addActionListener(new yellowclass());
        green.addActionListener(new greenclass());

        f.setVisible(true);
    }
}
    class Redclass implements ActionListener{
        public void actionPerformed(ActionEvent e){
            swing7.c.setBackground(Color.red);//because c is not a part of this class so we have to write c with the class name
        }
}
class yellowclass implements ActionListener{
    public void actionPerformed(ActionEvent e){
        swing7.c.setBackground(Color.YELLOW);//because c is not a part of this class so we have to write c with the class name
    }
}
class greenclass implements ActionListener{
    public void actionPerformed(ActionEvent e){
        swing7.c.setBackground(Color.green);//because c is not a part of this class so we have to write c with the class name
    }
}
