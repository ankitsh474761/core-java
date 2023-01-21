//getname() thread in java
//we can set the name of thread  by two ways
//1 creating the thread and passing the thread's name (direct method)
//2 using setName() method of thread class (indirect method)

class ThreadNaming extends Thread{
    ThreadNaming(String name){
        super(name);
    }
public void run(){
    System.out.println("thread is running ....");
}
}
public class multi3 {
    public static void main(String[] args) {
        ThreadNaming t1 = new ThreadNaming("g1");
        ThreadNaming t2 = new ThreadNaming("g2");
        System.out.println("Thread 1 : "+t1.getName());
        System.out.println("Thread 1 : "+t2.getName());
        t1.start();
        t2.start();
    }
}
