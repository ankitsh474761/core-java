import java.util.Scanner;

public class progra {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your name");
        var a=3;// it can take any type of datatype
        System.out.println();
//        System.out.println(var.SIZE/8);
        System.out.println();

        System.out.println(Integer.SIZE/8);
        System.out.println();
        System.out.println(Integer.SIZE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);


        String s = sc.next();
        if(s.equals("ankit")){
            System.out.println(s);
        }
        else {
            System.out.println("error");
        }
    }
}
//== operator is used for comparing only object references so we use string.equal() operator for comparing strings