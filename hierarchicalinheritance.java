
public class hierarchicalinheritance {
    public static void main(String[] args) {
        System.out.println("parent class");
        car obj = new car();
        obj.Go();
        cycle oj = new cycle();
        oj.For();
        oj.Cy();
    }
}
class car extends hierarchicalinheritance {
    void Go() {

        System.out.println("child class");
    }
}
class  bicycle extends hierarchicalinheritance{
    void For(){

        System.out.println("child class");
    }
}
class  cycle extends bicycle{
    void Cy(){
        System.out.println("child of bicycle class");
    }
}
