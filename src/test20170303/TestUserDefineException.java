package test20170303;

/**
 * Created by 58 on 2017/3/3.
 */
public class TestUserDefineException {
    public static void main(String[] args) {
        try {
            throw new MyException();
        } catch (MyException e) {
            e.printStackTrace();
        }
    }
}

class MyException extends Throwable{

}
