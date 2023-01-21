
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class jscrollpane1 {

    public static void main(String[] args) {
         JFrame frame = new JFrame("JScrollbar Demo");
         JLabel label = new JLabel( );

        JScrollBar hbar=new JScrollBar(JScrollBar.HORIZONTAL, 30, 0, 0, 300);
        JScrollBar vbar=new JScrollBar(JScrollBar.VERTICAL, 30, 40, 0, 300);
        //value means bydefault where the hbar slider is present
        //extent means the max value of jslider - extent

        class MyAdjustmentListener implements AdjustmentListener {
            public void adjustmentValueChanged(AdjustmentEvent e) {
                label.setText("Slider's position is " + e.getValue());
                frame.repaint();
            }
        }

        hbar.addAdjustmentListener(new MyAdjustmentListener( ));
        vbar.addAdjustmentListener(new MyAdjustmentListener( ));

        frame.setLayout(new BorderLayout( ));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,200);
        frame.getContentPane().add(label);
        frame.getContentPane().add(hbar, BorderLayout.SOUTH);
        frame.getContentPane().add(vbar, BorderLayout.EAST);
        frame.getContentPane().add(label, BorderLayout.CENTER);
        frame.setVisible(true);
    }
}
