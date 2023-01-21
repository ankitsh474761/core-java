
class my extends Thread{
    public void run(){
        for(int i = 0; i < 90 ; i++){
            System.out.println("child thread");
        }
    }
}
public class paper2 {
    public static void main(String[] args) {
        my ak = new my();
        ak.start();
        for(int i = 0 ; i < 90; i ++){
            System.out.println("ehllo");
        }
    }
}
