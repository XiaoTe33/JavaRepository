package homework04.lv2;

import java.io.*;
import java.util.Arrays;

public class IOTools {
    public static void readFromFile(String filename) throws Exception {

        File file = new File(filename);
        try (FileInputStream fileInputStream = new FileInputStream(file)) {
            byte[] buf = new byte[fileInputStream.available()];
            fileInputStream.read(buf);
            System.out.println(new String(buf));
        }
    }

    public static void writeToFile(String filename,byte[] buf) {
        File file=new File(filename);
        try(FileOutputStream fileOutputStream= new FileOutputStream(file)) {
            fileOutputStream.write(buf);
        } catch (Exception e) {
            System.out.println(e);
        }

    }


}

