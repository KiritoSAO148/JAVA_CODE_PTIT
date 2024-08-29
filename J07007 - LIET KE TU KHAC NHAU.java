package JAVA_PTIT;

import java.io.File;
import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class J07007 {
    public static void main(String[] args) throws IOException {
        WordSet ws = new WordSet("VANBAN.in");
        System.out.println(ws);
    }
}

class WordSet {
    private TreeSet <String> set;

    public WordSet (String s) throws IOException{
        set = new TreeSet<>();
        File file = new File(s);
        Scanner sc = new Scanner(file);
        while (sc.hasNext()) set.add(sc.next().toLowerCase());
    }

    @Override
    public String toString() {
        String res = "";
        for (String x : this.set) res += x + '\n';
        return res;
    }
}
