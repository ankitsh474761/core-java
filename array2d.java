public class array2d {
    public static void main(String[] args) {
        int arr[][]={{1,3,4},{8,5},{1,2,3,4},{34,54,65}};
        int aqr[] = new int[4];
        aqr[0]=23;
        aqr[2]=34;
        for (int  i =0; i<arr.length; i++){
            for (int j =0; j <arr[i].length;j++){
                System.out.println("arr["+i+"]["+j+"]"+"="+arr[i][j]);
            }
            System.out.println( );
//            System.out.println(arr[i].length);
        }
    }
}
