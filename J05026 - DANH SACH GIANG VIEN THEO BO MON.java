package JAVA_PTIT;
import java.util.*;

public class J05026 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList <GiangVien> list = new ArrayList<>();
        for (int i = 1; i <= n; ++i){
            String ten = sc.nextLine();
            String mon = sc.nextLine();
            GiangVien x = new GiangVien(i, ten, mon);
            list.add(x);
        }
        int q = Integer.parseInt(sc.nextLine());
        while (q-- > 0){
            String res = sc.nextLine();
            String ans = "";
            String[] a = res.split("\\s+");
            for (int i = 0; i < a.length; ++i) ans += Character.toUpperCase(a[i].charAt(0));
            System.out.println("DANH SACH GIANG VIEN BO MON " + ans + ":");
            for (GiangVien x : list){
                if (x.getMon().equalsIgnoreCase(res)) System.out.println(x + ans);
            }
        }
    }
}

//class GiangVien{
//    private String ma, ten, mon;
//
//    public GiangVien(int ma, String ten, String mon) {
//        this.ma = "GV" + String.format("%02d", ma);
//        this.ten = ten;
//        this.mon = mon;
//    }
//
//    public String getMa() {
//        return ma;
//    }
//
//    public String getTen() {
//        return ten;
//    }
//
//    public String getMon() {
//        return mon;
//    }
//
//    public void chuanHoa(){
//        String res = "";
//        String[] s = this.ten.split("\\s+");
//        for (int i = 0; i < s.length; ++i){
//            String tmp = "";
//            for (int j = 0; j < s[i].length(); ++j){
//                if (j == 0) tmp += Character.toUpperCase(s[i].charAt(j));
//                else tmp += Character.toLowerCase(s[i].charAt(j));
//            }
//            res += tmp + " ";
//        }
//        this.ten = res.substring(0, res.length() - 1);
//    }
//
//    @Override
//    public String toString() {
//        //String res = "";
//        //String[] s = this.mon.split("\\s+");
//        //for (int i = 0; i < s.length; ++i) res += Character.toUpperCase(s[i].charAt(0));
//        return this.ma + " " + this.ten + " ";
//    }
//}