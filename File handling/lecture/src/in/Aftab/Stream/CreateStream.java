package in.Aftab.Stream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CreateStream {
    public static void printStream(Stream<?> stream) {
        stream.forEach(s -> System.out.println(s));
    }
    public static void main(String[] args)  {
//        Method 01
        String[] names = {"Aftab","Shahzad","bilal"} ;
        Stream<String> s1 = Arrays.stream(names) ;
// Method 2
        List<Integer> list = new ArrayList<>(Arrays.asList(12,34,56)) ;
       Stream<Integer> stream =  list.stream();
       stream.forEach(s -> System.out.println(s));
//       Method 03
        Stream<Integer> stream1 = Stream.of(34,56,87) ;
        stream1.forEach((s) -> System.out.println(s));

//        Method 04
      Stream<Integer> stream2 =  Stream.iterate(1,n -> n + 1).limit(20) ;
      CreateStream.printStream(stream2);
//      Method 05
        Stream<String> stream3 = Stream.generate(() -> "hellow").limit(30);
        CreateStream.printStream(stream3);
//        Other stuff
        List<Integer> streamCovertToList = Stream.of(34,56,87).collect(Collectors.toList()) ;
        ArrayList<Integer> arrayList = new ArrayList<>(streamCovertToList) ;
        arrayList.forEach((s) -> System.out.println(s));



    }
}
