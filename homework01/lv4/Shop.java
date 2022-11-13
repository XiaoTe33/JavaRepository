package homework01.lv4;

import java.util.Collection;

public class Shop {
    //商店类的属性包括（商店的名字）⽅法包括（1.购买道具的⽅法2.欢迎功能）
    private String name;//

    public static void welcome() {
        System.out.println("购买道具，改变人生");
        System.out.println("道具列表：");
        System.out.println("序号    名字                             价格  修德  博学 求实  创新");
        System.out.println("1     《3G是怎样炼成的》                  33     1    5    5    5 ");
        System.out.println("2     《java开发实战经典》                88     1    2    5    1 ");
        System.out.println("3     《美丽新重邮》                      40     4    3    1    1 ");
        System.out.println("4     《仿生RedRocker会梦见电子廖姐姐吗》  20     1    1    0    0 ");
        System.out.println("5     《南山伯爵》                        30     0    0    0    0 ");
        System.out.println("请输入想要买的道具的序号（空格号分割）");
    }

    public static void purchase(Youzi youzi, Prop prop, Collection shopCar) {//购物与统计
        youzi.setVirtueValue(youzi.getVirtueValue() + prop.getVirtueValueAdd());
        youzi.setLearnValue(youzi.getLearnValue() + prop.getLearnValueAdd());
        youzi.setPracticeValue(youzi.getPracticeValue() + prop.getPracticeValueAdd());
        youzi.setInnovationValue(youzi.getInnovationValue() + prop.getInnovationValueAdd());
        youzi.totalPrice += prop.getPrice();
        System.out.print("你一共选择了：");
        System.out.println(shopCar);
    }
//    public static void purchase(Youzi youzi, Prop... prop) {
//        for (Prop prop1 : prop) {
//            youzi.setVirtueValue(youzi.getVirtueValue() + prop1.getVirtueValueAdd());
//            youzi.setLearnValue(youzi.getLearnValue() + prop1.getLearnValueAdd());
//            youzi.setPracticeValue(youzi.getPracticeValue() + prop1.getPracticeValueAdd());
//            youzi.setInnovationValue(youzi.getInnovationValue() + prop1.getInnovationValueAdd());
//            youzi.totalPrice += prop1.getPrice();
//        }
//
//    }
}
