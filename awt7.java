import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class awt7 extends Frame implements ActionListener {
    private TextField t,t1,t2,t3;
    private Button b,b1;
    awt7(){
        this.setVisible(true);

        this.setBounds(300,300,500,600);
        setBackground(Color.green);
        setTitle("My Frame");
        t = new TextField("test1 ..");
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
        b.addActionListener(this);

        b1 = new Button("Click me");
        b1.setBackground(Color.yellow);
        b1.setPreferredSize(new Dimension(200,30));
        add(b1);
        b1.addActionListener(this);

    }

    public static void main(String[] args) {
        awt7 s = new awt7();
    }
    public void actionPerformed(ActionEvent e){
        System.out.println("do no click on me again");
        System.out.println(e.getSource());
    }
}
