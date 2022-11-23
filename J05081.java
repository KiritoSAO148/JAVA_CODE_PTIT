package JAVA_PTIT;

import java.util.*;

public class J05081 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        ArrayList <Product> list = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 1; i <= n; ++i){
            String name = sc.nextLine();
            String donVi = sc.nextLine();;
            int mua = Integer.parseInt(sc.nextLine());
            int ban = Integer.parseInt(sc.nextLine());
            Product x = new Product(i, name, donVi, mua, ban);
            list.add(x);
        }
        Collections.sort(list, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                if (o1.getLoiNhuan() != o2.getLoiNhuan()) return o2.getLoiNhuan() - o1.getLoiNhuan();
                return o1.getId().compareTo(o2.getId());
            }
        });
        for (Product x : list) System.out.println(x);
    }
}

class Product{
    private String id, name, donVi;
    private int mua, ban;

    public Product(int id, String name, String donVi, int mua, int ban) {
        this.id = "MH" + String.format("%03d", id);
        this.name = name;
        this.donVi = donVi;
        this.mua = mua;
        this.ban = ban;
    }

    public String getId() {
        return id;
    }

    public int getLoiNhuan(){
        return this.ban - this.mua;
    }

    @Override
    public String toString() {
        return this.id + " " + this.name + " " + this.donVi + " " + this.mua + " "  + this.ban + " " + this.getLoiNhuan();
    }
}
