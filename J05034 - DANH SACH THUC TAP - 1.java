package JAVA_PTIT;
import java.util.*;

public class J05034 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList <SinhVien3> list = new ArrayList<>();
        for (int i = 1; i <= n; ++i){
            String ma = sc.nextLine();
            String ten = sc.nextLine();
            String lop = sc.nextLine();
            String mail = sc.nextLine();
            String dn = sc.nextLine();
            SinhVien3 x = new SinhVien3(i, ma, ten, lop, mail, dn);
            list.add(x);
        }
        Collections.sort(list);
        int q = Integer.parseInt(sc.nextLine());
        while (q-- > 0){
            String res = sc.nextLine();
            for (SinhVien3 x : list){
                if (x.getDn().equals(res)) System.out.println(x);
            }
        }
    }
}

//6
//B17DCCN016
//Le Khac Tuan Anh
//D17HTTT2
//test1@stu.ptit.edu.vn
//VIETTEL
//B17DCCN107
//Dao Thanh Dat
//D17CNPM5
//test2@stu.ptit.edu.vn
//FPT
//B17DCAT092
//Cao Danh Huy
//D17CQAT04-B
//test3@stu.ptit.edu.vn
//FPT
//B17DCCN388
//Cao Sy Hai Long
//D17CNPM2
//test4@stu.ptit.edu.vn
//VNPT
//B17DCCN461
//Dinh Quang Nghia
//D17CNPM2
//test5@stu.ptit.edu.vn
//FPT
//B17DCCN554
//Bui Xuan Thai
//D17CNPM1
//test6@stu.ptit.edu.vn
//GAMELOFT
//1
//FPT

class SinhVien3 implements Comparable <SinhVien3>{
    private int stt;
    private String ma, ten, lop, mail, dn;

    public SinhVien3(int stt, String ma, String ten, String lop, String mail, String dn) {
        this.stt = stt;
        this.ma = ma;
        this.ten = ten;
        this.lop = lop;
        this.mail = mail;
        this.dn = dn;
    }

    public String getDn() {
        return dn;
    }

    @Override
    public String toString() {
        return this.stt + " " + this.ma + " " + this.ten + " " + this.lop + " " + this.mail + " " + this.dn;
    }

    @Override
    public int compareTo(SinhVien3 o) {
        return this.ten.compareTo(o.ten);
    }
}