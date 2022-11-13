package homework03.lv1;

import sun.security.smartcardio.SunPCSC;

import java.util.Scanner;

public class TrueFactory {
    public static void main(String[] args) {
        System.out.println("[高数] [英语] [线代]");
        System.out.println("输入你想打印的科目：");
        Scanner sc = new Scanner(System.in);
        Factory factory = createFactory(sc.next());
        if (factory != null) {
            factory.print();
        }
    }

    public static Factory createFactory(String string) {
        if (string.equals("高数")) {
            return new Factory1();
        }
        if (string.equals("英语")) {
            return new Factory2();
        }
        if (string.equals("线代")) {
            return new Factory3();
        }
        System.out.println("没有这种习题哦");
        return null;
    }
}
