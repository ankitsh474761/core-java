interface inter{
    void ma();
    void mk();
}
interface interr{
    void ml();
}
class an implements inter,interr{
    @Override
    public void ma() {
        System.out.println("ma ");
    }

    @Override
    public void mk() {
        System.out.println("mk");
    }

    @Override
    public void ml() {
        System.out.println("ml");
    }
}
public class interfaces33 {
    public static void main(String[] args) {
        an a = new an();
        a.ma();
        a.mk();
    }
}
