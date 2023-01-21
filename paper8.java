class ansh extends Thread{
    @Override
    public void run() {
      for (int i = 0 ; i < 10 ; i++){
          try {
              System.out.println("calling child class");
              Thread.sleep(200);
          }
          catch (Exception e){
              e.printStackTrace();
          }

      }
    }
}
public class paper8 {
    public static void main(String[] args) throws InterruptedException{
        ansh obj = new ansh();
        obj.start();
        obj.join();
        for(int i = 0 ; i < 10; i++){
            System.out.println("calling main child");
        }
    }
}
