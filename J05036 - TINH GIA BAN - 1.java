package JAVA_PTIT;
import java.util.*;

public class J05036 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList <Product2> list = new ArrayList<>();
        for (int i = 1; i <= n; ++i){
            String ten = sc.nextLine();
            String donVi = sc.nextLine();
            long donGia = Long.parseLong(sc.nextLine());
            long soLuong = Long.parseLong(sc.nextLine());
            Product2 x = new Product2(i, ten, donVi, donGia, soLuong);
            list.add(x);
        }
        for (Product2 x : list) System.out.println(x);
    }
}

//4
//DUONG
//KG
//7500
//150
//TRUNG
//CHUC
//10000
//225
//GAO
//KG
//14000
//118
//SUA
//HOP
//48000
//430

class Product2{
    private String ma, ten, donVi;
    private long donGia, soLuong;

    public Product2(int ma, String ten, String donVi, long donGia, long soLuong) {
        this.ma = "MH" + String.format("%02d", ma);
        this.ten = ten;
        this.donVi = donVi;
        this.donGia = donGia;
        this.soLuong = soLuong;
    }

    public long phiVanChuyen(){
        return Math.round((this.donGia * this.soLuong) * 0.05);
    }

    public long thanhTien(){
        return Math.round((this.donGia * this.soLuong) + phiVanChuyen());
    }

    public long giaBan(){
        return Math.round(thanhTien() + (0.02 * thanhTien()));
    }

    @Override
    public String toString() {
        return this.ma + " " + this.ten + " " + this.donVi + " " + (long) this.phiVanChuyen() + " " + (long) this.thanhTien() + " " + (long) this.giaBan();
    }
}