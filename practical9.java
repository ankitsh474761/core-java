import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener ;
        import java.awt.event.ActionEvent;
public class practical9
{
    practical9()
    {  JFrame f = new JFrame("Button Example");

        JPanel p = new JPanel();
        Container c = f.getContentPane();
        c.setBackground(new Color(255,223,123));


//submit button
        JButton b =new JButton("SUBMIT");
        b.setBounds(200,200,140,40);
        b.setFont(new Font("Arial",Font.BOLD,20));
//        b.setForeground(Color.red);
//        b.setBackground(Color.green);

//enter name label
        JLabel label = new JLabel();

        label.setText("Enter your name:");
        label.setBounds(50,2,300,100);
        label.setFont(new Font("Arial",Font.BOLD,15));

        label.setForeground(new Color(123,32,233));

        JLabel label2 = new JLabel("Enter your roll no:");
        label2.setBounds(50,50,300,100);
        label2.setFont(new Font("Arial",Font.BOLD,15));

        label2.setForeground(new Color(123,32,233));



//empty label which will show event after button is clicked
        JLabel label1= new JLabel();
        label1.setBounds(100,300,300,100);
        label1.setFont(new Font("Arial",Font.BOLD,15));
      //  label1.setForeground(Color.blue);


//text field to enter name
        JTextField textfield  = new JTextField("enter name");
        textfield.setBounds(200,45,130,20);
     //   textfield.setBackground(new Color(234,23,54));

        JTextField textField1 = new JTextField("enter rollno");
        textField1.setBounds(200,95,130,20);
      //  textField1.setBackground(new Color(234,23,54));

        //add to frame
        p.add(label1);
        f.add(label);
        f.add(label1);
        f.add(label2);
        f.add(textfield);
        f.add(textField1);
        f.add(b);
        f.setSize(300,300);
        f.setLayout(null);
        f.setVisible(true);
        f.setBounds(30,40,600,500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Action listener
        b.addActionListener( new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                if(arg0.getSource()==b){
//                    b.setBackground(Color.MAGENTA);
//                    c.setBackground(Color.GRAY);
                }
                label1.setText(" Your name has been submitted");
            }
        });
    }
    public static void main(String[] args) {
        new practical9();
    } }