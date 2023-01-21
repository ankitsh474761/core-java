class  vechile1{
    vechile1 getObject(){
        System.out.println("the base class method");
        return new vechile1();
    }
}
class car1 extends vechile1{
    @Override
    car1 getObject(){
        System.out.println("derived class method ");
        return new car1();
    }
}
public class lec17 {
    public static void main(String[] args) {
        car1 lexus = new car1();
        lexus.getObject();
    }
}
