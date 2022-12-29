package JAVA_PTIT;

import java.util.*;

public class J05043 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = Integer.parseInt(sc.nextLine());
        List <NhanVien1> list = new ArrayList<>();
        for (int i = 0; i < n; ++i){
            String name = sc.nextLine();
            String work = sc.nextLine();
            int sal = Integer.parseInt(sc.nextLine());
            int day = Integer.parseInt(sc.nextLine());
            NhanVien1 x = new NhanVien1(i + 1, name, work, sal, day);
            list.add(x);
        }
        for (NhanVien1 x : list) System.out.println(x);
    }
}

class NhanVien1{
    private String id;
    private String name;
    private String work;
    private int sal;
    private int day;

    public NhanVien1(int id, String name, String work, int sal, int day) {
        this.id = "NV" + String.format("%02d", id);
        this.name = name;
        this.work = work;
        this.sal = sal;
        this.day = day;
    }

    public int phuCap(){
        if (this.work.equals("GD")) return 500;
        if (this.work.equals("PGD")) return 400;
        if (this.work.equals("TP")) return 300;
        if (this.work.equals("KT")) return 250;
        return 100;
    }

    public int luongChinh(){
        return this.sal * this.day;
    }

    public int tamUng(){
        if ((this.phuCap() + this.luongChinh()) * 2.0 / 3 < 25000) return (int)Math.round(((double) this.phuCap() + (double) this.luongChinh()) * 2.0 / 3000) * 1000;
        return 25000;
    }

    @Override
    public String toString() {
        return this.id + " " + this.name + " " + this.phuCap() + " " + this.luongChinh() + " " + this.tamUng() + " " + (this.luongChinh() - this.tamUng() + this.phuCap());
    }
}