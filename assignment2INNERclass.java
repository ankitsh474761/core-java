class Outer{
    private static void outerMethod(){
        System.out.println("calling outer method");
    }
   static class Inner{
        public static void innerMethod(){
            System.out.println("calling inner method");
            outerMethod();
        }
    }
}
 public class assignment2INNERclass {
    public static void main(String[] args) {
        Outer.Inner  obj = new Outer.Inner();
        obj.innerMethod();

    }
}
