class Super_class{
    int a=30;
    int b=18;
    int c;
}
class Child_Class extends Super_class {
    public void LogicalOperator() {
        System.out.println("Logical Bitwise  Operator:");
        System.out.println("the value of AND is:"+(a&3));
        System.out.println("the value of OR is:"+(4|b));
        System.out.println("the value of NOT equal to is:"+(a!=b));
    } }
class Child_Class2 extends Child_Class {
    public void TernaryOperator() {
        System.out.println("Ternary Operator:");
        System.out.println(c=(a>b)?a:b);
    }}
class Child_Class3 extends Child_Class2{
    public void AssignmentOp(){
        System.out.println("Assignment Operator:");
        System.out.println(a+=1);
        System.out.println(a-=1);
        System.out.println(a*=(b+1));
        System.out.println(a/=(b+1));
        System.out.println(a%=b);
    } }
public class child_class1{
    public static void main(String[] args) {
        Child_Class3 obj= new Child_Class3();
        obj.LogicalOperator();
        obj.TernaryOperator();
        obj.AssignmentOp();
    } }






