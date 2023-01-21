import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//adding actionListener for buttons to perform some action after clicking on them
public class awt6 extends Frame {
    private TextField t,t1,t2,t3;
    private Button b,b1;
    awt6(){
        this.setVisible(true);

        this.setBounds(300,300,500,600);
        setBackground(Color.green);
        setTitle("My Frame");
        t = new TextField("test1");
        t1 = new TextField("test2");
        t2 = new TextField("test3");
        t3 = new TextField("test4");
        setLayout(new FlowLayout(FlowLayout.CENTER,40,40));
        t.setBackground(Color.yellow);
        t1.setBackground(Color.gray);
        t2.setBackground(Color.red);
        t3.setBackground(Color.darkGray);
        add(t);
        add(t1);
        add(t2);
        add(t3);

        b = new Button("Click me");
        b.setBackground(Color.green);
        b.setPreferredSize(new Dimension(200,30));
        add(b);
        b.addActionListener(new MyActionListener());

        b1 = new Button("Click me");
        b1.setBackground(Color.yellow);
        b1.setPreferredSize(new Dimension(200,30));
        add(b1);
      //  MyActionListener s = new MyActionListener();
      //  b1.addActionListener(s);
        b1.addActionListener(new MyActionListener());

    }

    public static void main(String[] args) {
        awt6 s = new awt6();
    }
}
 class MyActionListener implements ActionListener{
     @Override
     public void actionPerformed(ActionEvent e) {
         System.out.println("button clicked ");
     }
 }

