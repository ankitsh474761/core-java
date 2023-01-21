class parent7 {
    int a=20;
    int b=16;
    int c = 100;
    }

public class child1 extends parent7 {
    public void LogicalOperators() {

        System.out.println("various operations are given below : ");
        System.out.println("the sum of a  and b is "+ (a+b));
        System.out.println("the subtraction of a and b is "+(a-b));
        System.out.println("the division of a and b is "+a / b);
        System.out.println("the modulus of a and b is "+a % b);
        System.out.println("the OR of a and c is "+(a|c));
    }
    public static void main(String[] args) {
        child1 obj = new child1();
        obj.LogicalOperators();
    }
}
