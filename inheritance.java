import java.util.*;

class Pro extends  inheritance{//single level inheritance
    void For(){
        System.out.println("child class");
    }
}
class Ui extends Pro{// multilevel inheritance
    void  Go(){
        System.out.println("multilevel inheritance");
    }
}

public class inheritance {

    void  demo(int a){
        System.out.println(a*a);
    }
    public static void main(String[] args) {
//      single level inheritance
// parent child relationship
//        parent class other names: loop class and super class
         Ui obj =  new Ui();
       obj.demo(3);
       obj.For();
       obj.Go();
    }
}

