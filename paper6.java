//static
//class anshu0{
//    static void sum(){
//        System.out.println("hello");
//    }
//}
//public class paper6 {
//    public static void main(String[] args) {
//        anshu0 obj = new anshu0();
//        obj.sum();  //success
//    }
//}

//private
//class anshu0{
//    private void sum(){
//        System.out.println("hello");
//    }
//}
//// private - outside  the class
//public class paper6 {
//
//    public static void main(String[] args) {
//       anshu0 obj = new anshu0();
//       obj.sum();
//    }
//}

//static variable
//class anki0{
//    int rollno;
//    String name;
//    static String college = "Abvgiet";
//    anki0(int rollno,String name){
//        this.rollno = rollno;
//        this.name = name;
//    }
//    void display(){
//        System.out.println(name+ " "+rollno+" "+college);
//    }
//}
//      public class paper6{
//    public static void main(String[] args) {
//      anki0 obj = new anki0(8,"ankit");
//      obj.display();
//    }
//}



//static method
//class students{
//    int rollno;
//    String name;
//    static String college = "IBM";
//    static void change(){
//        college = "abvgiet";
//    }
//    students(int rollno , String name){
//        this.rollno = rollno;
//        this.name = name;
//    }
//    void display(){
//        System.out.println(rollno+college+name);
//    }
//}
//public class paper6 {
//    public static void main(String[] args) {
//        students obj = new students(23,"anshu");
//        obj.display();
//        obj.change();
//        obj.display();
//    }
//}

//
////static block
//public class paper6 {
//    public static void main(String[] args) {
//
//    }
//    static {
//        System.out.println("hello");
//    }
//}

