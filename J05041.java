package JAVA_PTIT;
import java.util.*;

public class J05041 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = Integer.parseInt(sc.nextLine());
        List <Salary1> list = new ArrayList<>();
        for (int i = 1; i <= n; ++i){
            String ten = sc.nextLine();
            long luong = Long.parseLong(sc.nextLine());
            long ngay = Long.parseLong(sc.nextLine());
            String chucVu = sc.nextLine();
            Salary1 x = new Salary1(i, ten, luong, ngay, chucVu);
            list.add(x);
        }
        Collections.sort(list, new Comparator<Salary1>() {
            @Override
            public int compare(Salary1 o1, Salary1 o2) {
                if (o1.total() > o2.total()) return -1;
                return 1;
            }
        });
        for (Salary1 x : list) System.out.println(x);
    }
}

class Salary1{
    private String ten;
    private long luong, ngay;
    private String chucVu;
    private String ma;

    public Salary1(int id, String ten, long luong, long ngay, String chucVu) {
        this.ma = "NV" + String.format("%02d", id);
        this.ten = ten;
        this.luong = luong;
        this.ngay = ngay;
        this.chucVu = chucVu;
    }

    public long luongThang(){
        return this.luong * this.ngay;
    }

    public long thuong(){
        if (this.ngay >= 25) return (long) (luongThang() * 0.2);
        if (this.ngay >= 22) return (long) (luongThang() * 0.1);
        return 0;
    }

    public long phuCap(){
        if (this.chucVu.equals("GD")) return 250000;
        if (this.chucVu.equals("PGD")) return 200000;
        if (this.chucVu.equals("TP")) return 180000;
        return 150000;
    }

    public long total(){
        return this.luongThang() + this.thuong() + this.phuCap();
    }

    @Override
    public String toString() {
        return this.ma + " " + this.ten + " " + this.luongThang() + " " + this.thuong() + " " + this.phuCap() + " " + this.total();
    }
}