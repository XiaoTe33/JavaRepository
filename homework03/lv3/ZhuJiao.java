package homework03.lv3;

public class ZhuJiao {
    public void chaZuoYe(XueWei xueWei) {
        System.out.println("助教：检查了作业");
        if (xueWei.is_zheng_qi) {
            this.kuaXueWei();
            this.jiaoZuoYe();
        } else {
            System.out.println("助教：没整理好哦");
            xueWei.zhengLi();
            xueWei.jiaoZuoYe(this);//接口回调
        }


    }

    public void jiaoZuoYe() {
        System.out.println("助教：把作业交给了老师");

    }

    public void kuaXueWei() {
        System.out.println("助教：学委作业整理的好好，真棒");
    }
}
