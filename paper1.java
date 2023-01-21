//which is best runnable or thread
class ankit4{
   void ak(){
        System.out.println("calling ak");
    }
}
class ankit5 extends ankit4 implements Runnable {
    @Override
    public void run() {
        System.out.println("calling run");
        ak();
    }
}
public class paper1 {
    public static void main(String[] args) {
        ankit5 ak1 = new ankit5();
        Thread t = new Thread(ak1);
        t.start();
    }
}
