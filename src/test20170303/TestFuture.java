package test20170303;

import java.util.concurrent.*;

/**
 * Created by 58 on 2017/3/4.
 */
public class TestFuture {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(1);
        Callable<String> call = new Callable<String>() {
            @Override
            public String call() throws Exception {
                Thread.sleep(2000);
                System.out.println("执行");
                return "线程执行完毕";
            }
        };
        Future<String> future = null;
        try {

            future = executorService.submit(call);
            String obj = future.get(1000 * 1, TimeUnit.MILLISECONDS);
            System.out.println(obj);
            System.out.println("任务按时完成！");
            future.cancel(true);

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

        }

    }
}
