package JAVA_PTIT;
import java.util.*;

public class J05038 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = Integer.parseInt(sc.nextLine());
        List <Salary> list = new ArrayList<>();
        for (int i = 1; i <= n; ++i){
            String ten = sc.nextLine();
            int luong = Integer.parseInt(sc.nextLine());
            int ngay = Integer.parseInt(sc.nextLine());
            String chucVu = sc.nextLine();
            Salary x = new Salary(ten, luong, ngay, chucVu);
            list.add(x);
        }
        long ans = 0;
        for (int i = 0; i < n; ++i){
            String res = "NV" + String.format("%02d", i + 1);
            System.out.println(res + " " + list.get(i));
            ans += list.get(i).total();
        }
        System.out.println("Tong chi phi tien luong: " + ans);
    }
}

class Salary{
    private String ten;
    private int luong, ngay;
    private String chucVu;

    public Salary(String ten, int luong, int ngay, String chucVu) {
        this.ten = ten;
        this.luong = luong;
        this.ngay = ngay;
        this.chucVu = chucVu;
    }

    public int luongThang(){
        return this.luong * this.ngay;
    }

    public int thuong(){
        if (this.ngay >= 25) return (int) (luongThang() * 0.2);
        else if (this.ngay >= 22) return (int) (luongThang() * 0.1);
        return 0;
    }

    public int phuCap(){
        if (this.chucVu.equals("GD")) return 250000;
        if (this.chucVu.equals("PGD")) return 200000;
        if (this.chucVu.equals("TP")) return 180000;
        return 150000;
    }

    public int total(){
        return this.luongThang() + this.thuong() + this.phuCap();
    }

    @Override
    public String toString() {
        return this.ten + " " + this.luongThang() + " " + this.thuong() + " " + this.phuCap() + " " + this.total();
    }
}