package homework03.lv4;

public class Process {
    public static void main(String[] args) {
        Student[] students = new Student[9];
        students[0] = new StudentA("小明A", 77);
        students[1] = new StudentA("小红A", 88);
        students[2] = new StudentA("小岩A", 65);
        students[3] = new StudentB("小明B", 59);
        students[4] = new StudentB("小红B", 65);
        students[5] = new StudentB("小岩B", 70);
        students[6] = new StudentC("小明C", 81);
        students[7] = new StudentC("小红C", 60);
        students[8] = new StudentC("小岩C", 54);
        for (int i = 0; i < students.length; i++) {
            students[i].beRemarked();
        }
    }
}
