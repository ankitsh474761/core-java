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

class Myf extends JFrame implements ItemListener {
    JComboBox combo;
    JTextArea ta;
    Myf(){
        Container c = getContentPane();
        c.setLayout(null);
        String []values={"a","b","c","d"};
        combo = new JComboBox(values);
        combo.setBounds(50,50,100,30);
        combo.addItemListener(this);
        c.add(combo);

        ta = new JTextArea();

        ta.setBounds(200,50,100,100);
        ta.setBackground(Color.YELLOW);
        c.add(ta);
    }
    public void itemStateChanged(ItemEvent e){
       // ta.setText((String)combo.getSelectedItem());
       String str1 =  combo.getSelectedItem().toString();
        ta.setText(str1);
    }
}
public class swing17 {
    public static void main(String[] args) {
        Myf f = new Myf();
        f.setTitle("Item Event1");
        f.setBounds(100,100,400,500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);

    }
}
