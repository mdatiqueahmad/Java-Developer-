import java.io.FileNotFoundException;
import java.io.FileReader;

public class checked01 {
    public static void main(String[] args) {

        try {
            FileReader fileReader=new FileReader("data.text");
            System.out.println("File opened");
        }
        catch (FileNotFoundException e) {
           // e.printStackTrace();
            System.out.println("file not found");
        }
    }
}
