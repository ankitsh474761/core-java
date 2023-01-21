interface it3{
    void m1();
    void m2();
}
interface it4{
    void m3();
}
interface it5 extends it3,it4{
    void m4A();
}
//class testing implements it3,it4,it5{
class testing implements it5{
    @Override
    public void m1() {
        System.out.println("hello");
    }

    @Override
    public void m2() {
        System.out.println("hello world");
    }

    @Override
    public void m3() {
        System.out.println("how are u ");

    }

    @Override
    public void m4A() {
        System.out.println("implementing it5");
    }
}

public class lec27 {
    public static void main(String[] args) {

    }
}
