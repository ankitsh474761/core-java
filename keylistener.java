//Key listener
//keylistener
//void keyPressed()
//void keyTyped()
//void keyReleased()
//addkeyListener()

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

class ak2 extends JFrame implements KeyListener {
    JTextArea ta;

    ak2(){
        Container c = getContentPane();
        c.setLayout(null);

        ta = new JTextArea();
        ta.setBounds(10,10,370,330);
        c.add(ta);
        ta.addKeyListener(this);
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int keycode = e.getKeyCode();
        if(keycode== KeyEvent.VK_F1) {
            String str = "f1 is pressed";
            ta.setText(str);
        }
        if(keycode== KeyEvent.VK_CONTROL) {
            String str = "CONTROL is pressed";
            ta.setText(str);
        }
      //  ta.setText(ta.getText()+"\n"+"key is pressed : "+e.getKeyChar());
    }
    @Override
    public void keyReleased(KeyEvent e) {
        ta.setText(ta.getText()+"\n"+"key is released : "+e.getKeyChar());
    }

    @Override
    public void keyTyped(KeyEvent e) {

        ta.setText(ta.getText()+"\n"+"key is typed : "+e.getKeyChar());
    }
}
public class keylistener {
    public static void main(String[] args) {
        ak2 f = new ak2();
        f.setTitle("Key Event");
        f.setBounds(100,100,400,400);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
