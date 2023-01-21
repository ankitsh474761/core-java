public class overloadingconstructor {
    int a = 34;
    int b = 33;
    overloadingconstructor(int a, int b){
        System.out.println(a+b);
    }
    overloadingconstructor(double a , double b){
        System.out.println(a*b);
    }
    overloadingconstructor(int a, float b){
        this.a=a;
        this.b=(int) b;// type casting
        System.out.println(a*b);
    }

    public static void main(String[] args) {
        overloadingconstructor ob = new overloadingconstructor(3,4);
        overloadingconstructor obj = new overloadingconstructor(3.0,5.0);
        overloadingconstructor obje = new overloadingconstructor(38,67f);
    }
}
