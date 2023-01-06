package JAVA_PTIT;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class J07023 {

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

    public static boolean palind (int n){
        int tmp = 0, m = n;
        while (m > 0){
            tmp = tmp * 10 + m % 10;
            m /= 10;
        }
        return tmp == n;
    }

    public static void main(String[] args) {
        init();
        try {
            File f1 = new File("DATA1.in");
            File f2 = new File("DATA2.in");
            ArrayList<Integer> list1 = new ArrayList<>();
            ArrayList <Integer> list2 = new ArrayList<>();
            FileInputStream fis1 = new FileInputStream(f1);
            FileInputStream fis2 = new FileInputStream(f2);
            ObjectInputStream ois1 = new ObjectInputStream(fis1);
            ObjectInputStream ois2 = new ObjectInputStream(fis2);
            list1 = (ArrayList<Integer>) ois1.readObject();
            list2 = (ArrayList<Integer>) ois2.readObject();
            int[] cnt1 = new int[maxn + 1];
            int[] cnt2 = new int[maxn + 1];
            for (int x : list1){
                if (p[x] && palind(x)) cnt1[x]++;
            }
            for (int x : list2){
                if (p[x] && palind(x)) cnt2[x]++;
            }
            for (int i = 2; i <= maxn; ++i){
                if (cnt1[i] > 0 && cnt2[i] > 0) System.out.println(i + " " + cnt1[i] + " " + cnt2[i]);
            }
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
