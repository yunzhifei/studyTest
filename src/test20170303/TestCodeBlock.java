package test20170303;

/**
 * Created by 58 on 2017/3/3.
 * author yun zhi fei
 */
public class TestCodeBlock {


    public static void main(String[] args) {
        TestCoder.testStatic();
        TestCoder testCoder = new TestCoder();
        System.out.println("testCoder = " + testCoder.hashCode());

    }
}

class TestCoder {

    static void testStatic() {
        System.out.println("静态方法！");
    }

    static {
        System.out.println("静态代码块！");
    }

    {
        System.out.println("代码块！");
    }

    TestCoder() {
        System.out.println("构造");
    }
}
