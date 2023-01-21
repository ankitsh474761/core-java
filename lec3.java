public class lec3<i> {
    public static void main(String[] args) {
       // for( ; ;); //it is a valid syntax in java bec ; is valid
        //after it we cannot write anything bec it becomes unreachable or it will remain in loop forever





     //   for (int i=0;true;i++){
     //       System.out.println("hello");             // valid
      //  }
      //  System.out.println("hi"); it becomes unreachable because condition is true and it will never be
        //executed as the loop is called infintely and it will never get chance to be executed

//    for(int i =0; true ; i++);
//        System.out.println("hello");
//        invalid bec unreachable

//        for(int i =0,j=5;i<j;i++){
//            System.out.println("hello");
//        }                                          valid

//        for(int i =0,string j ="hi";i<=10;i++){
//            System.out.println("hello");
//        }                                                 invalid  bec we can declare variable of only one datatype
//
//        for(int i =0,int  j=9;i<=10;i++){
//            System.out.println("hello");
//        }                                             invalid we cannot declare datatype multiple times

//        int i =10;
//        for("hi";i<3;i++){
//            System.out.println("hello");           check it
//        }

//        for(int i=0; ;i++); //                 valid
//        System.out.println("hello");        after the above code all other statements become unreachable


//        for( ; ;){
//            System.out.println("hi");
//        }                                   valid infinite loop

//        for(int i =0;true;i++){
//            System.out.println("hello");         //infinite loop
//        }

//        System.out.println("hi");       it becomes unreachable       invalid

//        for(int i =0;false;i++){
//            System.out.println("hello");          //invalid unreachable bec when the condition becomes false it will
        //never execute any code after it
//        }


//        for(int i=10;false;i++);         it will never comes out of the loop so it will never executes next statements
//        System.out.println("hi");

//        int a=10,b=20;
//        for (int i =0;a<b;i++){
//            System.out.println("hello");
//        }
//        System.out.println("hi");                   valid  print hello infinitely

        int n=10,m=20;
        for (int i =0;n>m;i++){
            System.out.println("hello");
        }
        System.out.println("hi");

        // program to display no from 1 to 10 by using infinite for loop
        int x =1;
        for( ;     ; ){
            System.out.println(x);
            x++;
            if(x>10) {      //if(x==11)
                break;
            }
        }


        int i[] = new int[4]; // we can make array using new keyword
        i[0] =89;
        i[1]=80;
        i[2]=67;
        i[3]=33;

       for(int j=0;j<i.length;j++){
           System.out.print(i[j]+" ");
       }
        System.out.println();

       int arr[] ={1,2,3,4,5,6};
       for(int k=0;k<arr.length;k++){
           System.out.print(arr[k]+" ");
       }
        System.out.println();

       int arr1[][] ={{10,20,30},{40,50,60}};//  10 20 30
       for (int v=0;v<2;v++) {               //  40 50 60
           for (int c = 0; c < 3; c++) {
               System.out.print(arr1[v][c]+ " ");
           }
       }
        System.out.println();

        int arr2[][] ={{10,20,30},{40,50,60}};
        for (int l=0;l<arr2.length;l++) {            //arr2.length will return the length as 2 bec there are only 2 rows in it
            for (int kl = 0; kl <arr2.length; kl++) {
                System.out.print(arr2[l][kl]+ " ");
            }
        }
        System.out.println();
       // 2d array
        int arr3[][] ={{10,20,30},{40,50,60},{23,34,22}};
        for (int ll=0;ll<arr3.length;ll++) {            //arr2.length will return the length as 3 bec there are only 3 rows in it
            for (int kll = 0; kll <arr3.length; kll++) {
                System.out.print(arr3[ll][kll]+ " ");
            }
        }
        System.out.println();

        // 3d array
//        int arr4[][][]={{{10,20,30}},{{40,50,60}},{{70,80,90}}};
//        for (int ll=0;ll<arr4.length;ll++) {            //arr2.length will return the length as 3 bec there are only 3 rows in it
//            for (int kll = 0; kll <arr4.length; kll++) {
//                for (int kk=0;kk<arr4.length;kk++){
//                System.out.print(arr4[ll][kll][kk]+ " ");
//            }
//                 }
//        }

        //for each loop or enhanced for loop
        int arr5[] ={1,2,3,4,5,6};
        for(int k : arr5){
            System.out.print(k+" ");
        }
        System.out.println();

        // 2d array
        int arr6[][] ={{10,20,30},{40,50,60},{23,34,22}};
        for (int[] kkl : arr6) {            //arr2.length will return the length as 3 bec there are only 3 rows in it
            for (int kk : kkl) {
                System.out.print(kk+" ");
            }
        }
        System.out.println();

        int array[][][] ={{{10,20,21,22},{30,40,50,60},{31,70,80,90}}};
        for(int il =0;il<array.length;il++){
            for (int kl=0;kl<array[il].length;kl++){
                for (int kk=0;kk<array[il][kl].length;kk++){
                    System.out.print(array[il][kl][kk]+" ");

                }
                System.out.println();
            }
        }

    }
}
