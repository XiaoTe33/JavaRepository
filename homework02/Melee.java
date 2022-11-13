package homework02;

/*近战小兵*/
public class Melee extends Soldier {
    public Melee() {
        super("近战小兵", 200, 100);
    }

    @Override
    public void died() {
        System.out.println(this.getName() + "寄了");
    }
}
