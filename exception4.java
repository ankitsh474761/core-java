class sleep1 extends Thread {
    public  void run(){
        try {
            System.out.println("Printing Table Of 2 : ");
            for (int i = 1; i <= 10;i++){
                Thread.sleep(1000);
                System.out.println("2 * "+ i + " = "+ 2*i);
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
public class exception4{
    public static void main(String[] args) throws InterruptedException{
        sleep1 t = new sleep1();
        t.start();
        t.join();
        System.out.println("Printing Table Of 5 : ");
        for (int i = 1; i <= 10;i++){
            Thread.sleep(1000);
            System.out.println("5 * "+ i + " = "+ 5*i);
        }
    }
}