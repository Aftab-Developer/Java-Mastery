package in.Aftab.multithreading.Locks.DeadLock;
 class Pen {

     public synchronized void writeWithPenAndPaper(Paper paper) {
         System.out.println(Thread.currentThread().getName() + " is waiting for WriteInPaperWithPen to write");
         paper.finishWriting();

     }
     public synchronized void finishWriting() {
         System.out.println(Thread.currentThread().getName() + " successfully taken writeWithPenAndPaper and writen in WriteInPaperWithPen");
     }


 }
class Paper {

    public synchronized void WriteInPaperWithPen(Pen pen) {
        System.out.println(Thread.currentThread().getName() + " is waiting for writeWithPenAndPaper to write");
       pen.finishWriting();
    }
    public synchronized void finishWriting() {
        System.out.println(Thread.currentThread().getName() + " successfully written in WriteInPaperWithPen with writeWithPenAndPaper");
    }


}

class Runnable1 implements  Runnable{
     private Pen pen ;
     private Paper paper ;
      public Runnable1(Pen pen , Paper paper) {
          this.pen = pen ;
          this.paper = paper ;
      }
      @Override
      public void run() {
          pen.writeWithPenAndPaper(paper);
      }
}

class Runnable2 implements Runnable{
    private Pen pen ;
    private Paper paper ;
    public Runnable2(Pen pen , Paper paper) {
        this.pen = pen ;
        this.paper = paper ;
    }
    @Override
    public void run() {
        synchronized (pen) {
            paper.WriteInPaperWithPen(pen);

        }
    }
};


public class DeadLock {
 Pen pen = new Pen() ;
 Paper paper = new Paper() ;
    public static void main(String[] args) {
        DeadLock deadLock = new DeadLock() ;
       Thread t1 = new Thread(new Runnable1(deadLock.pen , deadLock.paper) , "Thread 01") ;
       Thread t2 = new Thread(new Runnable2(deadLock.pen , deadLock.paper) , "Thread 02") ;
       t1.start();
       t2.start();
    }
}
