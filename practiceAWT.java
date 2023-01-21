import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class practiceAWT {
    public static void main(String[] args) {
        Frame f = new Frame("addition and subtraction operartion");
        f.setBounds(200,200,700,700);
        f.setVisible(true);
        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        f.setLayout(null);
        TextField textField = new TextField();
        textField.setBackground(Color.YELLOW);

        textField.setBounds(50,50,300,50);
        TextField textField1 = new TextField();
        textField1.setBounds(50,200,300,50);
        TextField textField2 = new TextField();
        textField2.setBounds(50,350,300,50);
        textField1.setBackground(Color.YELLOW);
        textField2.setBackground(Color.YELLOW);
        f.add(textField2);
        f.add(textField1);
        f.add(textField);

        Button addition = new Button("+");
        Button subtraction = new Button("-");
        addition.setBounds(100,450,50,30);
        subtraction.setBounds(250,450,50,30);
        f.add(addition);
        f.add(subtraction);

        addition.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource()==subtraction){
                    int text = Integer.parseInt(textField.getText());
                    int text1 = Integer.parseInt(textField1.getText());
                    textField2.setText(String.valueOf(text-text1));
                }
               int text = Integer.parseInt(textField.getText());
               int text1 = Integer.parseInt(textField1.getText());
               textField2.setText(String.valueOf(text+text1));
               }
        });
        subtraction.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int text = Integer.parseInt(textField.getText());
                int text1 = Integer.parseInt(textField1.getText());
                textField2.setText(String.valueOf(text-text1));
            }
        });

    }
}
