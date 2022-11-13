package homework02;

/*个体类*/
public class Role {
    public Role() {
    }

    private String name;
    private int hp;
    private int attack;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public Role(String name, int hp, int attack) {
        this.name = name;
        this.hp = hp;
        this.attack = attack;
    }

    public void beAttacked(Role role) {
        this.setHp(this.getHp() - role.getAttack());
    }

    public void died() {
        System.out.println(this.getName() + "寄了");
    }

    @Override
    public String toString() {
        return this.name + "  HP:" + this.hp;
    }

    public String toString2() {
        return this.name + "  HP:" + this.hp + "  攻击力:" + this.attack;
    }
}
