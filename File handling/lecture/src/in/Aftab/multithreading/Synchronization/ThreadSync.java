package in.Aftab.multithreading.Synchronization;

public class ThreadSync extends Thread{
    Counter counter ;
    public ThreadSync(Counter c){
        this.counter = c ;
    }
    @Override
    public void run(){
        for (int i = 1 ; i <= 1000 ; i++) {
            counter.increment();
        }
    }
}
