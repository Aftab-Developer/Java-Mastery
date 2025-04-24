package CollectionFrameWork.List;
import java.util.Vector;

public class Vectors {
    public static void main(String[] args) throws InterruptedException {
        Vector<Integer> vector = new Vector();

        Thread t1 = new Thread(() -> {
            for (int i =1 ; i <= 1000; i++) {
                vector.add(i);
            }
        }) ;

        Thread t2 = new Thread(() -> {
            for (int i =1 ; i <= 1000; i++) {
                vector.add(i);
            }
        }) ;
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(vector.size());
        Integer i = vector.getFirst();
        System.out.println(i);
        vector.set(9,100) ;
        vector.getFirst();
        vector.getLast();
        vector.forEach(System.out::println);
        vector.removeIf(s-> s%2 == 0) ;
        System.out.println(vector.size());

    }
}
