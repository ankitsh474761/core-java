import java.io.FileOutputStream;
import java.io.IOException;

public class filestream9 {
    public static void main(String[] args) throws IOException {
        FileOutputStream f = new FileOutputStream("ankit4.txt");//creating file
        String s = " hello how are u ";
        f.write(Integer.parseInt(s));
        f.write(68);
        f.close();
    }
}
