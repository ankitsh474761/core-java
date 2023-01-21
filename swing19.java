//item listener on CheckBox

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

class Myf2 extends JFrame implements ItemListener {
    JTextArea ta;
    JCheckBox c1,c2,c3,c4;
    Myf2(){
        Container c = getContentPane();
        c.setLayout(null);

        c1 = new JCheckBox("10th");
        c2 = new JCheckBox("12th");
        c3 = new JCheckBox("Graduation");
        c4 = new JCheckBox("Post-Graduation");

        c1.setBounds(50,50,100,30);
        c2.setBounds(50,100,100,30);
        c3.setBounds(50,150,100,30);
        c4.setBounds(50,200,100,30);

        c.add(c1);
        c.add(c2);
        c.add(c3);
        c.add(c4);

        c1.addItemListener(this);
        c2.addItemListener(this);
        c3.addItemListener(this);
        c4.addItemListener(this);


        ta = new JTextArea();

        ta.setBounds(200,50,100,100);
        ta.setBackground(Color.YELLOW);
        c.add(ta);
    }
    public void itemStateChanged(ItemEvent e){
        if(c1.isSelected()){
            ta.setText("10th");
        }
        if (e.getSource()==c2){
            ta.setText("12th");
        }
        if (c3.isSelected()){
            ta.setText(ta.getText()+"\n"+"Graduate");
        }
        if(c4.isSelected()){
            ta.setText("Post-Graduation");
        }
    }
}
public class swing19 {
    public static void main(String[] args) {
        Myf2 f = new Myf2();
        f.setTitle("Item Event1");
        f.setBounds(100,100,400,500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);

    }
}
