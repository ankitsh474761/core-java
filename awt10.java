//making simple calculator using awt

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class awt10 extends Frame implements ActionListener {
    private Button sum,sub,div,mul,reset;
    private TextField num1,num2,ans;

    public awt10(){
        setBounds(200,300,400,600);
        setVisible(true);
        setLayout(new FlowLayout());
        setBackground(Color.GRAY);

        initialize();
        addComponents();
        settingmethods();
        addActionListeners();
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

    }
    public void addComponents(){
        add(num1);
        add(num2);
        add(ans);

        add(sum);
        add(sub);
        add(div);
        add(mul);
        add(reset);

    }
    public void initialize(){
        num1 = new TextField(20);
        num2 = new TextField(20);
        ans = new TextField("ans "+ 20);

        sum = new Button("SUM");
        sub = new Button("SUB");
        div = new Button("DIV");
        mul = new Button("MUL");
        reset = new Button("RESET");
    }
    public void addActionListeners(){
        sum.addActionListener(this);
        sub.addActionListener(this);
        div.addActionListener(this);
        mul.addActionListener(this);
        reset.addActionListener(this);
    }
    public void settingmethods(){
        num1.setBackground(Color.green);
        num2.setBackground(Color.red);
        ans.setBackground(Color.yellow);

        sum.setBackground(Color.orange);
        sub.setBackground(Color.CYAN);
        div.setBackground(Color.MAGENTA);
        mul.setBackground(Color.LIGHT_GRAY);
        reset.setBackground(Color.YELLOW);
        sum.setPreferredSize(new Dimension(40,40));

    }
    public void actionPerformed(ActionEvent e){
        String t1 = num1.getText();
        String t2 = num2.getText();

        Integer n1 = Integer.parseInt(t1);
        Integer n2 = Integer.parseInt(t2);
        Integer answer = 0;

        Button b =(Button)e.getSource();

        if(b ==sum) {
            answer = n1+n2;
            System.out.println("sum" + (n1+n2));
        }else if(b == sub){
            answer = n1-n2;
            System.out.println("sub" + (n1-n2));
        }else if(b == div){
            answer = n1/n2;
            System.out.println("div" + (n1/n2));
        }else if(b == mul){
            answer = n1*n2;
            System.out.println("mul" + (n1*n2));
        }else{
            System.out.println("reset");
            num1.setText(" ");
            num2.setText(" ");
        }
        ans.setText(answer.toString());
    }

    public static void main(String[] args) {
        awt10 s = new awt10();
    }

}
