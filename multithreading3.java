class sleep12 extends Thread {
    public  void run(){
        try {
            for (int i = 1; i < 7;i++){
                System.out.println(2*i);
                Thread.sleep(2000);
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
 public class multithreading3{
     public static void main(String[] args) throws InterruptedException{
         sleep1 t = new sleep1();
         t.start();
         t.join();


         System.out.println("printing table of 4");
         for (int i = 1; i < 7;i++){
             Thread.sleep(2000);
             System.out.println(4*i);
         }
     }
 }
 //so without join we will get mixed output because of same  priority of main or method