//fetching name of the current thread
class ThreadNaming2 extends Thread{
    public void run(){
        System.out.println("Thread is running...");
    }
}
public class multi5 {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName()+Thread.currentThread().getPriority());
        ThreadNaming2 t1 = new ThreadNaming2();
        ThreadNaming2 t2 = new ThreadNaming2();
        t1.start();
        t2.start();
    }
}
