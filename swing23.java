//mousemotion listener
//void mouseMoved()
//void mouseDragged()
//addMouseMotionListener()


import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

class ans1 extends JFrame implements MouseMotionListener {
    JLabel label;
    JTextArea ta;
    ans1(){
        Container c = getContentPane();
        c.setLayout(null);
        label = new JLabel("MY label");
        label.setFont(new Font("arial",Font.ITALIC,18));
        label.setBounds(50,100,100,50);
        c.add(label);

        label.addMouseMotionListener(this);

        ta = new JTextArea();
        ta.setBounds(200,50,300,400);
        ta.setLineWrap(true);
        c.add(ta);
    }


    @Override
    public void mouseDragged(MouseEvent e) {
        ta.setText(ta.getText()+"\n"+"Mouse dragged");
    }
    @Override
    public void mouseMoved(MouseEvent e) {
        ta.setText(ta.getText()+"\n"+"Mouse moved");
    }
}
public class swing23{
    public static void main(String[] args) {
        ans1 f = new ans1();
        f.setTitle("Mouse Event");
        f.setBounds(100,100,700,600);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}

