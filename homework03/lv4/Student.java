package homework03.lv4;

public abstract class Student {
    public static int line = 60;
    public String name;
    public int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public abstract void beRemarked();
}
