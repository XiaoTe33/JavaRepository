package homework00;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class lv3ex {
    public static double jiecheng(double a){
        double t=1;
        for (int i = 1; i <= a; i++) {
            t*=i;
        }
        return t;
    }
    public static void main(String[] args) {
        double n,k;
        Scanner sc=new Scanner(System.in);
        n=sc.nextDouble();
        k=sc.nextDouble();
        BigDecimal p=BigDecimal.valueOf(1.0);
        p=p.multiply(BigDecimal.valueOf(jiecheng(n-k)))
                .multiply(BigDecimal.valueOf(jiecheng(k)))
                .divide(BigDecimal.valueOf(jiecheng(n)),100, RoundingMode.HALF_UP);
        System.out.println(p.doubleValue());
    }
}
