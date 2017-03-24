package test20170313;

/**
 * Created by 58 on 2017/3/17.
 */
public class TestJvm {
    public static void main(String[] args) {
        String string1 = new StringBuilder("ja").append("va").toString();
        System.out.println(string1.intern() == string1);

        String string = new StringBuilder("ja").append("va").toString();
        System.out.println(string.intern() == string);



    }
}
