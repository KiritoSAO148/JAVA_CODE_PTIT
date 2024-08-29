package JAVA_PTIT;
import java.util.*;

public class J05025 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList <GiangVien> list = new ArrayList<>();
        for (int i = 1; i <= n; ++i){
            String ten = sc.nextLine();
            String mon = sc.nextLine();
            GiangVien x = new GiangVien(i, ten, mon);
            x.chuanHoa();
            list.add(x);
        }
        Collections.sort(list, new Comparator<GiangVien>() {
            @Override
            public int compare(GiangVien o1, GiangVien o2) {
                String[] s1 = o1.getTen().split("\\s+");
                String[] s2 = o2.getTen().split("\\s+");
                if (s1[s1.length - 1].equals(s2[s2.length - 1])) return o1.getMa().compareTo(o2.getMa());
                return s1[s1.length - 1].compareTo(s2[s2.length - 1]);
            }
        });
        for (GiangVien x : list) System.out.println(x);
    }
}

class GiangVien{
    private String ma, ten, mon;

    public GiangVien(int ma, String ten, String mon) {
        this.ma = "GV" + String.format("%02d", ma);
        this.ten = ten;
        this.mon = mon;
    }

    public String getMa() {
        return ma;
    }

    public String getTen() {
        return ten;
    }

    public String getMon() {
        return mon;
    }

    public void chuanHoa(){
        String res = "";
        String[] s = this.ten.split("\\s+");
        for (int i = 0; i < s.length; ++i){
            String tmp = "";
            for (int j = 0; j < s[i].length(); ++j){
                if (j == 0) tmp += Character.toUpperCase(s[i].charAt(j));
                else tmp += Character.toLowerCase(s[i].charAt(j));
            }
            res += tmp + " ";
        }
        this.ten = res.substring(0, res.length() - 1);
    }

    @Override
    public String toString() {
        String res = "";
        String[] s = this.mon.split("\\s+");
        for (int i = 0; i < s.length; ++i) res += Character.toUpperCase(s[i].charAt(0));
        return this.ma + " " + this.ten + " " + res;
    }
}