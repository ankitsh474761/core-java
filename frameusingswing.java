import javax.swing.*;
import java.awt.*;

public class frameusingswing extends JFrame {
    public static void main(String[] args) {
        frameusingswing s = new frameusingswing();
    }
    frameusingswing(){
        setBounds(300,400,400,500);
        this.setBackground(Color.GREEN);
        setVisible(true);
    }
}
