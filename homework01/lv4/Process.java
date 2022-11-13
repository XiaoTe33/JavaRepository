package homework01.lv4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class Process {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Prop[] props = new Prop[5];
        props[0] = new Prop("《3G是怎样炼成的》", 33, 1, 5, 5, 5);
        props[1] = new Prop("《java开发实战经典》", 88, 1, 2, 5, 1);
        props[2] = new Prop("《美丽新重邮》", 40, 4, 3, 1, 1);
        props[3] = new Prop("《仿生RedRocker会梦见电子廖姐姐吗》", 20, 1, 1, 0, 0);
        props[4] = new Prop("《南山伯爵》", 30, 0, 0, 0, 0);
        Shop.welcome();//显示道具栏
        Youzi youzi = new Youzi("LLY", 0, 0, 0, 0);
        Collection shopCar = new ArrayList<Prop>();//创建购物车
        boolean t = true;
        while (t) {
            switch (sc.nextInt()) {
                case 1:
                    shopCar.add(props[0]);
                    Shop.purchase(youzi, props[0],shopCar);
                    break;
                case 2:
                    shopCar.add(props[1]);
                    Shop.purchase(youzi, props[1],shopCar);
                    break;
                case 3:
                    shopCar.add(props[2]);
                    Shop.purchase(youzi, props[2],shopCar);
                    break;
                case 4:
                    shopCar.add(props[3]);
                    Shop.purchase(youzi, props[3],shopCar);
                    break;
                case 5:
                    shopCar.add(props[4]);
                    Shop.purchase(youzi, props[4],shopCar);
                    break;
                case 0:
                    t = false;
                    break;
            }
            if (t) System.out.println("还有想要买的吗?");
            if (!t) {
                System.out.println("总计："+youzi.totalPrice);
                System.out.println("小邮子的属性提高了  "+
                        "  修德 "+youzi.getVirtueValue()+
                        "  博学 "+youzi.getLearnValue()+
                        "  求实 "+youzi.getPracticeValue() +
                        "  创新 "+youzi.getInnovationValue());
            }

        }//买东西

    }
}
