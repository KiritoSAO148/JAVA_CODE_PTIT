package JAVA_PTIT;
import java.util.*;

public class J05005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList <SinhVien> list = new ArrayList<>();
        for (int i = 1; i <= n; ++i){
            String name = sc.nextLine();
            String className = sc.nextLine();
            String date = sc.nextLine();
            double gpa = Double.parseDouble(sc.nextLine());
            SinhVien x = new SinhVien (i, name, className, date, gpa);
            x.chuanHoa();
            list.add(x);
        }
        Collections.sort(list, new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien o1, SinhVien o2) {
                if (o1.getGpa() > o2.getGpa()) return -1;
                return 1;
            }
        });
        for (SinhVien x : list) System.out.println(x);
    }
}