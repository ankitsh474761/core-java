import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;

public class ppt2 {
    public static JTextField t1, t2, t3, t4, t5;
    public static Container c;

    public static void main(String[] args) {
            ppt1 t = new ppt1();
            JFrame frame = new JFrame("My Frame");
            frame.setLayout(null);
            frame.setBounds(100, 100, 400, 500);
            frame.setResizable(false);
            frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            c = frame.getContentPane();
            t1.getDocument().addDocumentListener(new DocumentListener() {
                @Override
                public void insertUpdate(DocumentEvent e) {

                }

                @Override
                public void removeUpdate(DocumentEvent e) {

                }

                @Override
                public void changedUpdate(DocumentEvent e) {

                }
            });


        }
}
