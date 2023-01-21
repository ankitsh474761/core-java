import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//doing swap program in awt
public class awt9 extends Frame implements ActionListener {
    private TextField text1;
    private TextField text2;
    private Button swap;
    public awt9(){
        setTitle("swap program ");
        setVisible(true);
        setBackground(Color.gray);
        setBounds(100,100,350,600);
        setLayout(new FlowLayout(FlowLayout.CENTER,10,10));

        text1 = new TextField(20);
        text1.setBackground(Color.yellow);
        text2 = new TextField(20);
        text2.setBackground(Color.yellow);
        swap = new Button("SWAP");

        swap.addActionListener(this);

        add(text1);
        add(text2);
        add(swap);

    }

    public void actionPerformed(ActionEvent e){
        System.out.println("Swap Values");
        String t2 = text1.getText();
        String t3 = text2.getText();

        System.out.println(t2+"******"+t3);

       String k;
      text1.setText(t3);
      text2.setText(t2);


    }

    public static void main(String[] args) {
        awt9 s = new awt9();
    }
}
