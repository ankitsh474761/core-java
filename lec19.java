class over2{
    private void show(int a){
        System.out.println("calling fun of parent class");
    }
}

public class lec19 extends over2 {
    void show(int a){
        System.out.println("calling function of sub class");
    }
    public static void main(String[] args) {
        lec19 obj = new lec19();
        obj.show(32);
        over oj = new over();
        oj.show(12);
//        over2 a ;
//        a = new over2();
//        a.show(12);
//        a = new lec19();
//        a.show(23);
    }
}

