import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class frameanonymous extends Frame  {
    public static void main(String[] args) {
        frameanonymous f1 = new frameanonymous();

        f1.addWindowListener(new WindowListener(){
            @Override
            public void windowOpened(WindowEvent e) {
                System.out.println("window is opened");
            }
            @Override
            public void windowClosing(WindowEvent e) {
                System.out.println("window is closing");
                f1.dispose();
             //   System.exit(0);
            }
            @Override
            public void windowClosed(WindowEvent e) {
                System.out.println("window is closed");
            }
            @Override
            public void windowIconified(WindowEvent e) {
                System.out.println("window is iconified");
            }
            @Override
            public void windowDeiconified(WindowEvent e) {
                System.out.println("window is deiconified ");
            }
            public void windowActivated(WindowEvent e){
                System.out.println("window is activated ");
            }
            @Override
            public void windowDeactivated(WindowEvent e) {
                System.out.println("window is deactivated ");
            }
        });
    }
    frameanonymous(){
        setVisible(true);
        setBounds(300,300,500,400);
        setTitle("creating frame");
        setBackground(Color.YELLOW);
    }
}
