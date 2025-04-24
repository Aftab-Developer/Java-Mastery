package in.Aftab.multithreading.Locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class SharedCounter {
    private int count ;
    private final ReentrantReadWriteLock lock = new ReentrantReadWriteLock();
    public void setCount() {
        this.lock.writeLock();
        this.count++ ;
        System.out.println( Thread.currentThread().getName() +  " increased The count") ;
    }

    public void getCount() {
        this.lock.readLock();
        System.out.println( Thread.currentThread().getName() +  " read count " + count) ;

    }
}
