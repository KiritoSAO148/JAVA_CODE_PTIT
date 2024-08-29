package JAVA_PTIT;

import java.util.Scanner;

public class J01013 {
    final static int maxn = 2000000;

    public static int[] p = new int[maxn + 1];

    public static void sieve(){
        for (int i = 1; i <= maxn; ++i) p[i] = i;
        for (int i = 2; i <= Math.sqrt(maxn); ++i){
            if (p[i] == i){
                for (int j = i * i; j <= maxn; j += i){
                    if (p[j] > i) p[j] = i;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        sieve();
        int t = sc.nextInt();
        long sum = 0;
        while (t-- > 0){
            int n = sc.nextInt();
            while (n > 1){
                sum += p[n];
                n /= p[n];
            }
        }
        System.out.println(sum);
    }
}
