//JTextArea

import javax.swing.*;
import java.awt.*;

public class swing9  {
    public static void main(String[] args) {
        Container c ;
        JFrame frame = new JFrame("MY frame");
        c= frame.getContentPane();
        frame.setBounds(100,100,400,500);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        c.setLayout(null);
        c.setBackground(Color.red);

        JTextArea textArea = new JTextArea();
        textArea.setBounds(100,100,150,50);
        textArea.setBackground(Color.YELLOW);
        textArea.setFont(new Font("arial",Font.BOLD,15));

        textArea.setLineWrap(true);//to visible the whole textfield

       // textArea.setEditable(false);

        c.add(textArea);

        frame.setVisible(true);
    }
}
