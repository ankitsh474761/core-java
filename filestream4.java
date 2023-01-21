import java.io.*;
//copying file into another file
public class filestream4 {
    public static void main(String[] args) throws IOException{

        FileInputStream fileInputStream = new FileInputStream("ankit.txt");
        FileOutputStream fileOutputStream = new FileOutputStream("ankit1.txt");//creating ankit1 file
        //as well as in outputstream we can also write into the file
        int i ;
        while((i=fileInputStream.read())!=-1){//it will read in the form of assci characters so to store it we have taken in type variable
            fileOutputStream.write((char)i);
        }
        System.out.println("data copied successfully from ankit to ankit1.txt file");

    }
}
