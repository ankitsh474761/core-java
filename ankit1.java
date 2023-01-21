import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ankit1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("MY FRAME");
        Container c = frame.getContentPane();
        c.setLayout(null);
        frame.setBounds(100,100,300,400);
        JButton s = new JButton("click me");
        s.setBounds(100,100,100,50);
        c.add(s);
        s.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                c.setBackground(Color.gray);
            }
        });
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        c.setBackground(Color.GREEN);

        frame.setVisible(true);
    }
}
