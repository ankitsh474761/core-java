//synchronized method
class Display{
     public synchronized void  wish(String name){//also check without synchronized
        for(int i =0; i < 5;i++){
            System.out.println("Good Morning ");
            try {
                Thread.sleep(2000);
            }
            catch (Exception e){
                System.out.println(name);
            }
            System.out.println(name);
        }
    }
}

class Mythread2 extends Thread{
    Display d;
    String name;
    Mythread2(Display d , String name){
        this.d=d;
        this.name=name; //learn this keyword  from javatpoint
    }
    public void run(){
        d.wish(name);
    }
}

public class multi9{
    public static void main(String[] args) {
        Display d1 = new Display();//only one OBJECT
        Mythread2 t1 = new Mythread2(d1,"Dhoni");
        Mythread2 t2 = new Mythread2(d1,"Virat");
        t1.start();
        t2.start();
    }
}
