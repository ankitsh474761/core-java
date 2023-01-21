import java.util.Scanner;

public class constructor {

        //functions perform some functionality
        // two rules two create constructor
        // the name  of constructor should be same as the name of class and there is no return type in constructors
        // there are 6 oops concepts in java
        //classes and objects
        // constructors and methods
        // encap , inheritance, polimorphism,abstraction
        //1 default non paramaterized and 2 paramaterized constructor and  3 copy constructor
        int a ,b; // global variables
        constructor(){
            int a =23;
            int b = 76;
            System.out.println("addition is"+" "+a+b);
            // due to operator precendence concatenation is performed
            System.out.println("addition is "+" "+(a+b));
        }
        constructor(int a, int b){
            this.a=a;
            this.b=b;// this is used to idicate global variables and it is also a variable and used within the class
            System.out.println("multipication is "+a*b); // here * has higher precedence
        }
    public static void main(String[] args) {
     constructor ob =  new constructor();
     constructor obj = new constructor(3,4);

    }
}
//public class array4d {
//    public static void main(String[] args) {
//        int arr[][][][] = {{{1, 2, 3}, {4, 5, 6}}, {{7, 8, 9}, {3, 4, 5}}};
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                for (int k = 0; k < arr[i][j].length; k++) {
//                    for (int h = 0; j < arr[i][j][k].length; h++) {
//                        System.out.println("arr[" + i + "][" + j + "][" + k + "][" + h + "]" + "=" + arr[i][j][k][h]);
//                    }
//                    System.out.println();
//                }
//
//            }
//        }
//    }
//}
