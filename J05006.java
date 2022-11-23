package JAVA_PTIT;
import java.util.*;

public class J05006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList <NhanVien> list = new ArrayList<>();
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
        for (NhanVien x : list) System.out.println(x);
    }
}

class NhanVien{
    private String id, name, gioiTinh, date, dc, mst, hd;

    public NhanVien(int id, String name, String gioiTinh, String date, String dc, String mst, String hd) {
        this.id = String.format("%05d", id);
        this.name = name;
        this.gioiTinh = gioiTinh;
        this.date = date;
        this.dc = dc;
        this.mst = mst;
        this.hd = hd;
    }

    public String getDate() {
        return date;
    }

    @Override
    public String toString() {
        return this.id + " " + this.name + " " + this.gioiTinh + " " + this.date + " " + this.dc + " " + this.mst + " " + this.hd;
    }
}