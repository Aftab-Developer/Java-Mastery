package in.Aftab.multithreading.Locks.ReadWriteLock;

public class Test {
    SharedCounter sharedCounter = new SharedCounter();
    Runnable runnable1 =  new Runnable() {
        @Override
        public void run() {
            for(int i = 0 ; i < 10 ; i++){
                sharedCounter.setCount() ;
            }
        }
    };
    Runnable runnable2 = new Runnable() {
        @Override
        public void run() {
            for(int i = 0 ; i < 10 ; i++) {
                sharedCounter.getCount();

            }

        }
    };
    Runnable runnable3 = new Runnable() {
        @Override
        public void run() {
            for(int i = 0 ; i < 10 ; i++) {
                sharedCounter.getCount();
            }
        }
    };
    public static void main(String[] args) throws InterruptedException {
        Test test = new Test() ;
        Thread t1 = new Thread(test.runnable1 , "Thread-01");
        Thread t2 = new Thread(test.runnable2 , "Thread-02");
        Thread t3 = new Thread(test.runnable3 , "Thread-03");
        t1.start();
        t2.start();
        t3.start();

        t1.join();
        t2.join();
        t3.join();

        System.out.println("all thread read and write the resource ...");

    }
}
