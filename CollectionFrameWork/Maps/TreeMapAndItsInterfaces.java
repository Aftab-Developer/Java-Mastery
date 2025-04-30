package CollectionFrameWork.Maps;

import java.util.Map;
import java.util.NavigableMap;
import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapAndItsInterfaces {
    public static void main(String[] args) {
        /*
        TreeMap is  implementation of map interface in java
        it provides us sorting using balanced binary search tree
        with time complexity of log(n) . its sorts the map with respected
        to the Keys (natural ordering) or a custom comparator.It has Two Interfaces
        NavigableMap and Sorted Map NavigableMap extends SortedMap and TreeMap implements
        NavigableMap .
         */
        NavigableMap<Integer, String> map = new TreeMap<>((a, b) -> b - a);
        map.put(23, "Aftab");
        map.put(12, "Shahzad");
        map.put(45, "Bilal");
        Integer i = map.lowerKey(12);
        System.out.println(i);
        System.out.println(map);

//       SortedMap :-
          /*
           It contains the function like
           firstKey(); returns the firstKey
           lastKey(); returns the lowerKey
           headMap(); return all the < elements exclude the one which you pass
           tailMap(); return all the > elements not exclude the one which you pass
           subMap() ; return the subMap between the range you pass
           Note : It depends on your use case which type you put on your
           TreeMap if you want that functionality use sortedMap

           */


//        NavigableMap:-
       /*
       lowerKey();
       greaterEntry();
       ceilingKey();
       if you need that function use the NavigableMap
        */
    }
}
