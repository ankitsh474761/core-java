interface ian{
    int a = 10;//by default they are public static and final
    void fun();
}

public class lec31 implements ian {
    @Override
    public void fun() {
        System.out.println("writing something that u cannot understand ");
    }
    public static void main(String[] args) {
        lec31 t = new lec31();
//        a = a+10;              //it will compile time error because a is final in interface we cant change the value
        //of final variables
//        System.out.println(a);
    }
}
