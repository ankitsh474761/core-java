import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class mouselistenres {
    public static void main(String[] args) {
        JFrame  f = new JFrame();
        Container c = f.getContentPane();
        f.setVisible(true);
        f.setLayout(null);
        f.setBounds(100,100,700,700);
        JTextField ff = new JTextField();
        ff.setBounds(100,100,300,100);
        c.add(ff);
        ff.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                ff.setText("clicked");
            }
        });
        JTextField field = new JTextField();
        field.setBounds(100,309,100,100);
        c.add(field);
        field.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                ff.setText("clicke");
            }

            @Override
            public void mousePressed(MouseEvent e) {
                ff.setText("mouse pressed");

            }

            @Override
            public void mouseReleased(MouseEvent e) {
                ff.setText("mousereleased");
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                ff.setText("mouse entered");
            }

            @Override
            public void mouseExited(MouseEvent e) {
                ff.setText("Mouse exited");
            }
        });
    }
}
