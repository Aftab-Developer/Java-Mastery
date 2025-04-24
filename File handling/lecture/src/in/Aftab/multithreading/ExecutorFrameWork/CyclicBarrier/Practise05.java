package in.Aftab.multithreading.ExecutorFrameWork.CyclicBarrier;

import java.util.concurrent.Callable;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Practise05 {
    public static void main(String[] args) {
        int noOfServices = 3 ;
        ExecutorService executorService = Executors.newFixedThreadPool(noOfServices) ;
        CyclicBarrier cyclicBarrier = new CyclicBarrier(noOfServices ,() -> System.out.println("Hellow all threads ..."));
        executorService.submit(new SubSystem("Web Api",2000,cyclicBarrier)) ;
        executorService.submit(new SubSystem("Microservices",2500,cyclicBarrier)) ;
        executorService.submit(new SubSystem("Message Service",3500,cyclicBarrier)) ;
        executorService.shutdown();
    }
}

class SubSystem implements Callable<String> {
    private String name;
    private int initializationTime ;
    private CyclicBarrier barrier ;

    public SubSystem(String name , int initializationTime ,CyclicBarrier barrier) {
        this.name = name ;
        this.initializationTime = initializationTime;
        this.barrier = barrier ;
    }


    @Override
    public String call() throws Exception {
        System.out.println(Thread.currentThread().getName() + " is started the " + this.name);
        Thread.sleep(this.initializationTime);
        this.barrier.await();
        return "";
    }
}
