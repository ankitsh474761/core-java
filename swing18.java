//item listeners on radio button
import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

//item listener
//it fires on
//any item selected in a checkbox
//checkbox is clicked
//radiobutton is clicked
//choose a JCheckbox Menu item
//ItemListener
//void itemStateChanged()
//addItemListener()
class Myf1 extends JFrame implements ItemListener {
    JRadioButton male,female;
    JTextArea ta;
    Myf1(){
        Container c = getContentPane();
        c.setLayout(null);

        male = new JRadioButton("Male");
        female = new JRadioButton("Female");
        male.setBounds(50,50,100,20);
        female.setBounds(50,100,100,20);
        c.add(male);
        c.add(female);

        ButtonGroup grp = new ButtonGroup();
        grp.add(male);
        grp.add(female);

        male.addItemListener(this);
        female.addItemListener(this);


        ta = new JTextArea();

        ta.setBounds(200,50,100,100);
        ta.setBackground(Color.YELLOW);
        c.add(ta);
    }
    public void itemStateChanged(ItemEvent e){
      if(e.getSource()==male){
          ta.setText("Male is Clicked...");

      }
      if(e.getSource()==female){
          ta.setText("Female is Clicked....");
      }
    }
}
public class swing18 {
    public static void main(String[] args) {
        Myf1 f = new Myf1();
        f.setTitle("Item Event1");
        f.setBounds(100,100,400,500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);

    }
}
