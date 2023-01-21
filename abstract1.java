
abstract class Test{
    Test(){
        System.out.println("test");
    }
    abstract void m1();
}
class Test1 extends Test{
    void m1(){
        System.out.println("calling m1");
    }
    Test1(){
        System.out.println("helllo");
    }
}
public class abstract1 {
    public static void main(String[] args) {
      Test1 a = new Test1();
      a.m1();
    }
}
