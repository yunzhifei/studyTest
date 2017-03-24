package test20170313;

import java.util.HashSet;

/**
 * Created by 58 on 2017/3/20.
 */
public class TestDataType {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<String>();
        hashSet.add("one");
        hashSet.add("two");
        hashSet.add("three");
        System.out.println(hashSet.remove("one"));
        System.out.println(hashSet.remove("oned"));

    }
}