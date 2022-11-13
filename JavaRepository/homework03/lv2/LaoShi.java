package homework03.lv2c;

public class LaoShi extends People implements ShouZuoYe {
    public LaoShi(String name) {
        super(name);
    }

    @Override
    public void cha() {
        System.out.println("老师：检查了作业");

    }
}
