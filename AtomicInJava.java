import java.util.concurrent.atomic.AtomicInteger;

class SharedResoure {
    private AtomicInteger atomicInteger = new  AtomicInteger(0);


    public Integer getValue() {
        return atomicInteger.get();
    }

    public void updateValue() {
        this.atomicInteger.incrementAndGet();
    }
}

public class AtomicInJava {
    public static void main(String[] args) throws InterruptedException {
        SharedResoure sharedResoure = new SharedResoure();
        Thread t1 = new Thread(() ->
        {
            for (Integer i = 1 ; i <= 1000 ; i++){
                sharedResoure.updateValue();
            }
        });
        Thread t2 = new Thread(() ->
        {
            for (Integer i = 1 ; i <= 1000 ; i++){
                sharedResoure.updateValue();
            }
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.printf("Final value is : %d",sharedResoure.getValue());
    }


}
