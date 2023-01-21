import java.util.Scanner;

//exception
class exc extends RuntimeException{
    exc(String name){
        super(name);
    }
}
public class paper7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your age : ");
        int age = sc.nextInt();
        if(age < 18){
            throw new YoungerAgeException("age is less than 18");
        }
    }

}
