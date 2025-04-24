package in.Aftab.multithreading.ExecutorFrameWork.CompletableFuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

public class Practise07 {
   public static void delay(int interval) {
       try {
           TimeUnit.MILLISECONDS.sleep(interval);
       } catch (InterruptedException e) {
           System.out.println(e.getMessage());
       }
   }



    public static void main(String[] args) {
     CompletableFuture<Void> future = CompletableFuture.supplyAsync(() -> {
         delay(3000);
         return "Aftab Alam";

     }).thenCompose((user) -> CompletableFuture.supplyAsync(() -> {
         delay(3000);
         return user + " wishlist is 45";
     })).thenAccept((all) -> System.out.println(all));
     future.join();

    }

}
