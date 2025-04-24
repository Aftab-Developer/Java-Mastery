package in.Aftab.multithreading.ThreadTypes;

public class ThreadWithRunnable implements Runnable {
    @Override
    public void run (){
        System.out.println("Thread is Running");
    }

    public static void main(String[] args) {
        ThreadWithRunnable threadWithRunnable = new ThreadWithRunnable();
        Thread thread1 = new Thread(threadWithRunnable,"Aftab");
        thread1.start();
    }
}
