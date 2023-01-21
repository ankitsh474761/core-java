import java.io.*;
import java.util.Scanner;

public class filestream2 {
    public static void main(String[] args) {
        File file = new File("ankit.txt");
        try{
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()){
                String line = sc.nextLine();
                System.out.println(line);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
//public class DataStreamExample {
//    public static void main(String args[]){
//        try{
//            FileInputStream fin=new FileInputStream("D:\\testout.txt");
//            int i=0;
//            while((i=fin.read())!=-1){
//                System.out.print((char)i);
//            }
//            fin.close();
//        }catch(Exception e){System.out.println(e);}
//    }
