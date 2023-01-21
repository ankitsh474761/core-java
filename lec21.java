//constructors in inheritance
// order of execution of constructors in java
// single level inheritance

class parent2{
    parent2(){// this parent class constructor will call parent class constructor i.e object class constructor which has 0 argument
        // and object class constructor contain empty implementation
        System.out.println("calling parent class constructor");
    }
}

class childclass extends parent2{
    childclass(){// this childclass construcor will class the parent class constructor which has 0 argument
        System.out.println("calling child class constructor");
    }
}

public class lec21 {
    public static void main(String[] args) {
        new childclass();//nameless objects
        //we use nameless objects  only when we have constructors in our class
    }
}
