package JAVA_PTIT;
import java.util.*;

public class J05011 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList <Account> list = new ArrayList<>();
        for (int i = 1; i <= n; ++i){
            String ma = sc.nextLine();
            String ten = sc.nextLine();
            String vao = sc.nextLine();
            String ra = sc.nextLine();
            Account x = new Account(ma, ten, vao, ra);
            list.add(x);
        }
        Collections.sort(list, new Comparator<Account>() {
            @Override
            public int compare(Account o1, Account o2) {
                return o2.get() - o1.get();
            }
        });
        for (Account x : list) System.out.println(x);
    }
}

class Account{
    private String ma, ten, vao, ra;

    public Account(String ma, String ten, String vao, String ra) {
        this.ma = ma;
        this.ten = ten;
        this.vao = vao;
        this.ra = ra;
    }

    public int get(){
        String[] s1 = this.vao.split(":");
        String[] s2 = this.ra.split(":");
        int res1 = Integer.parseInt(s1[0]) * 60 + Integer.parseInt(s1[1]);
        int res2 = Integer.parseInt(s2[0]) * 60 + Integer.parseInt(s2[1]);
        return res2 - res1;
    }

    @Override
    public String toString() {
        int res = this.get();
        int gio = res / 60, phut = res % 60;
        return this.ma + " " + this.ten + " " + gio + " gio " + phut + " phut";
    }
}