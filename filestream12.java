import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class filestream12 {
    public static void main(String[] args) throws IOException {
        FileInputStream f = new FileInputStream("ankit4.txt");
        BufferedInputStream bf = new BufferedInputStream(f);

        int i;
        while ((i = bf.read())!=-1){
            System.out.print((char)i+" ");
        }

        Scanner sc = new Scanner(bf);

        bf.close();
        f.close();

    }
}
