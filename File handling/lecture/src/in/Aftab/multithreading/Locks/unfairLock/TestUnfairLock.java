package in.Aftab.multithreading.Locks.unfairLock;

public class TestUnfairLock {
    UnfairLock unfairLock = new UnfairLock();
   public Runnable runnable = new Runnable() {
        @Override
        public void run() {
            unfairLock.sharedResource();
        }
    };
    public static void main(String[] args) {
        TestUnfairLock testUnfairLock = new TestUnfairLock() ;
        Thread t1 = new Thread(testUnfairLock.runnable , "thread 01");
        Thread t2 = new Thread(testUnfairLock.runnable , "thread 02");
        Thread t3 = new Thread(testUnfairLock.runnable , "thread 03");
        Thread t4 = new Thread(testUnfairLock.runnable , "thread 04");
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
