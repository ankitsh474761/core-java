//constructors in inheritance
// order of execution of constructors in java
// single level inheritance

class parent3{
    parent3(){// this parent class constructor will call parent class constructor i.e object class constructor which has 0 argument
        // and object class constructor contain empty implementation
        System.out.println("calling parent class constructor");
    }

}

class childclass1 extends parent3{
    childclass1(){// this childclass construcor will class the parent class constructor which has 0 argument
        System.out.println("calling child class constructor");
    }
    childclass1(int a){
        System.out.println("value of a is : "+a);
    }
}

public class lec22 {
    public static void main(String[] args) {
        new childclass1();
        new childclass1(20);//nameless objects
        //we use nameless objects  only when we have constructors in our class
    }
}
