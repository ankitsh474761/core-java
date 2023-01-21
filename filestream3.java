import java.io.*;

public class filestream3 {
    public static void main(String[] args) {
        File file = new File("ankit.txt");
        if(file.delete()){
            System.out.println("I have deleted : "+ file.getName());
        }
        else {
            System.out.println("Some problem occured while deleting the file ");
        }
    }
}
