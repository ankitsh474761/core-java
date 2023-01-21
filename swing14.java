import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Locale;

//event listeners in java
class MYframe7 extends JFrame implements ActionListener {
    Container c;
    JButton btn;
    MYframe7(){
    c = this.getContentPane();
    c.setLayout(null);
    int x = 100;
    btn = new JButton("click me");
    btn.setBounds(x,100,100,30);
    c.add(btn);
    btn.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String str = btn.getText();
        btn.setText(str.toUpperCase());
    }
}
public class swing14 {
    public static void main(String[] args) {
        MYframe7 frame = new MYframe7();
        frame.setTitle("Action LIsteners");
        frame.setBounds(100,100,400,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
