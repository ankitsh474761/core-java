//encapsulation
class student0{
    private String name;
    private String age;
    public void setName(String name){
       this.name = name;
    }
    public void getName(){
        System.out.println(name);
    }
}
public class paper5 {
    public static void main(String[] args) {
        student0 obj = new student0();
        obj.setName("ankit");
        obj.getName();
    }

}
