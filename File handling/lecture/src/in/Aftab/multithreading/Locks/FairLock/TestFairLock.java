package in.Aftab.multithreading.Locks.FairLock;

public class TestFairLock {
    FairLock fairLock = new FairLock();
    Runnable runnable = new Runnable() {
        @Override
        public void run() {
            fairLock.sharedResource();
        }
    };
    public static void main(String[] args) throws InterruptedException {
        TestFairLock testFairLock = new TestFairLock() ;
        Thread t1 = new Thread(testFairLock.runnable , "thread 01");
        Thread t2 = new Thread(testFairLock.runnable , "thread 02");
        Thread t3 = new Thread(testFairLock.runnable , "thread 03");
        Thread t4 = new Thread(testFairLock.runnable , "thread 04");
        t1.start();
        Thread.sleep(200);
        t2.start();
        Thread.sleep(200);
        t3.start();
        Thread.sleep(200);
        t4.start();
    }
}
