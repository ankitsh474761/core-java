class Parent4{
    int a;
    Parent4(){
        System.out.println("calling parent class constructor");
    }
}
class child extends Parent4{
    child(){
        this(10);
        System.out.println("child class ");
    }
    child(int a){
        //super(100);
        System.out.println("child class argument 1 constructor");
    }
}
public class lec24 {
    public static void main(String[] args) {
        new child();
    }
}
