//JCombobox

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class swing11 {
    public static void main(String[] args) {
        Container c ;
        JFrame frame = new JFrame("MY Combobox");
        c= frame.getContentPane();
        frame.setBounds(100,100,400,500);

        frame.setLocationRelativeTo(null);//it will set the location of the frame to the center

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        c.setLayout(null);
        String values[] = {"A","B","C","D","E"};
        JComboBox c1 = new JComboBox(values);
        c1.setBounds(100,100,100,30);
        c.add(c1);

        c1.setEditable(true);

       // c1.setSelectedItem("B");

        c1.setSelectedIndex(3);//it will display the element in the combobox of index 3
        c1.setFont(new Font("arial",Font.ITALIC,20));

        JButton btn = new JButton("Ok");
        btn.setBounds(100,200,100,30);
        c.add(btn);

        JLabel label = new JLabel(" ");
        label.setBounds(100,300,100,30);
        c.add(label);

        c1.addItem("ak");
        c1.removeItem("C");

        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              //  String item =(String) c1.getSelectedItem();
                String item = String.valueOf(c1.getSelectedIndex());
                label.setText(item);
            }
        });
        frame.setVisible(true);
    }
}
