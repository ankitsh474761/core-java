import java.util.*;
public class dowhilecalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean c;
        do{
            System.out.println("enter 1st  no");
            int i = sc.nextInt();
            System.out.println("enter 2nd no");
            int h = sc.nextInt();
            System.out.println("choose any operator +,-,*,/");
            char op = sc.next().charAt(2);// charAt(0) will return the first character
            switch (op){
                case '+':
                    System.out.println(i+h);
                    break;
                case '-':
                    System.out.println(i-h);
                    break;
                case '*':
                    System.out.println(i*h);
                    break;
                case '/':
                    System.out.println(i/h);
                    break;
            }
            System.out.println("do u want to perform any operation");
            c = sc.nextBoolean();
        }while (c==true);
    }
}
