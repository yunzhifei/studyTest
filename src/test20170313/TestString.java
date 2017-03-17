package test20170313;

/**
 * Created by 58 on 2017/3/13.
 */
public class TestString {
    public static void main(String[] args) {
        String sou = "asdfkjhsakjldhaksllllllllllllllllllhdfklaaaaaaaaaaaaaaaaaaaskjl";
        System.out.println("sou = " + sou.hashCode());
        TestString testString = new TestString();
        testString.change(sou);
    }
    public String change(String string){
        System.out.println("string = " + string.hashCode());
        string = "asfdasdfasdfa";
        System.out.println("string = " + string.hashCode());
        return "";
    }
}
