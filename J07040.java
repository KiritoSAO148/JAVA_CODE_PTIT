package JAVA_PTIT;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.*;

public class J07040 {
    public static void main(String[] args) {
        try {
            File f1 = new File("NHIPHAN.in");
            FileInputStream fis = new FileInputStream(f1);
            ObjectInputStream ois = new ObjectInputStream(fis);
            ArrayList <String> list = (ArrayList<String>) ois.readObject();
            File f2 = new File("VANBAN.in");
            Scanner sc = new Scanner(f2);
            LinkedHashSet <String> set = new LinkedHashSet<>();
            HashSet <String> set2 = new HashSet<>();
            for (String x : list){
                StringTokenizer st = new StringTokenizer(x);
                while (st.hasMoreTokens()){
                    String tmp = st.nextToken().toLowerCase();
                    set2.add(tmp);
                }
            }
            while (sc.hasNextLine()){
                String s = sc.next().toLowerCase();
                set.add(s);
            }
            for (String x : set){
                if (set2.contains(x)) System.out.println(x);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
