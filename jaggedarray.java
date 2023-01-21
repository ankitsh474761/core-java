public class jaggedarray {
    public static void main(String[] args) {
        int arr[][] = new int[3][];
//     in jagged array we only define the size of array
         arr[0]=new int[3];//declaring size of 1st row elements
         arr[1]=new int[2];//declaring size of 2nd row elements
         arr[2]=new int[1];//declaring size of 3rd row elements
        arr[0][0] =1;
        arr[0][1] =2;
        arr[0][2] =3;
        arr[1][0] =4;
        arr[1][1] =5;
        arr[2][0] =1;

        for (int i =0; i <arr.length;i++){
            for (int j =0; j <arr[i].length; j++){
                System.out.println("arr["+i+"]["+j+"]"+" "+"="+arr[i][j]);
            }
            System.out.println();
        }
    }
}
