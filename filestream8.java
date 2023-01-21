import java.io.*;
public class filestream8 {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("ankit3.txt");
        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
        int i;
        while ((i=bufferedInputStream.read())!=-1){
            System.out.println((char)i);
        }

        bufferedInputStream.close();
        fileInputStream.close();

    }
}
//see javatpoint for more filehandling


//public class BufferedInputStreamExample{
//    public static void main(String args[]){
//        try{
//            FileInputStream fin=new FileInputStream("D:\\testout.txt");
//            BufferedInputStream bin=new BufferedInputStream(fin);
//            int i;
//            while((i=bin.read())!=-1){
//                System.out.print((char)i);
//            }
//            bin.close();
//            fin.close();
//        }catch(Exception e){System.out.println(e);}
//    }
//}