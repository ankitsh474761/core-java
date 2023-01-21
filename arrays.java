public class arrays {
    public static void main(String[] args) {
        // firstly write access specifier
        // we can create arrays by  using literals and using new keyword
        int arr[] = {2,3,4,5,9};// literals
        int agr[] = new int[5];// using new keyword
        agr[0] = 23;
        agr[2]= 34;
        for (int i = 0; i <arr.length;i++){
            System.out.println(arr[i]);
        }
        for(int i :arr){// for each loop and advance for loop
            System.out.println(i);


        }
        System.out.println(arr[2]);
        arr[2] = 43;
        System.out.println(arr[2]);
    }
}
// next can take only characters until space and nextline can take
//index starts from 0 and indesOf return index value
