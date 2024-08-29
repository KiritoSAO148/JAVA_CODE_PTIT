package JAVA_PTIT;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class J07029 {

    public static final int maxn = 1000000;

    public static boolean[] p = new boolean[maxn + 1];

    public static void init(){
        for (int i = 0; i <= maxn; ++i) p[i] = true;
        p[0] = p[1] = false;
        for (int i = 2; i <= Math.sqrt(maxn); ++i){
            if (p[i]){
                for (int j = i * i; j <= maxn; j += i) p[j] = false;
            }
        }
    }

    public static void main(String[] args) {
        init();
        try {
            File file = new File("DATA.in");
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);
            ArrayList <Integer> list = (ArrayList<Integer>) ois.readObject();
            int[] cnt = new int[maxn + 1];
            for (int x : list){
                if (p[x]) cnt[x]++;
            }
            int d = 0;
            for (int i = maxn; i >= 2; --i){
                if (d < 10 && cnt[i] > 0){
                    System.out.println(i + " " + cnt[i]);
                    ++d;
                }
            }
            fis.close();
            ois.close();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
