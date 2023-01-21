//overriding of start()
//no multithreading if we override start() of thread class
//the overrided start() executed like a normal method

class Mythread1 extends Thread{
//    public void start(){
//        for(int i = 0 ; i < 5; i++){
//            System.out.println("calling start()");
//        }
//    }

    public void run(){
        System.out.println(Thread.currentThread().getName()+"is running");
        for (int i =0; i< 5; i++){
            System.out.println("child thread is running");
        }
    }
}
public class multi1 {
    public static void main(String[] args) {
        Mythread1 t = new Mythread1();
        t.start();
        for(int i =  0 ; i < 5;i++){
            System.out.println("Main Thread is running");
        }
    }
}
