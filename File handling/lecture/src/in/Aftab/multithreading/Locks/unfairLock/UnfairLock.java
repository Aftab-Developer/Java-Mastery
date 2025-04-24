package in.Aftab.multithreading.Locks.unfairLock;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class UnfairLock {

    Lock unfair = new ReentrantLock() ;

    public void sharedResource() {
        unfair.lock() ;
        System.out.println(Thread.currentThread().getName() + " is acquire the lock");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }finally {
            System.out.println(Thread.currentThread().getName() + " is released the lock");
            unfair.unlock();
        }
    }
}
