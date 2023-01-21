public class interfaces2 {
    void show(int a, float b) {
        System.out.println(a * b);
    }

    int show(int a, int c) {
        return a / c;
    }
    float show(float a,double b){
        System.out.println(a*b);
        return 0;
    }

    public static void main(String[] args) {
        interfaces ob =new interfaces();
    }
}

