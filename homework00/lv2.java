package homework00;

import java.util.Scanner;

public class lv2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sum = 0;
        double average;
        String s;
        int[] arr = new int[7];
        for (int i = 0; i < 7; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < 7; i++) {
            sum += arr[i];
        }
        average = sum / 7;
        if(average<=10){
            System.out.println("你怎么睡的着的");
        }
        else if(average>10){

            System.out.println("熬夜有害身体，差不多得了");
        }
    }
}
