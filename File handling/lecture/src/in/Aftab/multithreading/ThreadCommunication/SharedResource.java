package in.Aftab.multithreading.ThreadCommunication;

public class SharedResource {
    private int generateValue ;
    private boolean hasData ;
    public int generate() {
        this.generateValue++ ;
        return  generateValue ;

    }
    public synchronized void produce () {
        while(hasData) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        int val = generate() ;
        System.out.println(Thread.currentThread().getName() + " Generates the value : " + val);
        hasData = true ;
        notify();
    }

     public synchronized int consume() {
         while(!hasData) {
             try {
                 wait();
             } catch (InterruptedException e) {
                 throw new RuntimeException(e);
             }
         }
         int val = getGenerateValue();
         System.out.println( Thread.currentThread().getName() +" is consumed the value : " + val);
         this.hasData = false ;
         notify();
         return val ;
     }

    public int getGenerateValue() {
        return generateValue;
    }



}
