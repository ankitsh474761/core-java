import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class menubar0 extends JFrame implements ActionListener {
    JMenuBar menuBar;
    JMenu file,edit;
    JMenuItem i1,i2,i3,i4,i5,i6,i7;
    menubar0(){
        Container c  = getContentPane();
        JFrame f = new JFrame();

        c.setLayout(null);
        f.setVisible(true);
        f.setBounds(200,200,500,500);

        menuBar = new JMenuBar();

        file = new JMenu("file");
        edit = new JMenu("edit");

        i1 = new JMenuItem("new");
        i2 = new JMenuItem("open");
        i3 = new JMenuItem("save");
        i4 = new JMenuItem("cut");
        i5 = new JMenuItem("copy");
        i6 = new JMenuItem("paste");
        i7 = new JMenuItem("select all");

        menuBar.add(file);
        menuBar.add(edit);

        file.add(i1);
        file.add(i2);
        file.add(i3);

        edit.add(i4);
        edit.add(i5);
        edit.add(i6);
        edit.add(i7);

        this.setJMenuBar(menuBar);

       i1.addActionListener(this);
       i2.addActionListener(this);
       i3.addActionListener(this);
       i4.addActionListener(this);
       i5.addActionListener(this);
       i6.addActionListener(this);
       i7.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==i1){
            System.out.println("new ");
        }
        if(e.getSource()==i2){
            System.out.println("open");
        }
        if(e.getSource()==i3){
            System.out.println("save");
        }
        if(e.getSource()==i4){
            System.out.println("cut");
        }
        if(e.getSource()==i5){
            System.out.println("copy");
        }
        if(e.getSource()==i6){
            System.out.println("paste");
        }
        if(e.getSource()==i7){
            System.out.println("select all");
        }
    }

    public static void main(String[] args) {
        menubar0 meni = new menubar0();
    }
}
