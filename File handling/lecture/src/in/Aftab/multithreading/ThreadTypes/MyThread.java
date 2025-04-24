package in.Aftab.multithreading.ThreadTypes;

public class MyThread extends Thread{
    public MyThread(String name) {
         super(name) ;
    }
    @Override
    public void run() {
        try {
            Thread.sleep(2000);
            System.out.printf("%s is running ..." , Thread.currentThread().getName());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    public static void main(String[] args) throws InterruptedException {
        MyThread t1 = new MyThread("thread 01") ;
        t1.start();
        t1.join();
        System.out.println("main thread");


    }
}
