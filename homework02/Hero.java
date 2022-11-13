package homework02;

/*英雄*/
public class Hero extends Role {

    private int defence;//比小兵多了防御力

    public Hero(String name, int hp, int attack, int defence) {
        super(name, hp, attack);
        this.defence = defence;
    }

    public int getDefence() {
        return defence;
    }

    public void setDefence(int defence) {
        this.defence = defence;
    }

    @Override
    public void died() {
        System.out.println(this.getName() + "寄了");
    }

    public void purchase(Equipment equipment) {//买东西
        System.out.println("已购买[" + equipment.getName() + "]");
        this.setHp(this.getHp() + equipment.getHpAdd());
        this.setAttack(this.getAttack() + equipment.getAttackAdd());
        this.setDefence(this.getDefence() + equipment.getDefenceAdd());
        System.out.println("当前属性：");
        System.out.println(this.toString3());
        System.out.println("还要购买什么吗(输入0退出商店)");
    }

    @Override
    public void beAttacked(Role role) {//扣血规则
        this.setHp((int) ((double) this.getHp() - (double) role.getAttack() * (200.0 / (double) (this.getDefence() + 200.0))));
    }

    public String toString3() {
        return this.getName() + "  HP:" + this.getHp() + "  攻击力:" + this.getAttack() + "  防御力:" + this.getDefence();
    }
}
