interface Hello{
    void disp();
}
interface Welcome{
    void show();
}

public class interfaces implements Hello,Welcome{
//    we use interfaces in java to achieve abstraction and multiple inheritance
    public void disp(){
        int a =9;
        int b = 8;
        System.out.println(a*b);

    }
    public void show(){
        System.out.println("this is a show method");
    }
public static void main(String[] args) {
        interfaces oj = new interfaces();
        oj.disp();
        oj.show();
}
}
