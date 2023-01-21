//joption pane

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class swing27 {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setBounds(100,100,400,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setLayout(new FlowLayout());

        JButton btn = new JButton("Click me");
        frame.add(btn);//by default frame has border layout so component appears in center
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            int sel = JOptionPane.showConfirmDialog(frame,"Do you want to exit","CONFIRM",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE);
            if(sel==JOptionPane.YES_OPTION)
                System.exit(0);
                //System.out.println("Yes option is selected");
            else if(sel == JOptionPane.NO_OPTION)
                System.out.println("no option is selected");
            else
                System.out.println("CAncel is selected");
            }
        });

    }
}
