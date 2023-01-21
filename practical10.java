import java.awt.GridLayout;
import javax.swing.*;
import java.awt.event.ItemEvent;

public class practical10 {
    public static JCheckBox checkBox1 = new JCheckBox("CSE");
    public static JCheckBox checkBox2 = new JCheckBox("ME");
    public static JCheckBox checkBox3 = new JCheckBox("ECE");
    public static JCheckBox checkBox4 = new JCheckBox("EE");

    public static void main(String[] args) {
        JFrame frame = new JFrame("Checkbox with event listener");
        JFrame.setDefaultLookAndFeelDecorated(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //define the panel to hold the checkbox
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JLabel msg = new JLabel("", JLabel.CENTER);
        // Set up the title for the panel
        panel1.setBorder(BorderFactory.createTitledBorder("Enter the name of the BRANCH"));
        panel2.setBorder(BorderFactory.createTitledBorder("Output"));
        //Add the checkbox into the panels
        panel1.add(checkBox1);
        panel1.add(checkBox2);
        panel1.add(checkBox3);
        panel1.add(checkBox4);
        panel2.add(msg);

        //add action listener
        checkBox1.addItemListener((ItemEvent e)->{
            if(e.getStateChange()==1){
                msg.setText("CSE is selected");
            }
            else{
                msg.setText("CSE is unselected");
            }
        });
        checkBox2.addItemListener((ItemEvent e)->
        {
            if(e.getStateChange()==1){
            msg.setText("ME is selected");
        }
            else {
                msg.setText("ME is unselected");
            }
        });
        checkBox3.addItemListener((ItemEvent e)->{
            if(e.getStateChange()==1){
                msg.setText("ECE is selected ");
            }else{
                msg.setText("ECE is unselected");
            }
        });
        checkBox4.addItemListener((ItemEvent e)->{
            if(e.getStateChange()==1){
                msg.setText("EE is selected");
            }
            else{
                msg.setText("EE is unselected ");
            }
        });

        //add panel into the frame
        frame.setLayout(new GridLayout(2,1));
        frame.add(panel1);
        frame.add(panel2);

        //set hte window to be visible as the default to be false
        frame.pack();
        frame.setVisible(true);
        frame.setBounds(200,300,400,500);

    }
}