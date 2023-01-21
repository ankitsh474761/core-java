import java.util.Scanner;
 class YoungerAgeException extends RuntimeException {
    YoungerAgeException(String msg) {
        super(msg);
    }
}
 public class exception3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("WELCOME : Ankit enter you age : ");
        int age = sc.nextInt();
        if(age < 18){
           //throw new YoungerAgeException("You are not eligible to vote");
            YoungerAgeException se = new YoungerAgeException("you are not eligible to vote");
            throw se;
        }
        else{
            System.out.println("You have voted successfully");
        }
    }
}
//throw keyword for unchecked exception for checked exception we have to handle the exception by using throws keyword
