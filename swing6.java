import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//event handling using java anonymous inner class
public class swing6 {
    public static void main(String[] args) {
        JFrame f = new JFrame("Action demo2");
        f.setBounds(100,100,700,500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
        Container c = f.getContentPane();
        c.setLayout(null);

        JButton btn = new JButton("click me");
        btn.setBounds(100,100,200,50);
       // btn.setEnabled(false);
        c.add(btn);

        //() inside we have to pass the object of the class to inside whom we are implementing
        //but instead of passing the object if we pass the definition of the class then that class is known as anonymous class
        btn.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e){
                c.setBackground(Color.red);
            }
        });

    }
}
