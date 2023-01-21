class ako{
    int a = 10;
    int b = 20;
}
public class conast extends ako {
    int a = 90;
    int b = 213;
    public void setA(){
        int a = 12;
        int b = 23;
        System.out.println("local value is printing : "+a);
        System.out.println("local value is printing : "+b);
        System.out.println("class value is printing : "+this.a);
        System.out.println("class value is printing : "+this.b);
        System.out.println("super : "+super.a);
        System.out.println("super : "+super.b);
    }
    public static void main(String[] args) {
        conast obj = new conast();
        obj.setA();
    }
}