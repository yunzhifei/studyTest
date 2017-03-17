package test20170303.entity;

import java.util.concurrent.Callable;

/**
 * Created by 58 on 2017/3/6.
 */
public class CallableImpl implements Callable<String> {
    private String string;

    public CallableImpl(String string) {
        this.string = string;
    }

    @Override
    public String call() throws Exception {
        System.out.println(string);
        return "";
    }
}
