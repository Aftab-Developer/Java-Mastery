package in.Aftab.multithreading.ExecutorFrameWork.Services;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Practise01 {

    public static void main(String[] args) throws InterruptedException {
       long start = System.currentTimeMillis();
        ExecutorService executor = Executors.newFixedThreadPool(9);
       for(int i = 1 ; i < 10 ; i++) {
           int finalI = i ;
           executor.submit(() -> {
               System.out.println(factorial(finalI));
           });
       }
        executor.shutdown();
       executor.awaitTermination(1,TimeUnit.SECONDS);
        System.out.println("total time consumed " + (System.currentTimeMillis() - start) );

    }
        public static long factorial ( int factorialNum){
            long fac = 1;
            for (int i = 1; i <= factorialNum; i++) {
                fac *= i;
            }
            return fac;
        }
    }
