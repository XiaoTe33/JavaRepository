package homework00;

import java.util.Scanner;

public class lv4_lv4ex {
    public static void add(String[][] student, int m) {
        int t = 0;
        for (int i = 0; i < m; i++) {
            Scanner sc2 = new Scanner(System.in);
            if (student[i][0] == null && student[i][1] == null) {
                System.out.println("请输入学号：");
                student[i][0] = sc2.next();
                System.out.println("请输入姓名");
                student[i][1] = sc2.next();
                t += 1;
                break;
            }
        }
        if (t == 0) {
            System.out.println("没位置了，滚！");
        }
    }//添加学生

    public static void show(String[][] student, int m) {
        for (int i = 0; i < m; i++) {

            if (student[i][0] != null && student[i][1] != null) {
                System.out.println("姓名：" + student[i][1] + "  学号：" + student[i][0]);
            }
        }
    }//显示信息

    public static void delete1(String[][] student, int m) {
        int t = 0;
        Scanner sc2 = new Scanner(System.in);
        System.out.println("请输入学号：");
        String num = sc2.next();

        for (int i = 0; i < m; i++) {
            if (student[i][0] != null && student[i][1] != null)
                if (student[i][0].equals(num)) {
                    System.out.println("---------------------");
                    System.out.println("姓名：" + student[i][1] + "  学号：" + student[i][0]);
                    System.out.println("删除成功！");
                    student[i][0] = null;
                    student[i][1] = null;
                    t = 1;
                    break;
                }
        }
        if (t == 0) {
            System.out.println("找不到嘞，检查一下你是不是输错了");
        }
    }//学号删除

    public static void delete2(String[][] student, int m) {
        int t = 0;
        Scanner sc2 = new Scanner(System.in);
        System.out.println("请输入姓名：");
        String name = sc2.next();

        for (int i = 0; i < m; i++) {
            if (student[i][0] != null && student[i][1] != null)
                if (student[i][1].equals(name)) {
                    System.out.println("---------------------");
                    System.out.println("姓名：" + student[i][1] + "  学号：" + student[i][0]);
                    System.out.println("删除成功！");
                    student[i][0] = null;
                    student[i][1] = null;
                    t = 1;
                    break;
                }
        }
        if (t == 0) {
            System.out.println("找不到嘞，检查一下你是不是输错了");
        }
    }//姓名删除

    public static void delete(String[][] student, int m) {
        boolean t = true;
        while (t) {
            System.out.println("--------------");
            System.out.println("1.通过学号删除");
            System.out.println("2.通过姓名删除");
            System.out.println("0.我点错了");
            System.out.println("--------------");
            Scanner sc2 = new Scanner(System.in);
            switch (sc2.nextInt()) {
                case 1:
                    delete1(student, m);
                    t = false;
                    break;
                case 2:
                    delete2(student, m);
                    t = false;
                    break;
                case 0:
                    t = false;
                    break;
                default:
                    System.out.println("大哥别搞，按上面输入！");
                    break;
            }
        }

    }//删除学生

    public static void change1(String[][] student, int m) {
        int t = 0;
        Scanner sc2 = new Scanner(System.in);
        System.out.println("请输入学号：");
        String num = sc2.next();

        for (int i = 0; i < m; i++) {
            if (student[i][0] != null && student[i][1] != null)
                if (student[i][0].equals(num)) {
                    System.out.println("---------------------");
                    System.out.println("姓名：" + student[i][1] + "  学号：" + student[i][0]);
                    System.out.println("请输入学号：");
                    student[i][0] = sc2.next();
                    System.out.println("请输入姓名：");
                    student[i][1] = sc2.next();
                    System.out.println("修改成功！");
                    t = 1;
                    break;
                }
        }
        if (t == 0) {
            System.out.println("找不到嘞，检查一下你是不是输错了");
        }
    }//学号修改

    public static void change2(String[][] student, int m) {
        int t = 0;
        Scanner sc2 = new Scanner(System.in);
        System.out.println("请输入姓名：");
        String name = sc2.next();

        for (int i = 0; i < m; i++) {
            if (student[i][0] != null && student[i][1] != null)
                if (student[i][1].equals(name)) {
                    System.out.println("---------------------");
                    System.out.println("姓名：" + student[i][1] + "  学号：" + student[i][0]);
                    System.out.println("请输入学号：");
                    student[i][0] = sc2.next();
                    System.out.println("请输入姓名：");
                    student[i][1] = sc2.next();
                    System.out.println("修改成功！");
                    t = 1;
                    break;
                }
        }
        if (t == 0) {
            System.out.println("找不到嘞，检查一下你是不是输错了");
        }
    }//姓名修改

    public static void change(String[][] student, int m) {
        boolean t = true;
        while (t) {
            System.out.println("--------------");
            System.out.println("1.通过学号修改");
            System.out.println("2.通过姓名修改");
            System.out.println("0.我点错了");
            System.out.println("--------------");
            Scanner sc2 = new Scanner(System.in);
            switch (sc2.nextInt()) {
                case 1:
                    change1(student, m);
                    t = false;
                    break;
                case 2:
                    change2(student, m);
                    t = false;
                    break;
                case 0:
                    t = false;
                    break;
                default:
                    System.out.println("大哥别搞，按上面输入！");
                    break;
            }
        }
    }//修改信息

    public static void sort(String[][] student, int m) {
        String[][] strings = student;
        int t=-1;
        String[][] temp = new String[1][2];
        for (int i = 0; i < m; i++) {
            if(t==-1){
                if (strings[i][0] != null && strings[i][1] != null) {
                    t=i;
                }
            }
            else{
                if (strings[i][0]!=null&&strings[i][1]!=null){
                    if(Integer.parseInt(strings[i][0])<Integer.parseInt(strings[t][0])){
                        temp[0][0]=strings[t][0];
                        temp[0][1]=strings[t][1];
                        strings[t][0]=strings[i][0];
                        strings[t][1]=strings[i][1];
                        strings[i][0]=temp[0][0];
                        strings[i][1]=temp[0][1];
                        t=i;
                    }
                }
            }

        }
        show(strings,m);
    }//排序显示


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你想创建的数组大小：");
        int m = sc.nextInt();
        String[][] student = new String[m][2];
        boolean t = true;
        while (t) {
            System.out.println("------------");
            System.out.println("1.添加学生");
            System.out.println("2.删除学生");
            System.out.println("3.修改信息");
            System.out.println("4.排序信息");
            System.out.println("9.查看信息");
            System.out.println("0.退出系统");
            System.out.println("------------");
            switch (sc.nextInt()) {
                case 0:
                    t = false;
                    System.out.println("欢迎下次使用");
                    break;
                case 1:
                    add(student, m);
                    break;
                case 2:
                    delete(student, m);
                    break;
                case 3:
                    change(student, m);
                    break;
                case 4:
                    sort(student,m);
                    break;
                case 9:
                    show(student, m);
                    break;
                default:
                    System.out.println("出错！请重新输入：");
                    break;
            }

        }

    }
}
