//polymorphism
//compile time polymorphism early binding static polymorphism
//it can be achieved by function overloading
class multiplyfun{
     static int multiply(int a, int b){
        return a*b;
    }
    static double multiply(double a , double b){
        return  a*b;
    }
}

public class lec14 {
    public static void main(String[] args) {
        System.out.println(multiplyfun.multiply(2,4));
        System.out.println(multiplyfun.multiply(2.32,4.0));
    }
}
