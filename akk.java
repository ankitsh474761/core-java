import java.awt.*;

import java.awt.event.WindowEvent;

import java.awt.event.WindowListener;

public class akk {

    public static void main(String[] args) {

        Frame t = new Frame();

        t.setTitle("My Frame");

        t.setSize(500,400);

        t.setVisible(true);

        t.addWindowListener(new sharma());

    }
}

class sharma implements WindowListener {

    @Override
    public void windowActivated(WindowEvent e) {
    }  @Override
    public void windowClosing(WindowEvent e) {
        System.exit(0);

    };

    @Override
    public void windowDeactivated(WindowEvent e) {

    }

    @Override
    public void windowIconified(WindowEvent e) {

    }

    @Override
    public void windowDeiconified(WindowEvent e) {

    }

    @Override
    public void windowOpened(WindowEvent e) {

    }

    @Override
    public void windowClosed(WindowEvent e) {

    }
}

