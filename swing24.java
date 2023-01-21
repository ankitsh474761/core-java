//focus listener

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class ans3 extends JFrame implements FocusListener {
    JTextField t;
    JTextArea ta;
    ans3(){
        Container c = getContentPane();
        c.setLayout(null);
        t = new JTextField("MY label");
        t.setEditable(false);
        t.setBounds(50,100,100,50);
        c.add(t);
        t.addFocusListener(this);

        ta = new JTextArea();
        ta.setBounds(200,50,300,400);
        ta.setLineWrap(true);
        c.add(ta);
    }


    @Override
    public void focusGained(FocusEvent e) {
        ta.setText(ta.getText()+"\n"+"Focus Gained");
    }

    @Override
    public void focusLost(FocusEvent e) {
        ta.setText(ta.getText()+"\n"+"Focus Lost");

    }
}
public class swing24{
    public static void main(String[] args) {
        ans3 f = new ans3();
        f.setTitle("Mouse Event");
        f.setResizable(false);
        f.setBounds(100,100,700,600);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}

