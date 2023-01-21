//runtime polymorphism using overriding the  method
// multilevel inheritance
class  parent1{
    void print(){
        System.out.println("parent class function");
    }
}
class subclass1 extends parent1{
    @Override
    void print() {
        super.print();//it will the parent class print method
        System.out.println("subclass1 class function");
    }
}
class subclass2 extends parent1{
    @Override
    void print() {
        System.out.println("subclass2 class function");
    }
}
public class lec20 {
    public static void main(String[] args) {
        parent1 a;// UPCASTING
        //PARENT P = NEW CHILD(); VALID
        // CHILD C = NEW PARENT(); INVALID
       // parent1 a;// here a is a reference variable of parent class
       a = new subclass1();//at runtime it will do binding with the subclass1()
        a.print();


        a = new subclass2();
        a.print();

    }
}
