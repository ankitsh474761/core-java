import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class ankit {
    public static void main(String[] args) {
        JFrame f = new JFrame("Ankit Sharma");
        JButton b = new JButton("Message Dialog");
        b.setBounds(10, 20, 200, 30);
        JButton b1 = new JButton("Confirm Dialog");
        b1.setBounds(10, 70, 200, 30);
        JButton b2 = new JButton("Input Dialog");
        b2.setBounds(10, 120, 200, 30);
        f.add(b2);
        f.add(b1);
        f.add(b);
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(f, "You clicked on button Message Dialog", "message",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        });
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showConfirmDialog(f, "Are you sure");
            }
        });
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showInputDialog(f, "Enter your name");
            }
        });
        f.setSize(500, 500);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
    }
}