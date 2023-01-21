import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class calculatorproject implements ActionListener {

    JFrame frame;
    JTextField textField;
    JButton[] numberButtons = new JButton[10];//array of JButtons and this will hold numbered buttons
    JButton[] functionButtons = new JButton[9];//it will hold below buttons
    JButton addButton,subButton,mulButton,divButton;
    JButton decButton,equButton,delButton,clrButton ,negButton;
//    JButton sinButton,cosButton,tanButton,powButton;
    JPanel panel;//to hold these buttons

    Font myFont = new Font("arial",Font.BOLD,30);

    double num1 =0,num2 =0,result =0;
    char operator;
    Container c;


    calculatorproject(){
        frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800,800);
         c = frame.getContentPane();
        c.setBackground(Color.LIGHT_GRAY);

        frame.setLayout(null);


        textField = new JTextField();
        textField.setBounds(50,25,340,50);
        textField.setFont(myFont);
        textField.setBackground(Color.YELLOW);
        textField.setEditable(false);

        addButton = new JButton("+");
        subButton = new JButton("-");
        mulButton = new JButton("*");
        divButton = new JButton("/");
        decButton = new JButton(".");
        equButton = new JButton("=");
        delButton = new JButton("Delete");
        clrButton = new JButton("CLR");
        negButton = new JButton("(-)");

        functionButtons[0] = addButton;
        functionButtons[1] = subButton;
        functionButtons[2] = mulButton;
        functionButtons[3] = divButton;
        functionButtons[4] = decButton;
        functionButtons[5] = equButton;
        functionButtons[6] = delButton;
        functionButtons[7] = clrButton;
        functionButtons[8] = negButton;

        for(int i = 0; i < 9;i++){
            functionButtons[i].addActionListener(this);
            functionButtons[i].setFont(myFont);
            functionButtons[i].setFocusable(false);
        }

        for(int i = 0; i < 10;i++){
         numberButtons[i] = new JButton(String.valueOf(i));//valueof is used to convert any non String variable orOBject
            // such as int,double,char,and other to
            //a newly created string object
            numberButtons[i].addActionListener(this);
            numberButtons[i].setFont(myFont);
            numberButtons[i].setFocusable(false);
        }

        negButton.setBounds(50,430,100,50);
        delButton.setBounds(150,430,140,50);
        delButton.setBackground(Color.red);
        clrButton.setBounds(290,430,100,50);
        clrButton.setBackground(Color.green);

        panel = new JPanel();
        panel.setBounds(50,100,340,300);
        panel.setLayout(new GridLayout(4,4,10,10));
       panel.setBackground(Color.BLACK);

        panel.add(numberButtons[1]);
        panel.add(numberButtons[2]);
        panel.add(numberButtons[3]);
        panel.add(addButton);
        panel.add(numberButtons[4]);
        panel.add(numberButtons[5]);
        panel.add(numberButtons[6]);
        panel.add(subButton);
        panel.add(numberButtons[7]);
        panel.add(numberButtons[8]);
        panel.add(numberButtons[9]);
        panel.add(mulButton);
        panel.add(decButton);
        panel.add(numberButtons[0]);
        panel.add(equButton);
        panel.add(divButton);


        frame.add(panel);
        frame.add(negButton);
        frame.add(delButton);
        frame.add(clrButton);
        frame.add(textField);
        frame.setVisible(true);

    }
    public static void main(String[] args) {
        calculatorproject calc = new calculatorproject();

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        for (int i = 0; i < 10 ; i++){
            if(e.getSource() == numberButtons[i]){
                textField.setText(textField.getText().concat(String.valueOf(i)));
            }
        }
        if(e.getSource() == decButton){
            textField.setText(textField.getText().concat("."));
        }
        if(e.getSource() == addButton){
            num1 = Double.parseDouble(textField.getText());
            operator = '+';
            textField.setText("");
        }
        if(e.getSource() == subButton){
            num1 = Double.parseDouble(textField.getText());
            operator = '-';
            textField.setText("");
        }
        if(e.getSource() == mulButton){
            num1 = Double.parseDouble(textField.getText());
            operator = '*';
            textField.setText("");
        }
        if(e.getSource() == divButton){
            num1 = Double.parseDouble(textField.getText());
            operator = '/';
            textField.setText("");
        }
        if(e.getSource() == equButton){
            num2 = Double.parseDouble(textField.getText());

            switch (operator){
                case '+':
                    result = num1+num2;
                    break;
                case '-':
                    result = num1-num2;
                    break;
                case '*':
                    result = num1*num2;
                    break;
                case '/':
                    result = num1/num2;
                    break;
            }
            textField.setText(String.valueOf(result));
            num1 = result;
        }
        if (e.getSource()==clrButton){
            textField.setText(" ");
        }
        if (e.getSource() == delButton){
            String str = textField.getText();
            textField.setText("");
            for (int i = 0; i < str.length()-1;i++){
                textField.setText(textField.getText()+str.charAt(i));
            }
        }
        if (e.getSource() == negButton){
            double temp = Double.parseDouble(textField.getText());
            temp*=-1;
            textField.setText(String.valueOf(temp));
        }

    }
}
