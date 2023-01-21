//3rd case
class Mythread6 extends Thread{
    int total = 0;
    public void run(){
        synchronized (this){
            System.out.println("child thread starts calling");
            for(int i = 1; i <=10; i++){
                total+=i;
                System.out.println("child thread sending the notification");
                notify();
            }
        }
    }
}

public class multi13 {
    public static void main(String[] args) throws InterruptedException {
        Mythread6 t =  new Mythread6();
        t.start();
        synchronized (t){
            System.out.println("main thread trying to call wait ()");
            t.wait();

            //after t.wait() call the control is transferred to the child thread and
            //after the abover operation the above method  needs to call notify() and
            // and control is transferred to the main thread and below two lines will be printed
           // System.out.println("hello");
            System.out.println("main thread got updated ");
            System.out.println(t.total);
        }
    }
}
