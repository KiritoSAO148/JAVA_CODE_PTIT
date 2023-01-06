package JAVA_PTIT;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class J07031 {

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

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        init();
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
        TreeSet<Integer> set = new TreeSet<>();
        for (int x : list1){
            if (p[x]) set.add(x);
        }
        HashSet<Integer> set2 = new HashSet<>();
        for (int x : list2) {
            if (p[x]) set2.add(x);
        }
        for (int x : set){
            if (x < maxn - x && !set2.contains(maxn - x) && !set2.contains((x)) && set.contains(maxn - x)) System.out.println(x + " " + (maxn - x));
        }
    }
}
