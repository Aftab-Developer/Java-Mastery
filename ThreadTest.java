import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ThreadTest {
    public static void main(String[] args) throws InterruptedException {
        long time = System.currentTimeMillis() ;
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        for (int i = 1; i < 10 ; i++) {
            int finalI = i ;
            executorService.submit(() -> {
                long factorial = factorial(finalI);
                System.out.println(factorial);
            }) ;

        }
        executorService.shutdown();
        executorService.awaitTermination(10, TimeUnit.SECONDS) ;
        System.out.println("Time Taken is : " + (System.currentTimeMillis() - time));

        }
    public static long factorial(int num ) {
        long res = 1  ;
        for (int i = 1 ; i <= num ; i++){
            res *= i ;
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {

        }
        return res ;
    }

    }


