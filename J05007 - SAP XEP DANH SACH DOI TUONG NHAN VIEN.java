package JAVA_PTIT;

import java.util.*;

public class J05007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<NhanVien> list = new ArrayList<>();
        for (int i = 1; i <= n; ++i){
            String name = sc.nextLine();
            String gioiTinh = sc.nextLine();
            String date = sc.nextLine();
            String dc = sc.nextLine();
            String mst = sc.nextLine();
            String hd = sc.nextLine();
            NhanVien x = new NhanVien(i, name, gioiTinh, date, dc, mst, hd);
            list.add(x);
        }
        Collections.sort(list, new Comparator<NhanVien>() {
            @Override
            public int compare(NhanVien o1, NhanVien o2) {
                String[] s1 = o1.getDate().split("/");
                String[] s2 = o2.getDate().split("/");
                String res1 = "", res2 = "";
                for (int i = s1.length - 1; i >= 0; --i) res1 += s1[i];
                for (int i = s2.length - 1; i >= 0; --i) res2 += s2[i];
                return res1.compareTo(res2);
            }
        });
        for (NhanVien x : list) System.out.println(x);
    }
}