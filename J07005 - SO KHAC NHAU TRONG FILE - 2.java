package JAVA_PTIT;

import java.io.*;
import java.lang.reflect.Array;
import java.util.*;

public class J07005 {
    public static void main(String[] args)  {
        try {
            File file = new File("DATA.IN");
            FileInputStream fis = new FileInputStream(file);
            DataInputStream ois = new DataInputStream(fis);
            int[] cnt = new int[1001];
            for (int i = 0; i < 100000; ++i){
                cnt[ois.readInt()]++;
            }
            for (int i = 0; i <= 1000; ++i){
                if (cnt[i] > 0) System.out.println(i + " " + cnt[i]);
            }
            fis.close();
            ois.close();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
