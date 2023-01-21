//item listener on JCheckBox MenuItem

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

class Myf3 extends JFrame implements ItemListener {
    JTextArea ta;
    JMenuBar menuBar;
    JMenu mymenu;
    JCheckBoxMenuItem c1;
    Myf3(){
        Container c = getContentPane();
        c.setLayout(null);

        menuBar = new JMenuBar();
        mymenu = new JMenu("File");

        c1 = new JCheckBoxMenuItem("Print");
        mymenu.add(c1);
        menuBar.add(mymenu);
        this.setJMenuBar(menuBar);
        c1.addItemListener(this);


        ta = new JTextArea();

        ta.setBounds(200,50,100,100);
        ta.setBackground(Color.YELLOW);
        c.add(ta);
    }
    public void itemStateChanged(ItemEvent e){
        if(c1.isSelected()){
            ta.setText("Print is on..");
        }else{
            ta.setText("Print is off..");
        }
    }
}
public class swing20 {
    public static void main(String[] args) {
        Myf3 f = new Myf3();
        f.setTitle("Item Event1");
        f.setBounds(100,100,400,500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);

    }
}
