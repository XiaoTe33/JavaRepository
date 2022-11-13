package homework02;

/*小兵类*/
public class Soldier extends Role {

    @Override
    public void died() {
        System.out.println(this.getName() + "寄了");
    }

    public Soldier(String name, int hp, int attack) {
        super(name, hp, attack);
    }

}
