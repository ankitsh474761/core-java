//how to create JRadioButton

import javax.swing.*;
import java.awt.*;

public class swing8 {
    public static void main(String[] args) {
        Container c ;
        JFrame frame = new JFrame("MY frame");
        c= frame.getContentPane();
        frame.setBounds(100,100,400,500);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        c.setLayout(null);
       // c.setBackground(Color.red);
        JRadioButton radioButton = new JRadioButton("Male");
        radioButton.setBounds(100,50,100,20);
        radioButton.setSelected(true);//by default it has been selected
        c.add(radioButton);

        JRadioButton radioButton1 = new JRadioButton("Female");
        radioButton1.setBounds(200,50,100,20);
        c.add(radioButton1);

        ButtonGroup gender = new ButtonGroup();
        gender.add(radioButton);
        gender.add(radioButton1);

        JRadioButton radioButton2 = new JRadioButton("General");
        radioButton2.setBounds(100,100,100,20);
        Font font = new Font("arial",Font.BOLD,20);
        radioButton2.setFont(font);
        radioButton2.setSelected(true);
        c.add(radioButton2);

        JRadioButton radioButton3 = new JRadioButton("SC");
        radioButton3.setBounds(200,100,100,20);
        c.add(radioButton3);

        ButtonGroup caste = new ButtonGroup();
        caste.add(radioButton2);
        caste.add(radioButton3);






        frame.setVisible(true);
    }
}
