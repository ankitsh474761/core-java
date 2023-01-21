import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Locale;

//event listeners in java

class MYframe8 extends JFrame implements ActionListener {
    Container c;
    JButton btn;
    JTextField t1;
    MYframe8(){
        c = this.getContentPane();
        c.setLayout(null);
        int x = 100;

        btn = new JButton("click me");
        btn.setBounds(x,100,100,30);
        c.add(btn);

        t1 = new JTextField();
        t1.setBounds(200,100,100,30);
        c.add(t1);

        t1.setFont(new Font("arial",Font.ITALIC,20));
        t1.addActionListener(this);
        btn.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String str = t1.getText();

        t1.setText(str.toUpperCase());
    }
}
public class swing15 {
    public static void main(String[] args) {
        MYframe8 frame = new MYframe8();
        frame.setTitle("Action LIsteners");
        frame.setBounds(100,100,400,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
