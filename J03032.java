package JAVA_PTIT;
import java.util.*;

public class J03032 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0){
            String s = sc.nextLine();
            String[] a = s.split("\\s+");
            for (int i = 0; i < a.length; ++i){
                StringBuilder sb = new StringBuilder(a[i]);
                System.out.print(sb.reverse() + " ");
            }
            System.out.println();
        }
    }
}
