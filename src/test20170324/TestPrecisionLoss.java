package test20170324;

/**
 * Created by 58 on 2017/3/24.
 * author yun zhi fei
 */
public class TestPrecisionLoss {
    public static void main(String[] args) {
        for (double a = 0.1; a != 10; a += 0.1) {
            if (a > 10) {
                break;
            } else {
                System.out.println("a = " + a);
            }
        }

    }
}
