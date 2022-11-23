package JAVA_PTIT;
import java.util.*;

public class J05032 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList <Person> list = new ArrayList<>();
        for (int i = 1; i <= n; ++i){
            String s = sc.nextLine();
            int idx = 0;
            for (int j = 0; j < s.length(); ++j){
                if (Character.isDigit(s.charAt(j))){
                    idx = j;
                    break;
                }
            }
            String date = s.substring(idx), name = s.substring(0, idx - 1);
            Person x = new Person(name, date);
            list.add(x);
        }
        Collections.sort(list);
        System.out.println(list.get(0));
        System.out.println(list.get(list.size() - 1));
    }
}

//5
//Nam 01/10/1991
// An 30/12/1990
//Binh 15/08/1993
//Tam 18/09/1990
//Truong 20/09/1990

class Person implements Comparable <Person>{
    private String name, date;

    public Person(String name, String date) {
        this.name = name;
        this.date = date;
    }

    @Override
    public String toString() {
        return this.name;
    }

    @Override
    public int compareTo(Person o) {
        String[] s1 = this.date.split("/");
        String[] s2 = o.date.split("/");
        String res1 = s1[2] + s1[1] + s1[0];
        String res2 = s2[2] + s2[1] + s2[0];
        return res2.compareTo(res1);
    }
}