package JAVA_PTIT;

import java.io.*;
import java.util.*;

public class J07004 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File ("DATA.in");
        Scanner sc = new Scanner (file);
        int mi = Integer.MAX_VALUE, ma = Integer.MIN_VALUE;
        int[] cnt = new int[1001];
        while (sc.hasNext()){
            int x = Integer.parseInt(sc.next());
            mi = Math.min(mi, x);
            ma = Math.max(ma, x);
            cnt[x]++;
        }
        for (int i = mi; i <= ma; ++i){
            if (cnt[i] != 0) System.out.println(i + " " + cnt[i]);
        }
    }
}
