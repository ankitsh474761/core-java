public class anshu {
    anshu(){
        System.out.println("helo");
    }
    anshu(int a){
        System.out.println("rajat");
    }
    anshu (float a){
        System.out.println("float");
    }
    public static void main(String[] args) {
        anshu obj = new anshu();
        anshu b = new anshu(5.0F);
    }
}
