public class reversearray {
    public static void main(String[] args) {
//        int a[]={1,23,3,4,45,5,6,7,8};
//        for (int i = 0 ;i < a.length;i++){
//            System.out.print(a[i]+" ");
//        }
//        System.out.println();
//
//
//
//
////2d array
//        for(int i = a.length-1;i >=0;i--){
//            System.out.print(a[i]+" ");
//        }
//        System.out.println();
//        System.out.println();
//        int b[][]={{1,2,3,4},{12,23,43,54},{12,34,45,7,6}};
//        for(int j =b.length-1 ; j >=0; j--){
//            for(int k = b[j].length-1; k >=0 ;k--){
//                System.out.print(b[j][k]+" ");
//            }
//            System.out.println();
//    }
//        System.out.println();
//
//
//
//
//
//        //3d array
//        int c[][][]={{{12,23,34,54},{32,4,55,6,5},{23,45,43,67,88,34}}};
//        for(int i =0 ; i < c.length;i++){
//            for(int j =0;j<c[i].length;j++){
//                for(int k = 0; k<c[i][j].length;k++){
//                    System.out.println("a[" +i+ "][" +j+ "][" +k+ "] = " +c[i][j][k]+" ");
//                }
//                System.out.println();
//            }
//            System.out.println();
//        }
//        int k[] = {1,2,3,4,45,65,3,43,23};
//        for(int x : k){
//            System.out.println(x);
//        }
//        int n[][]={{12,23,34,45,56},{23,4,5,7,45},{23,45,6,7,56,34}};
//        for(int x[] : n) {
//            for (int v : x) {
//                System.out.print(v+" ");
//            }
//            System.out.println();
//        }
//
       int x[][][] ={{{1,23,3,},{12,34,45},{132,343,45}}};
    int i;
        for(int a[][]  : x){
            for(int  []y : a){
                for(int n : y){
                    System.out.println(n);
                }
                System.out.println();
            }
        }
    }
}
