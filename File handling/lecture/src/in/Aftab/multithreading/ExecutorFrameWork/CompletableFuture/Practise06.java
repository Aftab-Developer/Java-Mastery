package in.Aftab.multithreading.ExecutorFrameWork.CompletableFuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;

public class Practise06 {
    public static void delay(int interval) {
        try {
            TimeUnit.MILLISECONDS.sleep(interval);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
    public static void main(String[] args) {
//
//        CompletableFuture<Void> future = CompletableFuture.supplyAsync(() -> {
//            delay(3000);
//            return " hellow" ;
//        }).thenApplyAsync((s) -> {
//            delay(2000);
//            return s+" Aftab" ;
//        }).thenRunAsync(() -> System.out.println("all data delivered"));
//        future.join();



//        CompletableFuture<Void> future = CompletableFuture.runAsync(() -> {
//            delay(2000);
//            System.out.println("hello Async programming");
//        });
//        future.join();
    }
}
