class ak3{
    int a =90;
    int b =32;
    void  function(){
        System.out.println("addition of two numbers is  =  "+a+b);
    }
}
class anki extends  ak3{
    int c =90;
    int d = 32;
    anki(){
        System.out.println("calling constructor of class anki");
    }
    void function2(){
        System.out.println("modulus of two numbers is = "+c%d);
        System.out.println("division of two numbers is = "+(c>d));
    }

}
class rohit extends  ak3{
    void function3(){
        System.out.println("calling method of class rohit ");
    }
}
public class hierarchical extends ak3{
    public static void main(String[] args) {
     ak3 sc = new ak3();
     sc.function();
     anki a = new anki();
     a.function2();
     rohit r = new rohit();
     r.function3();
     hierarchical h = new hierarchical();
     h.function();
    }
}
