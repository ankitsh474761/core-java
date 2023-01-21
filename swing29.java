import javax.swing.*;
import java.awt.*;

//dynamic JLIst
public class swing29 extends JFrame {
    JTextField field;
    JButton btn,btn1,btn2;
    swing29(){
        setSize(800,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
        setLayout(new GridLayout(1,2));

        JList list = new JList();
        list.setVisibleRowCount(3);
        JPanel panel = new JPanel();
        add(panel);
        panel.add(new JScrollPane(list));

        DefaultListModel model = new DefaultListModel();
        model.addElement("10th");
        model.addElement("+2");
        model.addElement("Graduation");
        model.addElement("Post Graduation");
        list.setModel(model);


        JPanel panel2 = new JPanel();
        add(panel2);

        field = new JTextField();
       // field.setSize(200,100);
       field.setBounds(500,100,200,70);
        btn = new JButton();
        btn1 = new JButton();
        btn2 = new JButton();

      btn.setBounds(200,50,50,50);

        panel2.add(field);
        panel2.add(btn);
        panel2.add(btn1);
        panel2.add(btn2);

        revalidate();
    }

    public static void main(String[] args) {
        new swing29();
    }
}
