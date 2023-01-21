import java.util.Scanner;

//class Aa{
//    Aa(){
//        System.out.println("calling aa");
//    }
//}
//class bb extends Aa{
//    bb(){
//        System.out.println("calling b");
//    }
//}
//class cc extends bb{
//    cc(){
//
//        System.out.println("calling c");
//    }
//}
//public class constructor1 {
//    public static void main(String[] args) {
//        new cc();
//    }
//}
public class constructor1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char operator1 = sc.next().charAt(0);
//        char operator = '+';
        int a = 2;
        int b = 2;
        switch (operator1){
            case '+' :
                System.out.println(a+b);
                break;
            case '-':
                System.out.println(a-b);
                break;
            case '*':
                 System.out.println(a*b);
                 break;

            default:
                System.out.println("not a valid operation");
        }
    }
}