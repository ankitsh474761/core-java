//joption pane 2nd

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class swing26{

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setBounds(100,100,400,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setLayout(new FlowLayout());

        JButton btn = new JButton("Plain");
        frame.add(btn);//by default frame has border layout so component appears in center

        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Plain message","message",JOptionPane.PLAIN_MESSAGE);//last message type
              //  JOptionPane.showMessageDialog(frame,"Plain message","Message",);
            }
        });
        JButton btn1 = new JButton("Information ");
        frame.add(btn1);   //by default frame has border layout so component appears in center
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame,"information message ","information",JOptionPane.INFORMATION_MESSAGE);
            }
        });

        JButton btn2 = new JButton("Question");
        frame.add(btn2);//by default frame has border layout so component appears in center
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame,"Question message","message",JOptionPane.QUESTION_MESSAGE);

            }
        });

        JButton btn3 = new JButton("Error ");
        frame.add(btn3);//by default frame has border layout so component appears in center
        btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame,"Error message","message",JOptionPane.ERROR_MESSAGE);

            }
        });

        JButton btn4 = new JButton("Warning");
        frame.add(btn4);//by default frame has border layout so component appears in center
        btn4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame,"Warning message","message",JOptionPane.WARNING_MESSAGE);
            }
        });



    }
}

