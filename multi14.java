//4th case table
class Table{
    void printTable(int n){
        for(int i = 1 ; i <= 5;i++){
            System.out.println(n*i);
            try {
                Thread.sleep(200);
            }catch (Exception e){
                System.out.println(e);
            }
        }
    }
}
class mythread78 extends Thread{
    Table t;
    mythread78(Table t){
        this.t=t;
    }
    public void run(){
        t.printTable(100);
    }
}
public class multi14 {
    public static void main(String[] args) {
        Table obj = new Table();
        mythread78 t1 = new mythread78(obj);
        t1.start();
    }
}
