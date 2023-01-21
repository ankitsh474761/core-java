import javax.swing.*;

public class graphicsinswing1 {
    public static void main(String[] args) {
        int w = 640;
        int h = 480;
        JFrame f = new JFrame();
        graphicsinswing dc = new graphicsinswing(w,h);
        f.setSize(w,h);
        f.add(dc);
        f.setTitle("Drawing in java");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
