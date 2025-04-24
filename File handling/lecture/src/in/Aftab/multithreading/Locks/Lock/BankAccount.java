package in.Aftab.multithreading.Locks.Lock;


import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccount {
    private int balance = 100 ;
    private final Lock lock = new ReentrantLock() ;
    public void withDraw(int ammount) {
        System.out.println(Thread.currentThread().getName() + " is with drawing the ammount "+balance);
        try {
             if(lock.tryLock(1000 , TimeUnit.MILLISECONDS)) {
                 if(balance >= ammount) {
                     System.out.println(Thread.currentThread().getName() + " with drawing is in progress ");
                     try{
                         Thread.sleep(3000);
                         System.out.println(Thread.currentThread().getName() + " is with drawed the ammount "+balance);

                     } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                     } finally {
                         lock.unlock();
                     }

                 }
             }else {
                 System.out.println(Thread.currentThread().getName() + " can not aquire the lock will try later");
             }
        } catch(Exception e) {
            Thread.currentThread().interrupt();
        }
    }
}

//Locks Method lock() , tryLock() , tryLock() with time , lockInteroperablity()
//
