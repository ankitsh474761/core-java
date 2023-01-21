class harsh{
    void add(){
        int a =9,b=90;
        System.out.print("addtion of two numbers is: "+a+b);
        System.out.println("multipication of two number is : "+a*b);
    }
}
public class singleinheritance extends harsh{
    public static void main(String[] args) {
        singleinheritance ha = new singleinheritance();
//        ha.add();
        ha.add();
    }
}
