interface it1 {
    void m1();// by default they are public and abstract

    void m2();

    void m3();
}
class test5 implements it1{
    @Override
    public void m1() {
        System.out.println("hello");
    }

    @Override
    public void m2() {
        System.out.println("how are u");
    }

    @Override
    public void m3() {
        System.out.println("i am fine ");
    }
}
public class lec26 {
    public static void main(String[] args) {
        test5 t = new test5();
        t.m1();
        t.m2();
        t.m3();
    }
}
