//multilevel inheritance
public class lec6 {
    public static void main(String[] args) {


        C obj = new  C();
        System.out.println(obj.fun2());
        System.out.println(obj.fun1());
        System.out.println(obj.fun());
    }
}

 class A1{
    int fun(){
        int a=23;
        int b =32;
        System.out.println("result of a is");
        return  a+b;
    }
}
class  B2 extends A1 {
    int fun1() {
        int a = 90;
        int b = 33;
        System.out.println("result of b is");
        return a * b;
    }
}
class C extends B2{
        int fun2(){
            int a=32;
            int b =23;
            System.out.println("result of c is");
            return  a+b;
        }
}

