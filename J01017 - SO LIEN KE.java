package JAVA_PTIT;

import java.util.*;

public class J01017 {

    public static boolean check (String s){
        for (int i = 1; i < s.length() - 1; ++i){
            int a = s.charAt(i) - '0';
            int b = s.charAt(i - 1) - '0';
            int c = s.charAt(i + 1) - '0';
            if (Math.abs(a - b) != 1 || Math.abs(a - c) != 1) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0){
            String s = sc.nextLine();
            if (check(s)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
