package homework03.lv2;

public class ZhuJiao extends People implements ShouZuoYe, JiaoZuoYe {
    public ZhuJiao(String name) {
        super(name);
    }

    @Override
    public void jiao(ShouZuoYe shouZuoYe) {
        System.out.println("助教：把作业交给了老师");
        shouZuoYe.cha();
    }

    @Override
    public void cha() {
        System.out.println(this.name + "：查了作业");
    }

    public void punish(XueWei xueWei) {
        System.out.println("助教：没收齐啊再查一遍");
        xueWei.cha();
    }

    public void praise() {
        System.out.println("助教：作业收起了，学委干得不错");

    }
}
