package in.Aftab.multithreading.ExecutorFrameWork.CompletableFuture;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.*;

public class Practise09 {
    public static CompletableFuture<String> firstSupplier() {
        return CompletableFuture.supplyAsync(() -> {
            System.out.println(Thread.currentThread().getName() + " is running");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            return "first";
        });
    }
    public static CompletableFuture<String> firstSupplier2() {
        return CompletableFuture.supplyAsync(() -> {
            System.out.println(Thread.currentThread().getName() + " is running");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            return "Two";
        });
    }

    public static CompletableFuture<String> firstSupplier3() {
        return CompletableFuture.supplyAsync(() -> {
            System.out.println(Thread.currentThread().getName() + " is running");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            return "Three";
        });
    }

    public static void main(String[] args) throws InterruptedException, ExecutionException {

//        CompletableFuture<Object> future = CompletableFuture.anyOf(firstSupplier(),firstSupplier2(),firstSupplier3());
//
//         Object supplierName = future.join();
//        System.out.println(supplierName);
//
//        ExecutorService executorService = Executors.newFixedThreadPool(1);
//        Callable<String>  callable01 = () -> "Thread 01";
//        Callable<String>  callable02 = () -> "Thread 02";
//        Callable<String>  callable03 = () -> "Thread 03";
//        List<Callable<String>> list = Arrays.asList(callable01,callable02,callable03);
//
//        String future =  executorService.invokeAny(list);
//        System.out.println(future);
//        executorService.shutdown();

    }

}
