package in.Aftab.multithreading.Locks.FairLock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class FairLock {
    Lock fair = new ReentrantLock(true) ;

    public void sharedResource() {
        fair.lock() ;
        System.out.println(Thread.currentThread().getName() + " is acquire the lock");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }finally {
            System.out.println(Thread.currentThread().getName() + " is released the lock");
            fair.unlock();
        }
    }
}
