class test9 extends Thread{
    public void run(){
        System.out.println("Before:"+Thread.currentThread().getName());

        Thread.currentThread().setName("Sharma");
        System.out.println("After: "+Thread.currentThread().getName());

        System.out.println("thread task");
    }
}


public class multithreading {
    public static void main(String[] args) throws InterruptedException{
        test9 t = new test9();
        t.start();
        t.join();
        System.out.println(" t name   " +t.getName());
        Thread.currentThread().setName("ankit");
        System.out.println("the name of this thread is after setname is : "+Thread.currentThread().getName());

    }
}
