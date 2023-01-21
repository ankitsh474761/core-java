class priority1 extends Thread{
    public void run(){
        System.out.println("inside the run method");
        System.out.println(Thread.currentThread().getPriority());
    }
}

public class multithreading2 {
    public static void main(String[] args) {
        priority1 t = new priority1();
        t.start();
        System.out.println("checking priority inside main: "+Thread.currentThread().getPriority());
    }
}

// 1 - MIN_PRIORITY
// 5 - NORM_PRIORITY
//10 - MAX_PRIORITY