interface interface1{
    interface interface2{
        void fun();
    }
}
class test8 implements interface1.interface2{
    @Override
    public void fun() {
        System.out.println("hello world");
    }
}
public class lec29 {
    public static void main(String[] args) {
    test8 t = new test8();
    t.fun();


    }
}
