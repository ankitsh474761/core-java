//sleep and join in multithreading
public class multi8 extends Thread {
    public void run(){
        for(int i =0;i<10;i++){
            System.out.println(Thread.currentThread().getName()+" in control ");
            try {
                Thread.sleep(2000);
            }
            catch (Exception e){
                e.printStackTrace();
            }
        }
//        try{
//            Thread.sleep(30000);
//            System.out.println("Thread in sleeping state");
//        }
//        catch (Exception e){
//            System.out.println("This exceptin has been caught : "+ e);
//        }
    }
    public static void main(String[] args) throws Exception{
        multi8 t1 = new multi8();
        t1.start();
        t1.join();
        for(int i = 0 ; i < 10;i++){
            System.out.println(Thread.currentThread().getName()+" in control  ");
        }
    }
}
