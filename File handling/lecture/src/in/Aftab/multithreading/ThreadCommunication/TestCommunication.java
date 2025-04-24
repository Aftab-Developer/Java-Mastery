package in.Aftab.multithreading.ThreadCommunication;


class Producer implements Runnable {
    SharedResource resource ;
    Producer(SharedResource resource ) {
        this.resource = resource ;
    }
    @Override
    public void run() {
        for(int i =0  ; i < 10 ; i++){
            resource.produce();
        }
    }
}
class Consumer implements Runnable {
    public SharedResource resource ;
    Consumer(SharedResource resource ) {
     this.resource = resource ;

    }
    @Override
    public void run() {
        for(int i =0  ; i < 10 ; i++){
            resource.consume();
        }
    }
}

public class TestCommunication {

    public static void main(String[] args) throws InterruptedException {
        SharedResource sharedResource = new SharedResource();
        Thread thread1 = new Thread(new Producer(sharedResource),"Thread 01");
        Thread thread2 = new Thread(new Consumer(sharedResource), "Thread 02");
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println("ALl threads produced and consumed ...");
    }
}






