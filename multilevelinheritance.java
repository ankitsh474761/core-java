class  amit{
    int a =3;
    int b =2 ;
    int fun2(){
        System.out.print("result of multipication is = ");
        return a*b;
    }
}
class himanshu extends amit{
    int fun3(){
        System.out.print("addition of two numbers is = ");
        return a+b;
    }
}
class rangra extends himanshu{
    int a =89;
    int b =23;
    int fun4(){
        System.out.print("division of two numbers is = ");
        return  a/b;
    }
}

public class multilevelinheritance extends rangra{
    public static void main(String[] args) {
        multilevelinheritance inh = new multilevelinheritance();
        System.out.println(inh.fun2());
        System.out.println(inh.fun3());
        System.out.println(inh.fun4());

    }
}
