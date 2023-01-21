//single level inheritance

class A{
    int fun(){
        int a =32;
        int b =34;
        return  a+b;
    }
}
class  B extends A{
    int fun1(){
        int a=99;
        int b =32;
        System.out.print("sum of a and b is "+" ");
        return  a+b;
    }
}
public class lec5 {
    public static void main(String[] args) {
        B obj = new B();
        System.out.println(obj.fun());
        System.out.println(obj.fun1());
    }

}
