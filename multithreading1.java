class Testing1 extends Thread{
    public void run() {
        System.out.println("how are u ");
        int a = 23;
        int b = 0;
        Thread.currentThread().setName("ankit :::");
        System.out.println("checking inside the run : "+Thread.currentThread().isAlive());
        System.out.println(a/b);       //  how to handle this exception by using throws keyword
    }
}

public class multithreading1  {
    public static void main(String[] args) {
        Testing1 t = new Testing1();

        t.start();
        System.out.println(t.isAlive());
        System.out.println("calling main thread");

        System.out.println(Thread.currentThread().isAlive());
    }
}
