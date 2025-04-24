package in.Aftab.multithreading.ExecutorFrameWork.Services;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class practise03 {
    public static void main(String[] args) {
      ScheduledExecutorService executor = Executors.newScheduledThreadPool(2);
      executor.scheduleWithFixedDelay(() -> System.out.println("hello"),3,2,TimeUnit.SECONDS) ;
      executor.scheduleAtFixedRate(() -> System.out.println("hii"),1,1,TimeUnit.SECONDS);
     executor.schedule(() -> executor.shutdown(),8,TimeUnit.SECONDS);
    }
}
