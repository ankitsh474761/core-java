import java.util.*;

public class stringdo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a;
        do{
            System.out.println("enter 1st  no");
            int i = sc.nextInt();
            System.out.println("enter 2nd no");
            int h = sc.nextInt();
            System.out.println("choose any operator +,-,*,/");
            char op = sc.next().charAt(0);
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
            a = sc.next();
        }while(a=="yes");
        sc.close();
    }
}
