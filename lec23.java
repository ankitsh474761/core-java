//constructors in multilevel inheritance
class college{
    college(){
        System.out.println("calling college class constructor");
    }
}
class department extends college{
    department(){
        System.out.println("department constructor executed");
    }
}
class student extends department{
    student(){
        System.out.println("student constructor executed");
    }
}

public class lec23 {
    public static void main(String[] args) {
        new student();//nameless object
    }
}
