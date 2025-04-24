
class Test {
    public volatile boolean flag ;

    public void printFlagIfTrue() {
        while (!flag){
//            waiting
        }
        System.out.println("Flag is True");
    }

    public void updateFlag(){
        this.flag = true ;
    }
}
public class VolatileInJava {
    public static void main(String[] args) throws InterruptedException {
        Test test = new Test() ;
        Thread t1 = new Thread(() -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            test.updateFlag();
        }) ;
        Thread t2 = new Thread(() -> {
            test.printFlagIfTrue();
        }) ;
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("ALl Process Finished");

    }
}
