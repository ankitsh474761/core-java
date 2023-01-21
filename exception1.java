//default exception handling
public class exception1 {
public void dostuff(){

    System.out.println("calling do stuff");
    dostuff1();
}
public  void dostuff1(){
    System.out.println("calling do stuff1");
   dostuff2();
}
public void dostuff2(){
    System.out.println("calling do stuff2");
    System.out.println(10/0);
}
    public static void main(String[] args) {
    exception1 obj = new exception1();
    obj.dostuff();
    System.out.println("it will not be executed");
    }
}
