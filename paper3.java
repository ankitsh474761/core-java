class Outer1{
    private static void sum(){
        System.out.println("sum");
    }
    static class Inner1{
        static void fun1(){
            System.out.println("inner");
            sum();
        }
    }
}
public class paper3 {
    public static void main(String[] args) {
        Outer1.Inner1 obj = new Outer1.Inner1();
        obj.fun1();
    }
}
