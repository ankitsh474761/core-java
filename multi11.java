//wait() notify() and notifyall()
//1st case
class Mythread4 extends Thread{
    int total =0;
    public void run(){
        for(int i = 0 ; i <= 100 ; i++){
            total+=i;
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
               // System.out.println("hwllo");
                e.printStackTrace();
            }
            System.out.println(total);
        }
    }
}


public class multi11 {
    public static void main(String[] args) throws InterruptedException{
        Mythread4 t = new Mythread4();
        t.start();
       Thread.sleep(2000);
        System.out.println("  total is   "+t.total);// not printing this in sleep printing 0 here

    }
}
