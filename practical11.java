import java.awt.*;
import java.awt.event.*;

public class practical11 {
    public static void main(String[] args) {
        Frame f = new Frame("CheckBoxGroup");
        CheckboxGroup cbg = new CheckboxGroup();
        Checkbox ch = new Checkbox("C++",cbg,true);
        ch.setBounds(100,40,100,20);
        f.add(ch);
        Checkbox ch1 = new Checkbox("Java",cbg,false);
        ch1.setBounds(100,100,100,20);
        f.add(ch1);
        Label label = new Label();
        label.setBounds(100,300,200,100);
        f.add(label);
        ch.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                label.setText("C++ checkbox: Selected");
            }
        });
        ch1.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                label.setText("Java Checkbox : Selected");
            }
        });
        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        f.setBounds(100,100,400,500);
        f.setLayout(null);
        f.setVisible(true);
    }
}
