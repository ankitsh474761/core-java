import java.awt.*;
import java.awt.Color;
//buttons in java
public class awt5 extends Frame {
    private TextField t,t1,t2,t3;
    private Button b;
    awt5(){
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
        b.setBackground(Color.red);
        b.setForeground(Color.yellow);
       // b.setVisible(false);//it will make the button invisible
        b.setEnabled(true);//you will not be able to click on the  button is set as false
       // b.show(false);//it will make the button invisible


    }

    public static void main(String[] args) {
        awt5 t = new awt5();

    }
}
