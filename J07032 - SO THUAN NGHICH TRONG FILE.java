package JAVA_PTIT;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class J07032 {

    public static final int maxn = 1000000;

    public static boolean palind (int n){
        int tmp = 0, m = n;
        while (n > 0){
            tmp = tmp * 10 + n % 10;
            n /= 10;
        }
        return tmp == m;
    }

    public static boolean check (int n){
        while (n > 0){
            int d = n % 10;
            if (d % 2 == 0) return false;
            n /= 10;
        }
        return true;
    }

    public static boolean check2 (int n){
        int cnt = 0;
        while (n > 0){
            ++cnt;
            n /= 10;
        }
        return cnt > 1 && cnt % 2 == 1;
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Scanner sc = new Scanner(System.in);
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
            if (palind(x) && check(x) && check2(x)) cnt1[x]++;
        }
        for (int x : list2){
            if (palind(x) && check(x) && check2(x)) cnt2[x]++;
        }
        int d = 0;
        for (int i = 0; i <= maxn; ++i){
            if (cnt1[i] > 0 && cnt2[i] > 0) {
                System.out.println(i + " " + (cnt1[i] + cnt2[i]));
                ++d;
            }
            if (d == 10) break;
        }
    }
}
