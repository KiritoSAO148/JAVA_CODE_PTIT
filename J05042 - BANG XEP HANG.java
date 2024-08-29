package JAVA_PTIT;

import java.util.*;

public class J05042 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = Integer.parseInt(sc.nextLine());
        List <SinhVien4> list = new ArrayList<>();
        for (int i = 0; i < n; ++i){
            String name = sc.nextLine();
            String[] s = sc.nextLine().split(" ");
            int correct = Integer.parseInt(s[0]);
            int submit = Integer.parseInt(s[1]);
            SinhVien4 x = new SinhVien4(name, correct, submit);
            list.add(x);
        }
        Collections.sort(list, new Comparator<SinhVien4>() {
            @Override
            public int compare(SinhVien4 o1, SinhVien4 o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        Collections.sort(list, new Comparator<SinhVien4>() {
            @Override
            public int compare(SinhVien4 o1, SinhVien4 o2) {
                if (o1.getCorrect() != o2.getCorrect()) return o2.getCorrect() - o1.getCorrect();
                return o1.getSubmit() - o2.getSubmit();
            }
        });
        for (SinhVien4 x : list) System.out.println(x);
    }
}

class SinhVien4{
    private String name;
    private int correct, submit;

    public SinhVien4(String name, int correct, int submit) {
        this.name = name;
        this.correct = correct;
        this.submit = submit;
    }

    public String getName() {
        return name;
    }

    public int getCorrect() {
        return correct;
    }

    public int getSubmit() {
        return submit;
    }

    @Override
    public String toString() {
        return this.name + " " + this.correct + " " + this.submit;
    }
}