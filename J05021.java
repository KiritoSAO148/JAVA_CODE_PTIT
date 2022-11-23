package JAVA_PTIT;
import java.util.*;

public class J05021 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        ArrayList<SinhVien1> list = new ArrayList<>();
        ArrayList <String> res = new ArrayList<>();
        int n = 1;
        while (sc.hasNext()){
            String s = sc.nextLine();
            res.add(s);
            if (n % 4 == 0){
                String msv = res.get(0), ten = res.get(1), lop = res.get(2), mail = res.get(3);
                res.clear();
                SinhVien1 x = new SinhVien1(msv, ten, lop, mail);
                list.add(x);
            }
            ++n;
        }
        Collections.sort(list, new Comparator<SinhVien1>() {
            @Override
            public int compare(SinhVien1 o1, SinhVien1 o2) {
                return o1.getMsv().compareTo(o2.getMsv());
            }
        });
        for (SinhVien1 x : list) System.out.println(x);
    }
}