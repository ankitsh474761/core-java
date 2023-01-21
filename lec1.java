public class lec1 {
    public static void main(String[] args) {
       boolean b = false;
        if (b==true){
            System.out.println(9);
        }
        else {
            System.out.println("hi");
        }
//        int s =0;
//        if(s){
//            System.out.println("hello");
//        } invalid in java but not in c++
        if(b=false){
            System.out.println("hello");
        }
        if(true);//empty statement
        if(true)
            System.out.println("how are u");
        //switch does  not accept return type of boolean,float,double
        //we can also write cases in it without default statement
        //we can also write default before cases but it is not recommended to write it before cases
        switch ('a'){
            case 'a':
                System.out.println("printing a");
            case 'b':
                System.out.println("printing b");
            case 'c':
                System.out.println("printing c");
            case 1:
                System.out.println("printing 1");
            case 1000:
                System.out.println("printing 1000");
//            case 1000000:
//                System.out.println("printing 1000000"); gives error because it will exceed the range of char
                System.out.println("hello");
                System.out.println(Character.SIZE/8);
                System.out.println(Character.MAX_VALUE);//character max value cannot be calculated see gfg
                System.out.println(Integer.MAX_VALUE);
        }
//        switch (3){
//            System.out.println("hi");
//        } we cannot write independent statements inside the switch statement
//        switch (){
//
//        } invalid writing switch without any expression gives error and the below code is valid because it has expression
        switch (3){

        }
        int x=10;
        int y =20;
        switch (x){
            case 10:
                System.out.println("hello");
                break;
            case 20 :
                System.out.println(20);
                break;
        }
//        int i=10;
//        int m=20;
//        switch (x){
//            case 10:
//                System.out.println("hello");
//                break;
//            case m :                 //it will give error because return type is int but we make int m as final then it
        //will not give error bec it will become constant after that no other value will change it
//                System.out.println(20);
//                break;
//        }
        int i=10;
         final int m=20;
        switch (i){
            case 10:
                System.out.println("hello ");
                break;
            case m:
                System.out.println("how are u");
                break;
        }
        int j =10;
        switch (j+1){                                  //
            case 11:
                System.out.println(10);
                break;
            case 10+20+30:
                System.out.println(20);
                break;
            default:
                System.out.println("hi");
                break;
        }
        int l=10;
        switch (l+50){                              //
            case 11:
                System.out.println(10);
                break;
            case 10+20+30:                         //
                System.out.println(20);
                break;
            default:
                System.out.println("hi");
                break;
        }
//        byte  v = 10;
//        switch (v){
//            case 10:
//                System.out.println("printing 10");
//                break;
//            case 100:
//                System.out.println(100);
//                break;
//            case 1000:                          //it will give error because it will exceed the value of byte
//                System.out.println("printing 1000");
//                break;
//        }
        byte  v = 10;
        switch (v+1){      //now it is not giving error due to internal type casting
            case 10:
                System.out.println("printing 10");
                break;
            case 100:
                System.out.println(100);
                break;
            case 1000:                          //it will give error because it will exceed the value of byte
                System.out.println("printing 1000");
                break;
        }
//        byte   c = 10;
//        switch (c){
//            case 10:
//                System.out.println("printing 10");
//                break;
//            case 'a':           // ascii value of  a is 97 due to duplicacy it will give error
//                System.out.println(100);
//                break;
//            case 97:             // here error due to duplicacy
//                System.out.println("printing 1000");
//                break;
//        }



    }
}
