package homework03.lv2c;

public class XueWei implements JiaoZuoYe,ShouZuoYe{

    public static int t=0;
    public String name="学委";
    public static boolean is_true=false;
    @Override
    public void jiao(ShouZuoYe shouZuoYe) {
        System.out.println("学委上交了作业");
        shouZuoYe.cha();
    }

    @Override
    public void cha() {
        System.out.println("学委数了作业");
        if(t==10) {
            is_true = true;
        }
    }
}
