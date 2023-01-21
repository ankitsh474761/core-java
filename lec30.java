class a{
    interface itt{
        void fun();
    }
}
class b implements a.itt{
    @Override
    public void fun() {
        System.out.println("hi how are u ");
    }
}
public class lec30 {
    public static void main(String[] args) {
        b t = new b();
        t.fun();
    }
}
