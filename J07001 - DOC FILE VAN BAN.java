package JAVA_PTIT;
import java.util.*;
import java.io.*;

public class J07001 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File ("DATA.in");
        Scanner sc = new Scanner (file);
        while (sc.hasNext()){
            System.out.println(sc.nextLine());
        }
        sc.close();
    }
}
