package JAVA_PTIT;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class HELLO_FILE {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("Hello.txt");
        Scanner sc = new Scanner (file);
        while (sc.hasNext()){
            System.out.println(sc.nextLine());
        }
        sc.close();
    }
}
