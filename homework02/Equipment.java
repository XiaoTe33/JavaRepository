package homework02;

/*装备类*/
public class Equipment {
    private String name;
    private int hpAdd;
    private int attackAdd;
    private int defenceAdd;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHpAdd() {
        return hpAdd;
    }

    public void setHpAdd(int hpAdd) {
        this.hpAdd = hpAdd;
    }

    public int getAttackAdd() {
        return attackAdd;
    }

    public void setAttackAdd(int attackAdd) {
        this.attackAdd = attackAdd;
    }

    public int getDefenceAdd() {
        return defenceAdd;
    }

    public void setDefenceAdd(int defenceAdd) {
        this.defenceAdd = defenceAdd;
    }

    public Equipment(String name, int hpAdd, int attackAdd, int defenceAdd) {
        this.name = name;
        this.hpAdd = hpAdd;
        this.attackAdd = attackAdd;
        this.defenceAdd = defenceAdd;
    }

    @Override
    public String toString() {
        return "{" +
                "装备名称:'" + name + '\'' +
                ", 生命值+" + hpAdd +
                ", 攻击力+" + attackAdd +
                ", 防御力+" + defenceAdd +
                '}';
    }
}
