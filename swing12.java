//JMenu Bar

import javax.swing.*;
import java.awt.*;

//JMenuBar
public class swing12 {
    public static void main(String[] args) {
       // Container c ;
        JFrame frame = new JFrame("MENUBAR example");
       // c= frame.getContentPane();
        frame.setBounds(100,100,400,500);

        frame.setLocationRelativeTo(null);//it will set the location of the frame to the center

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

       // c.setLayout(null);

        JMenuBar menuBar = new JMenuBar();

        JMenu file = new JMenu("File");

        JMenuItem i1 = new JMenuItem("New");
        JMenuItem i2= new JMenuItem("Open");
        JMenuItem i3 = new JMenuItem("Save");

        file.add(i1);
        file.add(i2);
        file.add(i3);

        menuBar.add(file);

        JMenu edit = new JMenu("Edit");

        JMenuItem i4 = new JMenuItem("Undo");
        JMenuItem i5 = new JMenuItem("Redo");

        edit.add(i4);
        edit.add(i5);

        //menuBar.add(edit);
        file.add(edit);

        frame.setJMenuBar(menuBar);//it will add to the menubar
        frame.setVisible(true);
    }
}
