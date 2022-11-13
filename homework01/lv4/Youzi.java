package homework01.lv4;

public class Youzi {
    //邮⼦类属性包括（邮⼦的名字，修德值，博学值，求实值，创新值）

    public Youzi() {
    }

    public Youzi(String name, int virtueValue, int learnValue, int practiceValue, int innovationValue) {
        this.name = name;
        this.virtueValue = virtueValue;
        this.learnValue = learnValue;
        this.practiceValue = practiceValue;
        this.innovationValue = innovationValue;
        this.totalPrice=0;
    }

    private String name;//邮⼦的名字
    private int virtueValue;//修德值
    private int learnValue;//博学值
    private int practiceValue;//求实值
    private int innovationValue;//创新值
    public int totalPrice;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVirtueValue() {
        return virtueValue;
    }

    public void setVirtueValue(int virtueValue) {
        this.virtueValue = virtueValue;
    }

    public int getLearnValue() {
        return learnValue;
    }

    public void setLearnValue(int learnValue) {
        this.learnValue = learnValue;
    }

    public int getPracticeValue() {
        return practiceValue;
    }

    public void setPracticeValue(int practiceValue) {
        this.practiceValue = practiceValue;
    }

    public int getInnovationValue() {
        return innovationValue;
    }

    public void setInnovationValue(int innovationValue) {
        this.innovationValue = innovationValue;
    }
}
