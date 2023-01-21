//JButton

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Myframe3 extends JFrame implements ActionListener {
    Container c;
    JButton btn = new JButton("RED");
    JButton btn1 = new JButton("YELLOW");
    JButton btn2 = new JButton("GREEN");
    JButton btn3 = new JButton("BLUE");

    Myframe3() {
        c = this.getContentPane();
        c.setLayout(null);

        // btn = new JButton("Click me");////we can also write here
//        btn.setBounds(100,100,100,50);
//        btn1.setBounds(100,150,100,50);
//        btn2.setBounds(100,200,100,50);
//        btn3.setBounds(100,250,100,50);

//        btn.setBounds(100,100,100,50);
//        btn1.setBounds(150,150,100,50);
//        btn2.setBounds(200,200,100,50);
//        btn3.setBounds(250,250,100,50);

        btn.setBounds(100, 100, 100, 50);
        btn1.setBounds(210, 100, 100, 50);
        btn2.setBounds(320, 100, 100, 50);
        btn3.setBounds(430, 100, 100, 50);

        c.add(btn);
        c.add(btn1);
        c.add(btn2);
        c.add(btn3);

        btn.addActionListener(this);
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
        System.out.println();

    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btn) {
            c.setBackground(Color.red);
        }
        if (e.getSource() == btn1) {
            c.setBackground(Color.yellow);
        }
        if (e.getSource() == btn2) {
            c.setBackground(Color.green);
        }
        if (e.getSource() == btn3) {
            c.setBackground(Color.blue);
        }
    }
}

    public class swing5 {
        public static void main(String[] args) {
            Myframe3 f = new Myframe3();
            f.setTitle("action demo");
            f.setBounds(100, 100, 700, 500);
            f.setVisible(true);
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
    }

