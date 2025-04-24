class Utils {
    public int val ;
    public  boolean hasData ;
    public synchronized void produce(int data) {
        while (hasData) {
            try {
                wait();
            } catch (InterruptedException e) {}
        }
        val = data;
        hasData = true;
        System.out.println(Thread.currentThread().getName() + " is Producing "+val);
        notify();
    }
    public synchronized int consume() {
        while (!hasData) {
            try {
                wait();
            } catch (InterruptedException e) {}

        }
        hasData = false;
        notify();
        System.out.println(Thread.currentThread().getName() + " is Consuming "+val );
        return val;
    }



}

class Producer extends Thread{
    Utils utils ;
    public  Producer(Utils utils) {
        this.utils = utils ;
    }
     @Override
    public void run() {
         for (int i = 0 ; i < 10 ; i++){

             utils.produce(i);
             try {
                 Thread.sleep(100);
             } catch (InterruptedException e) {

             }
         }
     }
}

class Consumer extends Thread{
    Utils utils ;
    public Consumer(Utils utils) {
        this.utils = utils ;
    }
    @Override
    public void run() {
        for (int i = 0 ; i < 10 ; i++){
            utils.consume();
        }
    }
}


public class DeadLock {
    public static void main(String[] args) {
        Utils utils = new Utils() ;
        Producer producer = new Producer(utils);
        Consumer consumer = new Consumer(utils);

        producer.start();
        consumer.start();

        try {
            producer.join();
            consumer.join() ;
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("The Final Value is "+ utils.val);


    }
}
