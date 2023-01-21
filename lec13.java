class parent{
    int a =34;
    static float x =23.3f;
}
class Base extends parent{
    void gfg(){
        System.out.println(a);
        System.out.println("using this "+this.a);
        super.a=32;
        System.out.println(a);//making parent class a to 32
        System.out.println("using this "+this.a);//it will also print 32
        super.x=23.2f;
        System.out.println(x);
    }
}

public class lec13 {
    public static void main(String[] args) {


        Base obj = new Base();
        obj.gfg();

    }
}
