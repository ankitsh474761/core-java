public class multi7 extends Thread{
    public void run(){
        for (int i = 0; i < 6;i++){
            System.out.println(Thread.currentThread().getName()+" in control");
        }
    }
    public static void main(String[] args) {
        //newborn state
        multi7 t1 = new multi7();
        multi7 t2 = new multi7();

       // t1.setPriority(10);
      //  Thread.currentThread().setPriority(6);
        t1.setPriority(2);
        t2.setPriority(2);

        //ready state

        t1.start();
        t1.yield();
       t2.start();
        for(int i = 0;i < 6;i++){
            System.out.println(Thread.currentThread().getName()+" in control");
        }
    }
}
