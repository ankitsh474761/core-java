public class static4 {
    private static int currentcount = 0;
    public  void sampleclass(){
        currentcount++;
    }

    public static void main(String[] args) {
        static4 obj = new static4();
        obj.sampleclass();
        System.out.println(static4.currentcount);
    }
}
