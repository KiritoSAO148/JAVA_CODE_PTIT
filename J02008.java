package JAVA_PTIT;
import java.util.*;

public class J02008 {

    public static long gcd (long a, long b){
        if (b == 0) return a;
        return gcd (b, a % b);
    }

    public static long lcm (long a, long b){
        return a / gcd(a,b) * b;
    }

    public static long[] f = new long[101];

    public static void init(){
        f[1] = 1;
        for (int i = 2; i <= 100; ++i){
            f[i] = lcm(i,f[i - 1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        init();
        int t = sc.nextInt();
        while (t-- > 0){
            int n = sc.nextInt();
            System.out.println(f[n]);
        }
    }
}
