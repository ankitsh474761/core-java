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

class ak1 extends JFrame implements KeyListener {

     JTextArea ta;
    ak1(){
        Container c = getContentPane();
        c.setLayout(null);

        ta = new JTextArea();
        ta.setBounds(10,10,370,330);
        c.add(ta);
        ta.addKeyListener(this);
    }

    @Override
    public void keyPressed(KeyEvent e) {
        ta.setText(ta.getText()+"\n"+"key is pressed : "+e.getKeyChar());
       // ta.setText(String.valueOf(e.getKeyCode()));
    }

    @Override
    public void keyReleased(KeyEvent e) {
//        ta.setText(ta.getText()+"\n"+"key is released : "+e.getKeyChar());
        ta.setText("\n"+"key is released : "+e.getKeyChar());
    }

    @Override
    public void keyTyped(KeyEvent e) {
        ta.setText(ta.getText()+"\n"+"key is typed : "+e.getKeyChar());
    }
}
public class swing21 {
    public static void main(String[] args) {
       ak1 f = new ak1();
       f.setTitle("Key Event");
       f.setBounds(100,100,400,400);
       f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       f.setVisible(true);
    }
}
