class over{
    void show(int a){
        System.out.println("calling fun of parent class");
    }
}

public class lec16 extends over {
    void show(int a){
        System.out.println("calling function of sub class");
    }
    public static void main(String[] args) {
        lec16 obj = new lec16();
        obj.show(32);
        over oj = new over();
        oj.show(12);
    }
}
