import javax.swing.text.html.HTMLDocument;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JavaStreams {
    public static void main(String[] args) {
//        Streams Creation Methods
//        Method 01
//        Integer[] integers = {12, 23, 45, 76};
//        Stream<Integer> stream = Arrays.stream(integers);
//
//        Method 02
//        List<String> list = Arrays.asList("Aftab", "Shahzad");
//        Stream<String> listStream = list.stream();

//        Method 03
//        Stream<Integer> integerStream = Stream.of(23, 45, 56, 67);

//        Method 04
//        Stream<Integer> skip = Stream.iterate(0, (n) -> n + 1)
//         .limit(101)
//          .skip(1);

//        Method 05
//        Stream<String> limit = Stream.generate(() -> "Hellow").limit(30);

//        Streams Method to achieve declarative programming
//        List<String> filteredStudents = Arrays.asList("Aftab", "Shahzad", "Yaseen")
//                .stream()
//                .filter((s) -> s.length() >= 6)
//                .peek(System.out::println)
//                .collect(Collectors.toList());
//                 System.out.println(filteredStudents);

//       Integer fail = 45 ;
//      Integer finalValue = Arrays.asList(89, 77, 90, 45)
//                .stream()
//                .filter(m -> m > fail).peek(System.out::println)
//                .limit(1)
//                .max((a,b) -> b-a )
//                .get() ;

//        System.out.println(finalValue);

//        Runnable r1 ;
//        Thread thread = new Thread(() -> System.out.println("hellow"),"AFtab");
//        thread.start();
//        ReentrantReadWriteLock lock = new ReentrantReadWriteLock();
//       lock.readLock() ;
//        ReentrantLock lock =  new ReentrantLock()   ;

//          map ,
//         filter ,
//         foreach ,
//           limit
//               skip
//        max , min , get
//        peek ,
//        sort
    }
}
