import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
public class practical13 extends JFrame{
    private JList list;
    private static String[] colorNames = {"blue","green","yellow","orange","red","black","grey","white"};
    private static Color[] colors = {Color.BLUE,Color.GREEN,Color.YELLOW,Color.ORANGE,Color.RED,Color.BLACK,Color.GRAY,Color.WHITE};
    public practical13() {
        setTitle("JList Demo Example");
       setLayout(new FlowLayout(FlowLayout.LEFT,100,100));
        list = new JList(colorNames);
        list.setBounds(10,100,200,200);
        list.setVisibleRowCount(5);//number of elements to visible as row in list
        list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        add(list);
//choose the selection mode in list
        add(new JScrollPane(list));
//adding event listener on JList
        list.addListSelectionListener(
                new ListSelectionListener() {
                    public void valueChanged(ListSelectionEvent e) {
                        getContentPane().setBackground(colors[list.getSelectedIndex()]);}
                });
        JTextField text  = new JTextField("hi");
        text.setBounds(200,100,100,100);
        add(text);
    }
    public static void main(String[] args)
    {practical13 jl = new practical13();
        jl.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jl.setSize(600, 500);
        jl.setVisible(true);
    }}