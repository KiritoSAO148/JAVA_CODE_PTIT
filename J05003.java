package JAVA_PTIT;
import java.util.*;

public class J05003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList <SinhVien> list = new ArrayList<>();
        for (int i = 1; i <= n; ++i){
            String name = sc.nextLine();
            String className = sc.nextLine();
            String date = sc.nextLine();
            double gpa = Double.parseDouble(sc.nextLine());
            SinhVien x = new SinhVien(i, name, className, date, gpa);
            x.chuanHoa();
            list.add(x);
        }
        for (SinhVien x : list) System.out.println(x);
    }
}

class SinhVien{
    private String id, name, className, date;
    private double gpa;

    public SinhVien(int id, String name, String className, String date, double gpa) {
        this.id = "B20DCCN" + String.format("%03d", id);
        this.name = name;
        this.className = className;
        this.date = date;
        this.gpa = gpa;
    }

    public double getGpa() {
        return gpa;
    }

    public void chuanHoa(){
        StringBuilder sb = new StringBuilder(this.date);
        if (sb.charAt(1) == '/') sb.insert(0, "0");
        if (sb.charAt(4) == '/') sb.insert(3,"0");
        this.date = sb.toString();
        String[] s = this.name.split("\\s+");
        String res = "";
        for (int i = 0; i < s.length; ++i){
            String tmp = "";
            for (int j = 0; j < s[i].length(); ++j){
                if (j == 0) tmp += Character.toUpperCase(s[i].charAt(j));
                else tmp += Character.toLowerCase(s[i].charAt(j));
            }
            res += tmp + " ";
        }
        res = res.substring(0, res.length() - 1);
        this.name = res;
    }

    @Override
    public String toString() {
        return this.id + " " + this.name + " " + this.className + " " + this.date + " " + String.format("%.2f", this.gpa);
    }
}