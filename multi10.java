//synchronized block
class Display2{
    public void wish(String name){
        System.out.println("Hello");
        System.out.println("World");
        synchronized (this){
            for(int i = 0 ; i < 5;i++){
                System.out.println("Good Morning ");
                try {
                    Thread.sleep(2000);
                }
                catch (Exception e){
                    e.printStackTrace();
                }
                System.out.println(name);
            }
        }
    }
}

class Mythread3 extends Thread {
    Display2 d;
    String name;

        Mythread3(Display2 d, String name) {
        this.d = d;
        this.name = name;
    }
    public void run(){
        d.wish(name);
    }
}

public class multi10 {
    public static void main(String[] args) {
        Display2 d = new Display2();
        Mythread3 t1 = new Mythread3(d,"Dhoni");
        Mythread3 t2 = new Mythread3(d,"Virat");
        t2.start();
        t1.start();
    }
}
