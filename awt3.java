import java.awt.*;

//text field
class Myframe1 extends Frame{
    private TextField t,t1;
    Myframe1(){

        this.setBackground(Color.green);
        this.setSize(400,500);
        boolean b = this.isVisible();
        System.out.println(b);

        t = new TextField("this");
        this.add(t);
       // t.setBackground(Color.yellow);
        t1 = new TextField("hwllo world");
       // t1.setBackground(Color.darkGray);
        this.add(t1);//t1 will override the t for this we need layouts
        this.setVisible(true);
    }
}
public class awt3 {
    public static void main(String[] args) {
        Myframe1 t = new Myframe1();

    }
}
