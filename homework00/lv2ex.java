package homework00;

import java.util.Scanner;

public class lv2ex {
    public static void main(String[] args) {

        while (true) {
            System.out.println("请卷王输入睡觉时间：");
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
            System.out.println("是否再玩一局");
            s=sc.next();
            if(s.equals("yes")){
                System.out.println("马上准备开始下一局");
            }
            if(s.equals("no")) {
                System.out.println("又去卷了？");
                System.out.println("滚吧，你个卷王！");
                break;
            }
        }
    }
}
