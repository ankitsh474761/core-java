import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class mst {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        Container c = f.getContentPane();
        f.setBounds(100,200,600,600);
        f.setVisible(true);
        f.setLayout(null);

        JMenuBar menuBar = new JMenuBar();
        JMenu file = new JMenu("File");
        JMenu edit = new JMenu("edit");

        JMenuItem newk = new JMenuItem("new");
        JMenuItem open = new JMenuItem("Open");
        JMenuItem save = new JMenuItem("save");

        JMenu printing = new JMenu("print");

        JMenuItem printing1 = new JMenuItem("print");
        JMenuItem printing2 = new JMenuItem("print");

        JMenuItem cut = new JMenuItem("cut");
        JMenuItem copy = new JMenuItem("copy");
        JMenuItem paste = new JMenuItem("paste");
        JMenuItem selectALl = new JMenuItem("select all");

        file.add(newk);
        file.add(open);
        file.add(save);
        file.add(printing);
        printing.add(printing1);
        printing.add(printing2);
        file.add(printing);


        edit.add(cut);
        edit.add(copy);
        edit.add(paste);
        edit.add(selectALl);

        menuBar.add(file);
        menuBar.add(edit);

        f.setJMenuBar(menuBar);

        newk.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("new file ");
            }
        });

        open.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("file opened ");
            }
        });

        save.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("file saved successfully");
            }
        });

        printing.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("printing file");
            }
        });

        cut.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("cutting text");
            }
        });

        copy.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("copying text");
            }
        });

        paste.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("pasting the text");
            }
        });

        selectALl.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("selecting all text");
            }
        });
    }
}
