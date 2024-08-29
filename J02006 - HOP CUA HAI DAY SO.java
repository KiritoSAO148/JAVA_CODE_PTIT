package JAVA_PTIT;
import java.util.*;

public class J02006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        int[] cnt = new int[1001];
        for (int i = 1; i <= n; ++i){
            int x = sc.nextInt();
            cnt[x]++;
        }
        for (int i = 1; i <= m; ++i){
            int x = sc.nextInt();
            cnt[x]++;
        }
        for (int i = 0; i <= 1000; ++i){
            if (cnt[i] >= 1) System.out.print(i + " ");
        }
    }
}
