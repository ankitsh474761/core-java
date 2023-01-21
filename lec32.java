interface ittt{
    int a = 10;
}
interface att{
    int a = 100;
}
public class lec32 implements ittt,att{
    public void m1(){
        System.out.println(ittt.a);
        System.out.println(att.a);
    }
    public static void main(String[] args) {
        lec32 tt = new lec32();
        tt.m1();
    }
}
