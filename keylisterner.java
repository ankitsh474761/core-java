import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class keylisterner {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        Container c = f.getContentPane();
        f.setVisible(true);
        f.setBounds(100,100,600,600);
        f.setLayout(null);

        JTextField textField = new JTextField();
        textField.setBounds(100,100,200,200);
        textField.setFont(new Font("Arial",Font.BOLD,30));
        textField.setBackground(new Color(123,12,89));
        textField.setEnabled(true);
        textField.setEditable(false);
        c.add(textField);
        textField.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                textField.setText("key typed");
                System.out.println(e.getKeyChar());
                System.out.println( e.getKeyCode());
                System.out.println( e.getID());
            }

            @Override
            public void keyPressed(KeyEvent e) {
                textField.setText("key pressed");
            }

            @Override
            public void keyReleased(KeyEvent e) {
                textField.setText("key released");
            }
        });
    }
}
