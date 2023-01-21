import java.io.*;

public class filestream1 {
    public static void main(String[] args) {

        try {
            FileWriter file = new FileWriter("ankit.txt");
            file.write("writing into the ankit.txt file ghgh \n jakdjfk \n how are you");
            file.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
