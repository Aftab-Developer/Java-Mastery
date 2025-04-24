package in.Aftab.multithreading.ExecutorFrameWork.CompletableFuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

public class Practical08 {
    public static void delay(int interval) {
        try {
            TimeUnit.MILLISECONDS.sleep(interval);
        } catch (Exception e) {
            System.out.println(e);
        }
    }



    public static void main(String[] args) {
        CompletableFuture<String> future = CompletableFuture
        .supplyAsync(() -> "Aftab785ahmed@gmail.com")
         .thenCombine(CompletableFuture.supplyAsync(() -> "the weather is 60 deg celcius"),
             (p, s) -> {
            System.out.println("hellow " + p + " " + s);
            return p + s;
        });
       String name = future.join();
        System.out.println(name);
    }
}
