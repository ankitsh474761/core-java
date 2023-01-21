//MouseListener
//void mouseEntered()
//void mouseExited()
//void mousePressed()
//void mouseClicked()
//void mouseReleased()
//add MouseListener()

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

class ans extends JFrame implements MouseListener {
    JLabel label;
    JTextArea ta;
    ans(){
        Container c = getContentPane();
        c.setLayout(null);
        label = new JLabel("MY label");
        label.setFont(new Font("arial",Font.ITALIC,18));
        label.setBounds(50,100,100,50);
        c.add(label);

        label.addMouseListener(this);

        ta = new JTextArea();
        ta.setBounds(200,50,300,300);
        ta.setLineWrap(true);
        c.add(ta);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        ta.setText(ta.getText()+"\n"+"Mouse is clicked");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        ta.setText(ta.getText()+"\n"+"Mouse is entered");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        ta.setText(ta.getText()+"\n"+"Mouse is exited");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        ta.setText(ta.getText()+"\n"+"Mouse is pressed");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        ta.setText(ta.getText()+"\n"+"Mouse is released");
    }
}
public class swing22 {
    public static void main(String[] args) {
        ans f = new ans();
        f.setTitle("Mouse Event");
        f.setBounds(100,100,700,600);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
