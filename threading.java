class ak00 extends Thread{

    @Override
    public void run() {
        String str = Thread.currentThread().getName();
        for (int i = 0; i < 5; i++) {
            System.out.println(str+" ---");
        }
    }
}

public class threading {
    public static void main(String[] args) {
        ak00 t = new ak00();
        ak00 t1 = new ak00();
        ak00 t2 = new ak00();
        t.setName("akk");
        t1.setName("akk1");
        t2.setName("akk3");
        t.start();
        t1.start();
        t2.start();
        String n = Thread.currentThread().getName();
        for (int k = 0 ; k < 3; k++){
            System.out.println(n);
        }
    }

}
