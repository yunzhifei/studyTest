package test20170313;

import java.util.HashSet;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by 58 on 2017/3/20.
 */
public class TestDataType implements Cloneable {
    TestDataType() {
        System.out.println("sdfadfas");
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        HashSet<String> hashSet = new HashSet<String>();
        hashSet.add("one");
        hashSet.add("two");
        hashSet.add("three");
        System.out.println(hashSet.remove("one"));
        System.out.println(hashSet.remove("oned"));
        AtomicInteger counter = new AtomicInteger();
        counter.incrementAndGet();
        System.out.println("counter = " + counter.get());
        int count = counter.getAndAdd(2);
        System.out.println("count = " + count);
        System.out.println("counter = " + counter.get());
        String string = "";
        System.out.println(null instanceof String);
        System.out.println(new TestDataType().getClass().getName());

        TestDataType testDataType = new TestDataType();
        Object testDataType1 = testDataType.clone();
        System.out.println("testDataType1 = " + testDataType1);
        System.out.println("testDataType = " + testDataType);

    }
}
