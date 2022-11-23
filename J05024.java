package JAVA_PTIT;
import java.util.*;

public class J05024 {
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
            String tmp = "";
            for (int i = 0; i < res.length(); ++i) tmp += Character.toUpperCase(res.charAt(i));
            String[] a = tmp.split("\\s+");
            String ans = "DC";
            for (int i = 0; i < 2; ++i) ans += a[i].charAt(0);
            System.out.println("DANH SACH SINH VIEN NGANH " + tmp + ":");
            for (SinhVien1 x : list){
                String s = x.getMsv().substring(3,7);
                if (s.equals(ans) && x.getLop().charAt(0) != 'E') System.out.println(x);
            }
        }
    }
}

//class SinhVien1{
//    private String msv, ten, lop, mail;
//
//    public SinhVien1(String msv, String ten, String lop, String mail) {
//        this.msv = msv;
//        this.ten = ten;
//        this.lop = lop;
//        this.mail = mail;
//    }
//
//    public String getMsv() {
//        return msv;
//    }
//
//    public String getLop() {
//        return lop;
//    }
//
//    @Override
//    public String toString() {
//        return this.msv + " " + this.ten + " " + this.lop + " " + this.mail;
//    }
//}