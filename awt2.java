import java.awt.*;
//2nd way by extending frame class
class Myframe extends Frame{
    TextField t = new TextField(20);
    Myframe() {
      this.setVisible(true);
      this.setSize(400,500);
      this.setBackground(Color.GREEN);
      this.setBounds(300,40,300,500);
      t.setText("hello");
      this.add(t);



    }
}
public class awt2 {
    public static void main(String[] args) {
        Myframe f = new Myframe();
    }

}
//public class awt2 extends Frame {
//    public static void main(String[] args) {
//        awt2 f = new awt2();
//        f.setSize(300,300);
//        f.setVisible(true);
//    }
//
//}
