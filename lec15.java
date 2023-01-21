class lec15{
    void run(){System.out.println("running");}
}
class Splendor extends lec15{
    void run(){System.out.println("running safely with 60km");}

    public static void main(String args[]){
        lec15 b = new lec15();
        lec15 v = new Splendor();//upcasting
        b.run();
        v.run();
        Splendor s = new Splendor();
        s.run();
    }
}
