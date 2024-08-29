package JAVA_PTIT;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class J07021 {
    public static void main(String[] args) throws IOException {
        File file = new File("DATA.in");
        Scanner sc = new Scanner(file);
        List <String> list = new ArrayList<>();
        while (sc.hasNextLine()){
            String s = sc.nextLine();
            if (s.compareTo("END") == 0) break;
            s = s.toLowerCase();
            String res = "";
            StringTokenizer st = new StringTokenizer(s);
            while (st.hasMoreTokens()){
                String tmp = st.nextToken();
                tmp = tmp.toLowerCase();
                res += Character.toUpperCase(tmp.charAt(0));
                for (int i = 1; i < tmp.length(); ++i) res += tmp.charAt(i);
                res += " ";
            }
            res = res.trim();
            list.add(res);
        }
        for (String x : list) System.out.println(x);
    }
}
