package JAVA_PTIT;
import java.util.*;

public class J01018 {

    public static boolean check1 (String s){
        int sum = 0;
        for (char x : s.toCharArray()) sum += x - '0';
        return sum % 10 == 0;
    }

    public static boolean check2 (String s){
        for (int i = 1; i < s.length() - 1; ++i){
            int a = s.charAt(i);
            int b = s.charAt(i - 1);
            int c = s.charAt(i + 1);
            if (Math.abs(a - b) != 2 || Math.abs(a - c) != 2) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0){
            String s = sc.nextLine();
            if (check2(s) && check1(s)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
