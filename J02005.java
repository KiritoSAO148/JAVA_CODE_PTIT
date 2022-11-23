package JAVA_PTIT;
import java.util.*;

public class J02005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        int[] cnt = new int[1001];
        for (int i = 1; i <= n; ++i){
            int x = sc.nextInt();
            cnt[x] = 1;
        }
        for (int i = 1; i <= m; ++i){
            int x = sc.nextInt();
            if (cnt[x] == 1) cnt[x] = 2;
        }
        for (int i = 0; i <= 1000; ++i){
            if (cnt[i] == 2) System.out.print(i + " ");
        }
    }
}
