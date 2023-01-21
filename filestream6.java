//bufferwriter


import java.io.*;
public class filestream6 {
    public static void main(String[] args) throws IOException {
        FileWriter f = new FileWriter("ankit.txt",true);
        f.write("ankit");
        BufferedWriter bw = new BufferedWriter(f);
        bw.write(" computer");

        bw.close();

    }
}
