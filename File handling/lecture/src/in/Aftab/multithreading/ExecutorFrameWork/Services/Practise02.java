package in.Aftab.multithreading.ExecutorFrameWork.Services;

import java.util.concurrent.*;

public class Practise02 {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(2);
        Future<String> future = executor.submit(() -> {
            System.out.println("Task 01");
            Thread.sleep(2000);
            return "Aftab" ;
        }) ;
        executor.shutdown();
        try {
            String s = future.get(1000 ,TimeUnit.MILLISECONDS);

            System.out.println(s);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        } catch (TimeoutException e) {
            System.out.println(e.getMessage());
         }


    }
}