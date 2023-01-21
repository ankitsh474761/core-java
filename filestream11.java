import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class filestream11 {
    public static void main(String[] args) throws IOException {
        FileOutputStream f = new FileOutputStream("ankit4.txt");//calling file
        BufferedOutputStream ff = new BufferedOutputStream(f);

        String s = " hello";
        byte b[] = s.getBytes();
        ff.write(b);

        ff.close();
        f.close();
    }
}
