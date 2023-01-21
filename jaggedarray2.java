import java.util.Scanner;

public class jaggedarray2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[][] = new int[3][];
        arr[0] = new int[3];//declaring size of 1st row elements
        arr[1] = new int[2];//declaring size of 2nd row elements
        arr[2] = new int[1];
        System.out.println("enter the values");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("arr[" + i + "][" + j + "]" + " " + "=" + arr[i][j]);
            }
        }
        System.out.println();
    }
}
