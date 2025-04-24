package in.Aftab.multithreading.ThreadTypes;

public class SecondThread {
    Runnable  thread = new Runnable() {
        @Override
        public void run() {
            try{
                Thread.sleep(2000) ;
                System.out.println("Hellow thread two");
            } catch(InterruptedException e){
                System.out.println(e);
            }
        }
    } ;

    public static void main(String[] args) throws InterruptedException  {
        SecondThread secondThread = new SecondThread();
        Thread t2 = new Thread(secondThread.thread , "thread 02") ;
        t2.start();
        t2.join();
        System.out.println("Main thread");
    }

}
