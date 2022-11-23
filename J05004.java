package JAVA_PTIT;
import java.util.*;

public class J05004 {
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