class settingnameofthread extends Thread{
    settingnameofthread(String msg){
        super(msg);
    }
    public void run(){
        System.out.println("Thread is running ....");
        System.out.println(Thread.currentThread().getName());
    }
}

public class multithreading4 {
    public static void main(String[] args) {
        settingnameofthread t = new settingnameofthread("ankit");
        settingnameofthread t1 = new settingnameofthread("sharma");

        t.start();

        System.out.println("Thread 1 : "+t.getName());
        System.out.println("Thread 2 : "+t1.getName());
    }
}
