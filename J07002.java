package JAVA_PTIT;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class J07002 {

    public static boolean check (String s){
        if (s.length() > 9) return false;
        for (int i = 0; i < s.length(); ++i){
            if (!Character.isDigit(s.charAt(i))) return false;
        }
        return true;
    }

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File ("DATA.in");
        long ans = 0;
        Scanner sc = new Scanner (file);
        while (sc.hasNext()){
            String res = sc.next();
            if (check(res)) ans += Integer.parseInt(res);
        }
        System.out.println(ans);
    }
}