package in.Aftab.multithreading.ExecutorFrameWork.CountDownLatch;

import java.util.concurrent.*;

public class Practise04 {
    public static void main(String[] args) throws InterruptedException {
        int noOfWorks = 3 ;
      ExecutorService executor =  Executors.newFixedThreadPool(noOfWorks);
      CountDownLatch latch = new CountDownLatch(noOfWorks);
      executor.submit(new Dependency(latch));
      executor.submit(new Dependency(latch));
      executor.submit(new Dependency(latch));
      latch.await(2, TimeUnit.SECONDS);
        System.out.println("Main is here ...");
       executor.shutdownNow();
    }
}
class Dependency implements Callable<String> {
    public CountDownLatch latch ;
    public Dependency(CountDownLatch latch) {
        this.latch = latch ;
    }
     public String call() throws Exception {
         try {
             Thread.sleep(6000);
             System.out.println(Thread.currentThread().getName() + " is Running ...");
         } finally {
             this.latch.countDown();
         }
         return "callable";
     }
}
