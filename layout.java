import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class layout extends JFrame {
   layout(){
       //this.setLayout(null);
       this.setTitle("layout");
       setSize(500,500);
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       JButton btn2= new JButton();
       GridLayout grid = new GridLayout(2,2);
       this.add(btn2,grid);

       JButton btn = new JButton("button");
       this.add(btn,BorderLayout.EAST);

       JButton btn1 = new JButton("button1");
//       btn1.setPreferredSize(new Dimension(100,100));
//       btn1.setBounds(100,100,100,100);
       this.add(btn1,FlowLayout.CENTER);

       setVisible(true);
   }

    public static void main(String[] args) {
         new layout();
    }
}
