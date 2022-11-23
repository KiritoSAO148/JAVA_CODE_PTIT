package JAVA_PTIT;
import java.util.*;

public class J04018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt(), d = sc.nextInt();
            complex x = new complex(a,b);
            complex y = new complex(c,d);
            complex res1 = x.mul(y);
            complex res2 = x.pow(y);
            System.out.print(res1 + ", " +  res2);
            System.out.println();
        }
    }
}

class complex{
    int thuc, ao;

    public complex() {
    }

    public complex(int thuc, int ao) {
        this.ao = ao;
        this.thuc = thuc;
    }

    public complex mul (complex other){
        int a = this.thuc * this.thuc - this.ao * this.ao - this.ao * other.ao + this.thuc * other.thuc;
        int b = 2 * this.thuc * this.ao + this.thuc * other.ao + other.thuc * this.ao;
        complex res = new complex(a,b);
        return res;
    }

    public complex pow (complex other){
        int a = (this.thuc + other.thuc) * (this.thuc + other.thuc) - (this.ao + other.ao) * (this.ao + other.ao);
        int b = 2 * (this.thuc + other.thuc) * (this.ao + other.ao);
        complex res = new complex(a,b);
        return res;
    }

    @Override
    public String toString() {
        String res = "";
        if (this.ao < 0) return this.thuc + " - " + Math.abs(this.ao) + 'i';
        if (this.ao == 0) return this.thuc + "";
        return this.thuc + " + " + this.ao + "i";
    }
}