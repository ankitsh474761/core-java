import java.util.Scanner;
public class exception2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the value of a : ");
        int a = s.nextInt();
        System.out.println("Enter the value of b : ");
        int b = s.nextInt();
        int A[] = new int[6];
        System.out.println("enter the elements that you want to insert in the array :- ");
        for(int i =0; i < A.length ;i++){
            A[i] = s.nextInt();
        }
        try{
            for(int k = 0 ; k < 7; k++){
                System.out.println(A[k]);
            }
            try {
                System.out.println("dividing a by b we get : ");
                System.out.println(a/b);
            }
            catch (ArithmeticException e){
                e.printStackTrace();
            }
        }
        catch(Exception e){
           e.printStackTrace();
        }
        finally {
            System.out.println("finally block is executed");
        }
    }
}
