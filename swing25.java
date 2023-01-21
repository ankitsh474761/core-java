//joption pane

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class swing25 {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setBounds(100,100,400,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setLayout(null);
       //frame.setLayout(new FlowLayout());

        JButton btn = new JButton("Click me");

        //btn.setPreferredSize(new Dimension(100,100));
        btn.setBounds(130,100,100,100);
        frame.add(btn);             //by default frame has border layout so component appears in center
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               String str =  JOptionPane.showInputDialog("Enter your name");
                if(str.length() > 0)
                    System.out.println("the name of the user is : "+str);
            }
        });
    }
}
