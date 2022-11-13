package homework01.lv4;

public class Prop {
    //道具类的属性包括（1.道具名字 2.价格 3.修德加成 4博学加成 5求实加成6创新加成）

    public Prop() {
    }

    public Prop(String name, int price, int virtueValueAdd, int learnValueAdd, int practiceValueAdd, int innovationValueAdd) {
        this.name = name;
        this.price = price;
        this.virtueValueAdd = virtueValueAdd;
        this.learnValueAdd = learnValueAdd;
        this.practiceValueAdd = practiceValueAdd;
        this.innovationValueAdd = innovationValueAdd;
    }

    private String name;//道具名字
    private int price;//道具价格
    private int virtueValueAdd;//修德值加成
    private int learnValueAdd;//博学值加成
    private int practiceValueAdd;//求实值加成
    private int innovationValueAdd;//创新值加成

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getVirtueValueAdd() {
        return virtueValueAdd;
    }

    public void setVirtueValueAdd(int virtueValueAdd) {
        this.virtueValueAdd = virtueValueAdd;
    }

    public int getLearnValueAdd() {
        return learnValueAdd;
    }

    public void setLearnValueAdd(int learnValueAdd) {
        this.learnValueAdd = learnValueAdd;
    }

    public int getPracticeValueAdd() {
        return practiceValueAdd;
    }

    public void setPracticeValueAdd(int practiceValueAdd) {
        this.practiceValueAdd = practiceValueAdd;
    }

    public int getInnovationValueAdd() {
        return innovationValueAdd;
    }

    public void setInnovationValueAdd(int innovationValueAdd) {
        this.innovationValueAdd = innovationValueAdd;
    }

    @Override
    public String toString() {
        return this.getName();
    }
}
