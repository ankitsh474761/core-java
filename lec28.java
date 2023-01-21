interface inte{
    void m1();
    void m2();
}

interface inte1{
    void m2();
    void m3();
}
interface inte3 extends inte,inte1 {

}

public class lec28 implements  inte3{   @Override
public void m1() {
    System.out.println("calling m1 method");
}

    @Override
    public void m2() {
        System.out.println("calling m2 method");
    }

    @Override
    public void m3() {
        System.out.println("calling m3 method");
    }
    public static void main(String[] args) {

        lec28 tr = new lec28();
        tr.m1();
        tr.m3();
        tr.m2();
    }
}
