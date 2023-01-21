import java.awt.*;

//flow layout in java
public class awt4 extends Frame {
    private TextField t,t1,t2;

    awt4(){
        setVisible(true);
        setBounds(100,100,400,500);
        setBackground(Color.YELLOW);
        t = new TextField();
        t1 = new TextField();
        t2 = new TextField();


        FlowLayout obj = new FlowLayout(FlowLayout.CENTER,300,50);//300 is horizontal gap from the right side
        setLayout(obj);
        //setLayout(new FlowLayout(FlowLayout.CENTER,50,50)); //other way is setLayout(new FlowLayout());
        // FlowLayout obj = new FlowLayout(FlowLayout.LEFT,20,20);


        t.setText("t is calling");
        t.setBackground(Color.red);
        add(t);

        t1.setText("t1 is calling");
        t1.setBackground(Color.GRAY);
        add(t1);

        t2.setText("t2 is calling");
        t2.setBackground(Color.green);
        add(t2);
        System.out.println("checking t2 is editable or not :"+t2.isEditable());
        System.out.println("getting text from t2 :  "+t2.getText());//other methods are
        //setText()
        //setEditable(boolean b)
        t2.setEditable(false);
        System.out.println("checking t2 is editable or not after setting "+t2.isEditable());
    }
    public static void main(String[] args) {
        awt4 s = new awt4();
    }
}
