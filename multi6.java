//getpriority of thread
class ThreadDemo2 extends Thread{
    public void run(){
        System.out.println("INside run method");
    }
}
public class multi6 {
    public static void main(String[] args) {
        ThreadDemo2 t1 = new ThreadDemo2();
        ThreadDemo2 t2 = new ThreadDemo2();
        ThreadDemo2 t3 = new ThreadDemo2();

        System.out.println("t1 thread priority :"+t1.getPriority());
        System.out.println("t1 thread priority :"+t2.getPriority());
        System.out.println("t1 thread priority :"+t3.getPriority());

        t1.setPriority(2);
        t2.setPriority(5);
        t3.setPriority(8);

        System.out.println("t1 thread priority : "+t1.getPriority());
        System.out.println("t1 thread priority : "+t2.getPriority());
        System.out.println("t1 thread priority : "+t3.getPriority());

        System.out.println("currently executing thread "+ Thread.currentThread().getName());
        System.out.println("Main thread priority : "+Thread.currentThread().getPriority());
        Thread.currentThread().setPriority(10);
        System.out.println("Main thread priority : "+Thread.currentThread().getPriority());
    }
}
