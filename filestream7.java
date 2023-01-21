//buffered output stream
import java.io.*;
import java.nio.charset.StandardCharsets;

public class filestream7 {
    public static void main(String[] args) throws IOException {
        FileOutputStream f = new FileOutputStream("ankit3.txt");
        BufferedOutputStream bout = new BufferedOutputStream(f);
        String s = "welcome to javatpoint hjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjj";
        byte b[] = s.getBytes();
        bout.write(b);
        bout.close();
        f.close();
        System.out.println("success");
    }
}

//public class BufferedOutputStreamExample{
//    public static void main(String args[])throws Exception{
//        FileOutputStream fout=new FileOutputStream("D:\\testout.txt");
//        BufferedOutputStream bout=new BufferedOutputStream(fout);
//        String s="Welcome to javaTpoint.";
//        byte b[]=s.getBytes();
//        bout.write(b);
//        bout.flush();
//        bout.close();
//        fout.close();
//        System.out.println("success");
//    }
//}