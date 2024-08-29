package JAVA_PTIT;

import java.util.*;
public class J02022 {

    public static int n;
    public static int[] a = new int[15];
    public static boolean ok;

    public static void init(){
        for (int i = 1; i <= n; ++i) a[i] = i;
    }

    public static void next(){
        int i = n - 1;
        while (i >= 1 && a[i] > a[i + 1]) --i;
        if (i == 0) ok = false;
        else{
            int j = n;
            while (a[i] > a[j]) --j;
            int tmp = a[i];
            a[i] = a[j];
            a[j] = tmp;
            int x = i + 1, y = n;
            while (x <= y){
                int res = a[x];
                a[x] = a[y];
                a[y] = res;
                ++x; --y;
            }
        }
    }

    public static boolean check(){
        for (int i = 1; i <= n - 1; ++i){
            if (Math.abs(a[i] - a[i + 1]) == 1) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            n = sc.nextInt();
            init();
            ok = true;
            while (ok){
                if (check()){
                    for (int i = 1; i <= n; ++i) System.out.print(a[i]);
                    System.out.println();
                }
                next();
            }
        }
    }
}