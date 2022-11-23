package JAVA_PTIT;
import java.util.*;

public class J05010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList <Product1> list = new ArrayList<>();
        for (int i = 1; i <= n; ++i){
            String ten = sc.nextLine();
            String nhom = sc.nextLine();
            double mua = Double.parseDouble(sc.nextLine());
            double ban = Double.parseDouble(sc.nextLine());
            Product1 x = new Product1(i, ten, nhom, mua, ban);
            list.add(x);
        }
        Collections.sort(list, new Comparator<Product1>() {
            @Override
            public int compare(Product1 o1, Product1 o2) {
                if (o1.getBan() > o2.getBan()) return -1;
                return 1;
            }
        });
        for (Product1 x : list) System.out.println(x);
    }
}

class Product1{
    private int ma;
    private String ten, nhom;
    private double mua, ban;

    public Product1(int ma, String ten, String nhom, double mua, double ban) {
        this.ma = ma;
        this.ten = ten;
        this.nhom = nhom;
        this.mua = mua;
        this.ban = ban;
    }

    public double getMua() {
        return mua;
    }

    public double getBan() {
        return ban;
    }

    @Override
    public String toString() {
        return this.ma + " " + this.ten + " " + this.nhom + " " + String.format("%.2f", this.ban - this.mua);
    }
}