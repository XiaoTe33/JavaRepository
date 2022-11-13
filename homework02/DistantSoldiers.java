package homework02;

/*远程小兵*/
public class DistantSoldiers extends Soldier {
    public DistantSoldiers() {
        super("远程小兵", 300, 80);
    }

    @Override
    public void died() {
        System.out.println(this.getName() + "寄了");
    }
}
