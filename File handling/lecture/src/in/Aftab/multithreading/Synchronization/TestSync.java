package in.Aftab.multithreading.Synchronization;

public class TestSync {
    public static void main(String[] args) {
        Counter counter = new Counter() ;
        ThreadSync t1 = new ThreadSync(counter) ;
        ThreadSync t2 = new ThreadSync(counter) ;
        try{
            t1.start();
            t2.start();
            t1.join();
            t2.join();
        } catch(InterruptedException e){
            System.out.println(e);
        }
        System.out.println(counter.count);

    }
}
