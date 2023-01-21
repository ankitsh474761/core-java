//import java.io.File;
//import java.io.IOException;
import java.io.*;

public class filestream {
    public static void main(String[] args) {
        File file = new File("ankit.txt");
        try{
            file.createNewFile();
            System.out.println("file has been created successfully");
        }
        catch (IOException e){
            System.out.println("Unable to create new file");
            e.printStackTrace();
        }
    }
}
//see javatpoint for more filehandling
