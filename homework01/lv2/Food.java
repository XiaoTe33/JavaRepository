package homework01.lv2;

import java.util.Scanner;

public class Food {
    public static void main(String[] args) {
        int[] a = new int[100];
        a[0] = 33;
        a[1] = 19;
        a[2] = 4;
        a[3] = 20;
        a[4] = 100;
        System.out.println("排序前的结果");
        int t = 0;
        while (a[t] == 0) t++;
        System.out.print(a[t]);
        for (int i = t + 1; i < 100; i++) {
            if (a[i] != 0) {
                System.out.print("," + a[i]);
            }
        }
        System.out.println();
        System.out.println("排序后的结果");
        bubbleSort(a);
//        selectSort(a);
        System.out.println();
        System.out.println("输入一个新的食物的价格");
        Scanner sc=new Scanner(System.in);
        int t2=0;
        while(a[t2]!=0)t2++;
        a[t2]=sc.nextInt();
        System.out.print("插入新食物后的价格数组为 :");
//        bubbleSort(a);
        selectSort(a);
    }

    public static void bubbleSort(int[] a) {
        int temp;
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - i - 1; j++) {
                if (a[j] < a[j + 1]) {
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }

        int t = 0;
        while (a[t] == 0) t++;
        System.out.print(a[t]);
        for (int i = t + 1; i < 100; i++) {
            if (a[i] != 0) {
                System.out.print("," + a[i]);
            }
        }
    }

    public static void selectSort(int[] a) {

        for (int i = 0; i < a.length; i++) {
            int min=0;
            for (int j = i; j < a.length; j++) {
                if(a[j]!=0){
                    if(a[j]<a[min]){
                        min=j;
                    }
                }
            }
            int temp=a[min];
            a[min]=a[i];
            a[i]=temp;
        }
        int t = 0;
        while (a[t] == 0) t++;
        System.out.print(a[t]);
        for (int i = t + 1; i < 100; i++) {
            if (a[i] != 0) {
                System.out.print("," + a[i]);
            }
        }
    }
}
