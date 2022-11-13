package homework02;

/*炮车*/
public class GunCarriage extends Soldier {
    public GunCarriage() {
        super("炮车", 500, 130);
    }

    @Override
    public void died() {
        System.out.println(this.getName() + "寄了");
    }
}
