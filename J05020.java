package JAVA_PTIT;
import java.util.*;

public class J05020 {
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
        Collections.sort(list, new Comparator<SinhVien1>() {
            @Override
            public int compare(SinhVien1 o1, SinhVien1 o2) {
                if (o1.getLop().equals(o2.getLop())) return o1.getMsv().compareTo(o2.getMsv());
                return o1.getLop().compareTo(o2.getLop());
            }
        });
        for (SinhVien1 x : list) System.out.println(x);
    }
}

class SinhVien1{
    private String msv, ten, lop, mail;

    public SinhVien1(String msv, String ten, String lop, String mail) {
        this.msv = msv;
        this.ten = ten;
        this.lop = lop;
        this.mail = mail;
    }

    public String getMsv() {
        return msv;
    }

    public String getLop() {
        return lop;
    }

    @Override
    public String toString() {
        return this.msv + " " + this.ten + " " + this.lop + " " + this.mail;
    }
}