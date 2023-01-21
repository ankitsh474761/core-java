//adapter class
interface ittt8{
    void sum();
    void sub();
}
abstract class ak0{
    public void sum(){};
    public void sub(){};
}
class ans0 extends ak0{
    @Override
    public void sum() {
        System.out.println("hello");
    }
}
public class paper4 {
    public static void main(String[] args) {
        ans0 na = new ans0();
        na.sum();
    }
}
