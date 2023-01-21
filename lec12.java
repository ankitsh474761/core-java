class ak{
    int first = 32;
    int second = 23;
    void garcia(int a , int b){
        a =this.first;
        b = this.second;
        System.out.println(first);
        System.out.println(second);
        System.out.println(a);
        System.out.println(b);
    }
    void louis(int m , int n){
        this.first = m;
        this.second = n;
        System.out.println(first);
        System.out.println(second);
        System.out.println(m);
        System.out.println(n);
    }
}


public class lec12 {
    public static void main(String[] args) {
      ak onj =  new ak();
      onj.garcia(100,200);
      onj.louis(1,2);
    }
}
