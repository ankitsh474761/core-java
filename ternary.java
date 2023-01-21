public class ternary {
    public static void main(String[] args) {
        if(5>8&&3<8){
            System.out.println("hello");
        }else{
            System.out.println("world");
        }
        System.out.println();
        if(5>8||3<8){
            System.out.println("hello");
        }else{
            System.out.println("world");
        }
        System.out.println();
        if(!(3<8)){
            System.out.println("hello");
        }else{
            System.out.println("world");
        }
        System.out.println();
        int a = 4;
        int b =8;
        int x = a<b?a:b;//here we are writing if a is less than b then print a
        System.out.println(x);
        int y= (10>20?30:(40>50?60:70));
        System.out.println(y);
    }
}
