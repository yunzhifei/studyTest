package test20170303;

import test20170303.entity.CallableImpl;

import java.util.concurrent.*;

/**
 * Created by 58 on 2017/3/4.
 */
public class TestFuture {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(1);
        Callable<String> call = new CallableImpl("Test CallableImpl !");
        Future<String> future = null;
        try {

            future = executorService.submit(call);
            String obj = future.get(1000 * 1, TimeUnit.MILLISECONDS);
            System.out.println(obj);
            System.out.println("任务按时完成！");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (TimeoutException e) {
            System.out.println("任务超时了！");
            if (null != future) {
                future.cancel(true);
            }
            executorService.shutdown();
            e.printStackTrace();
        } finally {
            System.out.println("sdfasdfasdf");
        }

    }
}
