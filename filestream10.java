import java.io.FileInputStream;
import java.io.IOException;

public class filestream10 {
    public static void main(String[] args) throws IOException {
        FileInputStream f = new FileInputStream("ankit4.txt");
        int i ;
        while ((i = f.read())!=-1){
            System.out.print((char)i+" ");
        }
    }
}
