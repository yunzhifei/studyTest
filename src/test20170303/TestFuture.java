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
                Thread.sleep(100);
                System.out.println("执行");
                return "线程执行完毕";
            }
        };
        try {
            for (int i = 0; i < 5; i++) {
                Future<String> future = executorService.submit(call);
                String obj = future.get(1000 * 1, TimeUnit.MILLISECONDS);
                System.out.println(obj);
                System.out.println("任务按时完成！");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (TimeoutException e) {
            System.out.println("任务超时了！");
            executorService.shutdown();
            e.printStackTrace();
        } finally {

        }

    }
}
