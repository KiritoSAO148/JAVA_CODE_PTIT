package JAVA_PTIT;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class J07015 {

    public static final int maxn = 10000;

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

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        init();
        File file = new File("SONGUYEN.in");
        FileInputStream fis = new FileInputStream(file);
        ObjectInputStream ois = new ObjectInputStream(fis);
        ArrayList <Integer> list = (ArrayList<Integer>) ois.readObject();
        int[] cnt = new int[maxn + 1];
        for (int i = 0; i < list.size(); ++i){
            if (p[list.get(i)]) cnt[list.get(i)]++;
        }
        for (int i = 2; i <= maxn; ++i){
            if (cnt[i] > 0) System.out.println(i + " " + cnt[i]);
        }
    }
}
