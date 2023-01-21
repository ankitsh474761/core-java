class parent6 {

        int a=20;
        int b=16;
        int c;

        public void LogicalOperators(){

            System.out.println("Logical Operator:");

            System.out.println(a&b);

            System.out.println(a|b);

            System.out.println(0!=0);
        }
    }
    class Child_Class1 extends parent6  {

        public void TernaryOperator() {

            System.out.println("Ternary Operator:");
            System.out.println(c=(a>b)?a:b);

        }
    }
    public class  parent_class{

        public static void main(String[] args){

            Child_Class1 obj = new Child_Class1();

            obj.LogicalOperators();

            obj.TernaryOperator();
        }
    }


