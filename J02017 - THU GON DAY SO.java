package JAVA_PTIT;

import java.util.*;

public class J02017 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        ArrayList <Integer> list = new ArrayList<>();
        for (int i = 0; i < n; ++i) list.add(sc.nextInt());
        boolean ok = true;
        while (ok){
            ok = false;
            for (int i = 0; i < list.size() - 1; ++i){
                if ((list.get(i) + list.get(i + 1)) % 2 == 0){
                    ok = true;
                    list.remove(i);
                    list.remove(i);
                }
            }
        }
        System.out.println(list.size());
    }
}