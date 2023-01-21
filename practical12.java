import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
public class practical12 extends JFrame {
 private JList list;
 private JScrollPane jsp;
 private Vector data;

 public practical12() {
  this.setTitle("JListItemSeletion Test");
  list = new JList();
  data = new Vector();
  data.addElement("India");
  data.addElement("Australia");
  data.addElement("Europe");
  data.addElement("England");
  data.addElement("New Zealand");
  data.addElement("South Africa");
  list.setListData(data);
  list.setSelectedIndex(0);
  list.setForeground(new Color(25,234,23));
  list.addMouseListener(new MouseAdapter() {
   public void mouseClicked(MouseEvent me) {
    if (me.getClickCount() == 1) {
     JList target = (JList) me.getSource();
     int index = target.locationToIndex(me.getPoint());
     if (index >= 0) {
      Object item = target.getModel().getElementAt(index);
      JOptionPane.showMessageDialog(null, item.toString());
     }
    }
   }
  });

  System.out.println(list.getSelectedIndex());
  System.out.println(list.getSelectedValue());
  System.out.println(list.getModel());

  jsp = new JScrollPane(list);
  add(jsp, BorderLayout.NORTH);
  setSize(400, 275);
  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  setLocationRelativeTo(null);
  setVisible(true);
 }

 public static void main(String args[]) {
  new practical12();
 }
}