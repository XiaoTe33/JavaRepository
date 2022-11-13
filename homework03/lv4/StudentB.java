package homework03.lv4;

public class StudentB extends Student {
    public StudentB(String name, int score) {
        super(name, score);
    }

    @Override
    public void beRemarked() {
        if (this.score < Student.line) this.beRemark(() -> System.out.println(this.name + "这位同学要被叫到办公室"));
        if (this.score <= 100 && this.score >= 80) this.beRemark(() -> System.out.println(this.name + "表现得A+"));
        if (this.score < 80 && this.score >= 70) this.beRemark(() -> System.out.println(this.name + "表现得A"));
        if (this.score < 70 && this.score >= 60) this.beRemark(() -> System.out.println(this.name + "表现得B"));
    }

    public void beRemark(Remark t) {
        t.remark();
    }
}
