import java.awt.*;
import java.awt.event.*;
//1st way to create frame in java using frame object
public class awt1 {
    awt1(){
        Frame f = new Frame("My frame");
        f.setVisible(true);
        f.setSize(300,400);
        f.setLocation(20,20);
        //f.setTitle("My Frame");
       // f.setBackground(Color.GREEN);
        f.setBounds(200,200,500,500);//setSize+setLocation
        boolean b = f.isVisible();
        System.out.println(b);
        TextField t = new TextField("hello world",20);
        t.setBounds(50,100,100,30);
        t.setBackground(Color.yellow);
        t.setBounds(20,20,100,100);
        f.add(t);
        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
    public static void main(String[] args) {
        awt1 s = new awt1();
    }
}
