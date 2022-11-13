package homework01.lv3;

import java.util.Random;
import java.util.Scanner;

public class Card {
    public static void main(String[] args) {
        String[][] pool = {{"超级稀有"},
                {"稀有", "稀有", "稀有", "稀有"},
                {"普通", "普通", "普通", "普通", "普通", "普通", "普通"}};//奖池设定
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入抽卡次数：");
        int times = sc.nextInt();//输入抽卡次数
        int sum = 0;
        int last = 0;//保底幸运值记录

        for (int i = 0; i < pool.length; i++) {
            sum += pool[i].length;
        }//统计卡池容量
        for (int j = 0; j < times; j++) {
            int result;
            if (last < 11/*设置保底*/) {
                result = new Random().nextInt(sum-1)+1;//抽一张卡
                last++;
            } else {//保底
                last = 0;
                result = 1;
                System.out.print("(保底)");
            }

            int t = 0;
            for (int i = 0; i < pool.length; i++) {
                for (int i1 = 0; i1 < pool[i].length; i1++) {
                    t++;
                    if (t == result) {
                        System.out.println("第"+j+"张"+" ["+pool[i][i1]+"]");
                        if (pool[0][0].equals(pool[i][i1])) {
                            last = 0;
                        }//抽中则保底幸运值清空
                        break;
                    }

                }
                if (t == result) {
                    break;
                }
            }
//            System.out.println(last);//调试日志
//            System.out.println(result);//调试日志
        }//开始抽卡
        System.out.println("奖池中抽到各种卡的概率如下：");
        for (int i = 0; i < pool.length; i++) {
            double percent = (double) ((int) ((pool[i].length / (double) sum) * 1000)) / 10;
            System.out.println("\"" + pool[i][0] + "\"" + percent + "%");
        }//计算奖池各卡抽中概率
    }

}
