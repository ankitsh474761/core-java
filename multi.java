//extending thread class

class Mythread extends Thread{
    public void run(){
        for(int i =0 ; i < 5; i++){
            System.out.println(Thread.currentThread().getId());
            System.out.println(Thread.currentThread().getName());
            System.out.println("child thread");
        }
    }
    public void run(int a){
        System.out.println("run method with argument");
    }
}
public class multi {
    public static void main(String[] args) {
        Mythread t = new Mythread();
//        t.run();
//        t.run(10);
        t.start();
        System.out.println(":::"+t.getName());

        for (int a = 0; a < 7; a++) {
            System.out.println(Thread.currentThread().getId());
            System.out.println("parent thread ");
        }
    }
}
