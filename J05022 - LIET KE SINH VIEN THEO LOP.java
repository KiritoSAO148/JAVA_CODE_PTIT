package JAVA_PTIT;
import java.util.*;

public class J05022 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList <SinhVien1> list = new ArrayList<>();
        for (int i = 1; i <= n; ++i){
            String msv = sc.nextLine();
            String ten = sc.nextLine();
            String lop = sc.nextLine();
            String mail = sc.nextLine();
            SinhVien1 x = new SinhVien1(msv, ten, lop, mail);
            list.add(x);
        }
        int q = Integer.parseInt(sc.nextLine());
        while (q-- > 0){
            String res = sc.nextLine();
            System.out.println("DANH SACH SINH VIEN LOP " + res + ":");
            for (SinhVien1 x : list){
                if (x.getLop().equals(res)) System.out.println(x);
            }
        }
    }
}