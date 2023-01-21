//constructors
    class Akkk{
        Akkk(){
            System.out.println("base class constructor");
        }
    }
    class  derived extends Akkk{
        derived(){
            System.out.println("derived class constructor");
        }
    }
    public class lec9 {
        public static void main(String[] args) {
            derived d = new derived();
        }
}
