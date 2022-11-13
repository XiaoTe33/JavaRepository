package homework03.lv3;

public class XueWei {
    public boolean is_zheng_qi = false;

    public void zhengLi() {
        System.out.println("学委：整理了作业");
        this.is_zheng_qi = true;
    }

    public void jiaoZuoYe(ZhuJiao zhuJiao) {
        System.out.println("学委：上交了作业");
        zhuJiao.chaZuoYe(this);//接口回调
    }
}
