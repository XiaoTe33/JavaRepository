package homework02;

/*超级兵*/
public class SuperSoldiers extends Soldier {
    public SuperSoldiers() {
        super("超级兵", 600, 150);
    }

    @Override
    public void died() {
        System.out.println(this.getName() + "寄了");
    }
}
