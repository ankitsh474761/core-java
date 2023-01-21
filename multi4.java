//setname() of thread class
class ThreadNaming1 extends Thread{
    public void run(){
        System.out.println("Thread is running...---"+Thread.currentThread().getName());
    }
}
public class multi4 {
    public static void main(String[] args) {
        ThreadNaming1 t1 = new ThreadNaming1();
        ThreadNaming1 t2 = new ThreadNaming1();
        System.out.println("Thread 1 : "+t1.getName());
        System.out.println("Thread 2 : "+t2.getName());
        t1.start();
        t2.start();
//        t1.setName("gfg");
//        t2.setName("javatpoint");
        System.out.println("THread names after changing the  thread name ");
        System.out.println("thread 1 : "+t1.getName());
        System.out.println("thread 2 : "+t2.getName());
    }
}
