package homework00;

import java.util.Scanner;

public class lv3 {
    public static double jiecheng(double a){
        double t=1;
        for (int i = 1; i <= a; i++) {
            t*=i;
        }
        return t;
    }
    public static void main(String[] args) {
        double n,k,p;
        Scanner sc=new Scanner(System.in);
        n=sc.nextDouble();
        k=sc.nextDouble();
        p=jiecheng(n-k)*jiecheng(k)/jiecheng(n);
        System.out.println(p);


    }
}
