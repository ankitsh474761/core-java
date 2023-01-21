import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class ppt4 extends JFrame implements ActionListener {
    private JTextField text1;
    private JTextField text2;
    private JButton swap;
    public static Container c;
    public ppt4(){
        setTitle("swap program ");
        setVisible(true);
        c =this.getContentPane();
        c.setBackground(Color.gray);
        setBounds(100,100,350,600);
        setLayout(null);

        text1 = new JTextField(20);
        text1.setBackground(Color.yellow);
        text2 = new JTextField(20);
        text2.setBackground(Color.yellow);
        swap = new JButton("SWAP");

        swap.addActionListener(this);

        c.add(text1);
        c.add(text2);
        c.add(swap);
    }
    public void actionPerformed(ActionEvent e){
        System.out.println("Swap Values");
        String t2 = text1.getText();
        String t3 = text2.getText();

        System.out.println(t2+"******"+t3);

        String k;
        text1.setText(t3);
        text2.setText(t2);
    }

    public static void main(String[] args) {
        ppt4 s = new ppt4();
    }
}
