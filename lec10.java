// this and super keyword
class test {
    int a = 20;
    int b = 10;
}
class test1 extends test{
    int x =100;
    int  y =300;
    void m1(int i ,int j){
        System.out.println(this.x+this.y);//accessing x and y of test1
        System.out.println(super.a+super.b);//acessing a and b of test
        System.out.println(x+y);

    }
}
public class lec10 {
    public static void main(String[] args) {
        test1 t1 = new test1();
        t1.m1(1000,2000);
    }
}
