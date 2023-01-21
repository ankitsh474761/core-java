 class static12 {
    int roll;
    String name;
    static int college_id = 20008;
    static String clg_name = "ABVGIET";
    int count = 1;
    void put_data(int r, String n) {
        roll = r;
        name = n;
    }
    static void change(int cg_id) {
        college_id = cg_id;
    }
    void display() {
        System.out.println("Student No. : " + count);
        System.out.println("RollNo. : " + roll);
        System.out.println("Name : " + name);
        System.out.println("CollegeID : " + college_id);
    }
}
public class static1 {
    public static void main(String[] args) {
        System.out.println("\n\t\tSTUDENT DETAILS....");
        System.out.println("\t\tCollege Name : " + static12.clg_name);
        System.out.println("\n\t Before modifying static variable:");
        static12 obj1 = new static12();
        obj1.put_data(2008, "Ankit Sharma");
        obj1.display();
        System.out.println("\n\t After modifying static variable:");
        static12.change(203008);
        obj1.display();
    }
}
