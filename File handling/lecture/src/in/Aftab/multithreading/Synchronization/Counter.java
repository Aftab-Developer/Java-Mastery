package in.Aftab.multithreading.Synchronization;

public class Counter {
    public int count = 0 ;

     public void increment(){
         synchronized (this){
                this.count++ ;
            }
         }
     }

