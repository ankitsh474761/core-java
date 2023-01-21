import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

//Jlist in java
//it is a component that displays a set of objects and allows the user to select one or more items
//jlist is an easy to display an array of vectors
//constructors
//jlist()//static list
//jlist(Object[] items)//static list
//Jlist(Vector v)//dynamic list
//Jlist(ListModel m)//dynamic list
public class swing28 extends JFrame {
    String []items={"Math","Chemistry","Physics","English","Hindi","Sanskrit","Science","History","Civics"};
    JLabel label = new JLabel();
    swing28(){
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);


        JList list = new JList(items);
        list.setVisibleRowCount(5);
        list.setSize(200,200);
        JPanel  panel = new JPanel();
        panel.add(new JScrollPane(list));
        panel.setBackground(Color.green);
        panel.add(label);
        add(panel);
        revalidate();

        list.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if(e.getClickCount()==2){
                    int index =list.getSelectedIndex();
                    String item = (String)list.getSelectedValue();
                    label.setText("Selected item "+item+" Selected index "+index);
                }
            }
        });
    }

    public static void main(String[] args) {
        new swing28();
    }
}
