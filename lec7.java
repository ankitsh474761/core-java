//hierarchical inheritance
class  A3{
    int fun(){
        int a=90;
        int b=32;
        System.out.println("result of a is ");
        return  a+b;
    }
}
class B3 extends A3{
    int fun1(){
        int a=32;
        int b =331;
        System.out.println("result of b is");
        return a+b;
    }
}
class C2 extends A3{
    int fun2(){
        int a=90;
        int b=34;
        System.out.println("result of c is");
        return  a+b;
    }
}

public class lec7 {
    public static void main(String[] args) {
        C2 obj = new C2();
        B3 obj1 = new B3();
        A3 obj2 = new A3();
        System.out.println(obj.fun2());
        System.out.println(obj1.fun1());
        System.out.println(obj2.fun());
        System.out.println(obj2.fun());
    }
}
