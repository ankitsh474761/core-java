/* final  on doing this we cannot inherit parent class */class over1{
     /*static final using these keywords  we cannnot override the function */ void show(int a){
        System.out.println("calling fun of parent class");
    }
}

public class lec18 extends over1 {
    void show(int a){
        System.out.println("calling function of sub class");
    }
    public static void main(String[] args) {
        lec18 obj = new lec18();
        obj.show(32);
        over oj = new over();
        oj.show(12);
    }
}
