package JAVA_PTIT;
import java.util.*;

public class J05009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList <ThiSinh> list = new ArrayList<>();
        double res = Double.MIN_VALUE;
        for (int i = 1; i <= n; ++i){
            String name = sc.nextLine();
            String date = sc.nextLine();
            Double d1 = Double.parseDouble(sc.nextLine());
            Double d2 = Double.parseDouble(sc.nextLine());
            Double d3 = Double.parseDouble(sc.nextLine());
            ThiSinh x = new ThiSinh(i, name, date, d1, d2, d3);
            res = Math.max(res, x.get());
            list.add(x);
        }
        for (ThiSinh x : list){
            if (x.get() == res) System.out.println(x);
        }
    }
}

class ThiSinh{
    private int id;
    private String name, date;
    private double d1, d2, d3;

    public ThiSinh(int id, String name, String date, double d1, double d2, double d3) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.d1 = d1;
        this.d2 = d2;
        this.d3 = d3;
    }

    public double get(){
        return this.d1 + this.d2 + this.d3;
    }

    @Override
    public String toString() {
        return this.id + " " + this.name + " " + this.date + " " + this.get();
    }
}