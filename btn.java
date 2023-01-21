
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class btn {
    btn(){
        JFrame f = new JFrame(" Button Example ");
        JButton b = new JButton(" SUBMIT ");
        b.setBounds(100,350,140,40);
        JLabel label = new JLabel();
        label.setText(" Enter Your Name : ");
        label.setBounds(10,10,130,100);
        JLabel label1 = new JLabel();
        label1.setText(" Enter Your Roll Number : ");
        label1.setBounds(5,50,150,100);
        JLabel label2 = new JLabel();
        label2.setBounds(30,380,400,100);
        label2.setFont(new Font("arial",Font.BOLD,15));
        JTextField textField = new JTextField();
        textField.setBounds(180,50,130,30);
        JTextField textField1 = new JTextField();
        textField1.setBounds(180,90,130,30);
        f.add(label);
        f.add(label1);
        f.add(label2);
        f.add(textField);
        f.add(textField1);
        f.add(b);
        f.setBounds(200,200,600,500);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label2.setText(" Your Details Has Been Submitted ");

            }
        });
        JLabel label4 = new JLabel("Select Your Branch ");
        label4.setBounds(5,100,300,100);
        f.add(label4);
        JCheckBox ch = new JCheckBox("CSE");
        ch.setBounds(5,170,50,20);
        f.add(ch);
        JCheckBox ch1 = new JCheckBox("ME");
        ch1.setBounds(70,170,50,20);
        f.add(ch1);
        JCheckBox ch2 = new JCheckBox("ECE");
        ch2.setBounds(130,170,50,20);
        f.add(ch2);
        JCheckBox ch3 = new JCheckBox("CE");
        ch3.setBounds(180,170,50,20);
        f.add(ch3);
       JTextArea txt = new JTextArea();
       txt.setBounds(100,220,200,100);
       txt.setEditable(false);
       f.add(txt);
        ch.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if(e.getStateChange()==1){
                    txt.setText("Selected Branch is CSE");
                }}
        });
        ch1.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if(e.getStateChange()==1){
                    txt.setText("Selected Branch is ME");
                }}
        });
        ch2.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if(e.getStateChange()==1){
                    txt.setText("Selected Branch is ECE");
                }}
        });
        ch3.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if(e.getStateChange()==1){
                    txt.setText("Selected Branch is CE");
                }}
        });

    }
    public static void main(String[] args) {
        new btn();
    }
}