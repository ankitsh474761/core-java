public class arr2dspec {
    public static void main(String[] args) {
        int arr[][]={{1,2,3},{3,4,5}};
//        int arr[][]={{1,2,3},{3,4,5},{5,6,7}};
        for (int i=0;i<arr.length;i++){
            for (int j =0; j<arr[i].length; j++){
//                for (int j =0; j<arr[i].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
//        System.out.println(arr.length);
    }
}
