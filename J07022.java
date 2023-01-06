package JAVA_PTIT;

import java.io.File;
import java.io.IOException;
import java.util.*;

public class J07022 {

    public static boolean check (String s){
        for (int i = 0; i < s.length(); ++i){
            if (!Character.isAlphabetic(s.charAt(i))) return false;
        }
        return true;
    }

    public static void main(String[] args) throws IOException {
        File file = new File("DATA.in");
        Scanner sc = new Scanner(file);
        ArrayList <String> list = new ArrayList<>();
        while (sc.hasNext()){
            String s = sc.next();
            if (s.length() > 9) list.add(s);
            else if (check(s)) list.add(s);
        }
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
        for (String x : list) System.out.print(x + " ");
    }
}
