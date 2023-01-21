//implementing runnable interface
class MyRunnable1 implements Runnable{
    public void run(){
        for(int i = 0 ; i < 3;i++){
            System.out.println("child Thread");
        }
    }
}
public class multi2 {
    public static void main(String[] args) {
        MyRunnable1 r1 = new MyRunnable1();
//        r.start();//invalid
        //Thread t = new Thread();
        Thread t1 = new Thread(r1);
       // t.start();
        t1.start();
        for(int i = 0; i < 5; i++){
            System.out.println("main thread");
        }
    }
}
