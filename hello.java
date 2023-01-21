class Super_class1{
    int a=17;
    int b=19;
    int c;
    public void RelationalOperator() {
        System.out.println("Relational Operator:");
        System.out.println(a<b);
        System.out.println(a<=b);
        System.out.println(a>b);
        System.out.println(a>=b);
        System.out.println(a==b);
        System.out.println(a!=b);
    } }
class Child_Class4 extends Super_class1{
    public void UnaryOperator() {
        System.out.println("Increment and decrement Operator:");
        System.out.println(a++);
        System.out.println(++a);
        System.out.println(--b);
        System.out.println(b--);
        System.out.println(b);
    } }
class Child_Class5 extends Super_class1{
    public void AssignmentOperators(){
        System.out.println("Assignment Operator:");
        System.out.println(a+=1);
        System.out.println(a-=1);
        System.out.println(a*=(b+1));
        System.out.println(a/=(b+1));
        System.out.println(a%=b);
    } }
public class hello{
    public static void main(String[] args) {
        Child_Class4 obj1 = new Child_Class4();
        Child_Class5 obj2 = new Child_Class5();
        obj1.UnaryOperator();
        obj2.AssignmentOperators();
        obj1.RelationalOperator();
        obj2.RelationalOperator();
    }
}