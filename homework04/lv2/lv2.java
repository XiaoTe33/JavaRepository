package homework04.lv2;

import homework04.lv2.IOTools;

public class lv2 {
    public static void main(String[] args) throws Exception {
        IOTools.readFromFile("F:\\RedRockerLearn\\JAVA\\homework\\src\\homework04\\file");

        String context="i am a RedRocker";
        IOTools.writeToFile("F:\\RedRockerLearn\\JAVA\\homework\\src\\homework04\\file", context.getBytes());
    }
}
