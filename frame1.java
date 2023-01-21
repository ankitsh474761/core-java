import java.awt.*;
public class frame1 {
    public static void main(String[] args) {
        Frame f = new Frame();
        f.setSize(300,400);
        f.setVisible(true);
        f.setTitle("java programming");
        f.setBackground(Color.darkGray);

        Label l = new Label("Student id");
        l.setBounds(12,12,12,12);
       // l.setBackground(Color.green);
        //for adding label in frame write f.add(l)
        f.add(l);

        Button b = new Button("Submit");
        b.setBounds(100,100,80,20);
        b.setBackground(Color.yellow);
        f.add(b);

        TextField t1 = new TextField();
        t1.setBounds(20,100,80,30);
       // t1.setBackground(Color.darkGray);
        f.add(t1);






    }
}
