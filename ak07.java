class Test67 {
    void m(){
        System.out.println("m method");
    }
    void n(){
        System.out.println("n method");
        this.m();
    }
    Test67(){
        System.out.println("Test class constructor");
    }
    int a = 10;
    int b = 30;
}
class Test10 extends Test67{
    Test10(){
        //Super();
        System.out.println("Test1 class constructor");
    }
    int a = 50;
    int b = 100;
    void m1(int a, int b){
        System.out.println("USE OF SUPER KEYWORD");
        System.out.println("The value of a is:" +(super.a));
        System.out.println("The value of b is:" +(super.b));
        System.out.println("Area of a and b is:" +(super.a*super.b));
        System.out.println("Addition of a and b is:"+(super.a+super.b));
        System.out.println("USE OF THIS KEYWORD");
        System.out.println("The value of a is:" +(this.a));
        System.out.println("The value of b is:"+(this.b));
        System.out.println("Area of a and b is:"+(this.a*this.b));
        System.out.println("Addition of a and b is:"+(this.a+this.b));

        System.out.println("LOCAL VARIABLES");
        System.out.println("The value of a is " +a);
        System.out.println("The value of b is " +b);
        System.out.println("Area of a and b is:" +(a*b));
    }
}
class ak07 extends Test10{
    public static void main(String[] args){
        ak07 t = new ak07();
        t.n();
        t.m1(50,60);
    }
}