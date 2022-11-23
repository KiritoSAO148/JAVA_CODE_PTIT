package JAVA_PTIT;
import java.util.*;

public class J02007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();
        for (int j = 1; j <= t; ++j) {
            int n = sc.nextInt();
            int[] a = new int[n];
            int[] cnt = new int[100001];
            for (int i = 0; i < n; ++i) {
                a[i] = sc.nextInt();
                cnt[a[i]]++;
            }
            System.out.println("Test " + j + ":");
            for (int i = 0; i < n; ++i){
                if (cnt[a[i]] > 0){
                    System.out.print(a[i] + " xuat hien " + cnt[a[i]] + " lan\n");
                    cnt[a[i]] = 0;
                }
            }
        }
    }
}
