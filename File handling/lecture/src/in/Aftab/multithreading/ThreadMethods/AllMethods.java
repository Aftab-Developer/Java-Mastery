package in.Aftab.multithreading.ThreadMethods;

public class AllMethods {
    Runnable runnable = new Runnable() {
        @Override
        public void run() {
            for(int i =1 ; i <= 5 ; i++){
                try {
                    Thread.sleep(300);
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
                System.out.printf("%s iterator -%d",Thread.currentThread().getName(),i);
                System.out.println();
            }
        }

    };

    public static void main(String[] args) {
     AllMethods allMethods = new AllMethods();
     Thread t1 = new Thread(allMethods.runnable,"thread-01");
     Thread t2 = new Thread(allMethods.runnable,"thread-02");
     Thread t3 = new Thread(allMethods.runnable,"thread-03");
     t1.setPriority(Thread.MAX_PRIORITY);
     t2.setPriority(Thread.NORM_PRIORITY);
     t3.setPriority(Thread.MIN_PRIORITY);
     t1.start();
     t2.start();
     t3.start();


    }
}

// start sleep run yield interrupt setDemon setPriority