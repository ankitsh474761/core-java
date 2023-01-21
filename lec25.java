//interfaces in java
interface it {
    void m1();// by default they are public and abstract

    void m2();

     void m3();
}
abstract class test3 implements it{
    @Override
    public void m1() { // it should be declare as public beacause they are inherited as public and abstract
        int a = 22;
        int b = 232;
        System.out.println("sum of a and b is "+a+b);
    }
}
 class test4 extends test3 {
     @Override
     public void m2() {
         int a = 23;
         int b = 89;
         System.out.println("multipication of a and  b is "+a*b);
     }

     @Override
     public void m3() {
         int a = 32;
         int b = 23;
         System.out.println("sum of a and b is "+a+b);
     }
 }

public class lec25 {
    public static void main(String[] args) {

//        interface t1 = new test4();
//        t1.m1();
//        t1.m2();
//        t1.m3();
        test4 t = new test4();
        t.m1();
        t.m2();
        t.m3();
    }
}
