
class sleep11 extends Thread {
    public  void run(){
        try {
            System.out.println("Printing Table Of 2 : ");
            for (int i = 1; i <= 5;i++){

                System.out.println("2 * "+ i + " = "+ 2*i);
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
public class rajat{
    public static void main(String[] args) throws InterruptedException{
        sleep1 t = new sleep1();
        t.start();
        t.join();


        System.out.println("Printing Table Of 4 : ");
        for (int i = 1; i <=5;i++){
            System.out.println("4 * "+ i + " = "+ 4*i);

        }
    }
}












