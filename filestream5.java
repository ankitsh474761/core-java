import java.io.*;
public class filestream5 {
    public static void main(String[] args) {
        File f = new File("ankit1.txt");
        if(f.exists()){
            System.out.println("file name : "+ f.getName());
            System.out.println("File Location : "+f.getAbsolutePath());
            System.out.println("File Writable : "+f.canWrite());
            System.out.println("File Readable : "+f.canRead());
            System.out.println("File Size : "+f.length());
        }
    }
}
