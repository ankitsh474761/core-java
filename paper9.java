class ANk extends Thread{
    @Override
    public void run() {
        for (int i = 0 ; i < 10 ; i++){
            System.out.println("calling child");
        }
    }
}
public class paper9 {
    public static void main(String[] args)  {
        ANk obj = new ANk();
        obj.start();
        obj.yield();
        for (int k = 0  ; k < 9;k++){
            System.out.println("calling main");
        }
    }
}
