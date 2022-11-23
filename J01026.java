package JAVA_PTIT;
import java.util.*;

public class J01026 {

    public static boolean check (int n){
        int m = (int) Math.sqrt(n);
        if (m * m == n) return true;
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            int n = sc.nextInt();
            if (check(n)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
