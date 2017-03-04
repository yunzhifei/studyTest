package test20170303;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

/**
 * Created by 58 on 2017/3/3.
 */
public class TestException1 {
    public static void main(String[] args) {
        String file = "D:\\exceptionTest.txt";
        FileReader reader;
        try {
            reader = new FileReader(file);
            Scanner in = new Scanner(reader);
            String string = in.next();
            System.out.println(string + "不知道我有幸能够执行到不.....");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("对不起,你执行不到...");
        } finally {
            System.out.println("finally 在执行...");
        }
    }
}
