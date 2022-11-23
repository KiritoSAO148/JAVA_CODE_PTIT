package JAVA_PTIT;
import java.util.*;

public class J05037 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList <Product3> list = new ArrayList<>();
        for (int i = 1; i <= n; ++i){
            String ten = sc.nextLine();
            String donVi = sc.nextLine();
            long donGia = Long.parseLong(sc.nextLine());
            long soLuong = Long.parseLong(sc.nextLine());
            Product3 x = new Product3(i, ten, donVi, donGia, soLuong);
            list.add(x);
        }
        Collections.sort(list, new Comparator<Product3>() {
            @Override
            public int compare(Product3 o1, Product3 o2) {
                if (o2.giaBan() < o1.giaBan()) return -1;
                return 1;
            }
        });
        for (Product3 x : list) System.out.println(x);
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

class Product3{
    private String ma, ten, donVi;
    private long donGia, soLuong;

    public Product3(int ma, String ten, String donVi, long donGia, long soLuong) {
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
        return ((this.donGia * this.soLuong) + phiVanChuyen());
    }

    public long giaBan(){
        return (long) ((Math.ceil((this.thanhTien() + (long)this.thanhTien() * 0.02) / this.soLuong) + 99) / 100 ) * 100;
    }

    @Override
    public String toString() {
        return this.ma + " " + this.ten + " " + this.donVi + " " +this.phiVanChuyen() + " " + this.thanhTien() + " " +this.giaBan();
    }
}