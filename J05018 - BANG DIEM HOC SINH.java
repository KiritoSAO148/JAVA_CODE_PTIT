package JAVA_PTIT;
import java.util.*;

public class J05018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList <HocSinh> list = new ArrayList<>();
        for (int i = 1; i <= n; ++i){
            String ten = sc.nextLine();
            String s = sc.nextLine();
            String[] res = s.split("\\s+");
            double d1 = Double.parseDouble(res[0]);
            double d2 = Double.parseDouble(res[1]);
            double d3 = Double.parseDouble(res[2]);
            double d4 = Double.parseDouble(res[3]);
            double d5 = Double.parseDouble(res[4]);
            double d6 = Double.parseDouble(res[5]);
            double d7 = Double.parseDouble(res[6]);
            double d8 = Double.parseDouble(res[7]);
            double d9 = Double.parseDouble(res[8]);
            double d10 = Double.parseDouble(res[9]);
            HocSinh x = new HocSinh(i, ten, d1, d2, d3, d4, d5, d6, d7, d8, d9, d10);
            list.add(x);
        }
        Collections.sort(list, new Comparator<HocSinh>() {
            @Override
            public int compare(HocSinh o1, HocSinh o2) {
                if (o1.get() == o2.get()) return o1.getMa().compareTo(o2.getMa());
                if (o1.get() > o2.get()) return -1;
                return 1;
            }
        });
        for (HocSinh x : list) System.out.println(x);
    }
}

class HocSinh{
    private String ma, ten;
    private double d1, d2, d3, d4, d5, d6, d7, d8, d9, d10;

    public HocSinh(int ma, String ten, double d1, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9, double d10) {
        this.ma = "HS" + String.format("%02d", ma);
        this.ten = ten;
        this.d1 = d1;
        this.d2 = d2;
        this.d3 = d3;
        this.d4 = d4;
        this.d5 = d5;
        this.d6 = d6;
        this.d7 = d7;
        this.d8 = d8;
        this.d9 = d9;
        this.d10 = d10;
    }

    public String getMa() {
        return ma;
    }

    public double get (){
        double res = (this.d1 * 2 + this.d2 * 2 + this.d3 + this.d4 + this.d5 + this.d6 + this.d7 + this.d8 + this.d9 + this.d10) / 12;
        return Math.round(res * 10.0) / 10.0;
    }

    @Override
    public String toString() {
        double res = this.get();
        String ans = "";
        if (res >= 9.0) ans = "XUAT SAC";
        else if (res >= 8.0 && res <= 8.9) ans = "GIOI";
        else if (res >= 7.0 && res <= 7.9) ans = "KHA";
        else if (res >= 5.0 && res <= 6.9) ans = "TB";
        else ans = "YEU";
        return this.ma + " " + this.ten + " " + String.format("%.1f", res) + " " + ans;
    }
}