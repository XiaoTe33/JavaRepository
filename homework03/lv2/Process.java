package homework03.lv2;

import java.util.Random;

public class Process {
    public static void main(String[] args) {
        XueWei xueWei = new XueWei();
        ZhuJiao zhuJiao = new ZhuJiao("助教");
        LaoShi laoShi = new LaoShi("老师");
        XueSheng[] xueShengs = {
                new XueSheng("1"),
                new XueSheng("2"),
                new XueSheng("3"),
                new XueSheng("4"),
                new XueSheng("5"),
                new XueSheng("6"),
                new XueSheng("7"),
                new XueSheng("8"),
                new XueSheng("9"),
                new XueSheng("10")
        };
        for (XueSheng xueSheng : xueShengs) {
            xueSheng.xie();
            XueWei.t++;
            xueSheng.jiao(xueWei);
            int a = new Random().nextInt(30);
            if ((XueWei.is_true && a < 27) || (!XueWei.is_true && a > 27)) {
                //概率出错
                System.out.println(xueWei.name + "：收齐了");
                xueWei.jiao(zhuJiao);
                if (!XueWei.is_true) {
                    zhuJiao.punish(xueWei);
                } else {
                    zhuJiao.praise();
                    zhuJiao.jiao(laoShi);
                    break;
                }

            }
        }


    }


}
