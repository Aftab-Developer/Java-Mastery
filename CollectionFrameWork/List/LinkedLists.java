package CollectionFrameWork.List;

import java.util.Arrays;
import java.util.LinkedList;

public class LinkedLists {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(45,78,90,87)) ;
        list.add(23);
        System.out.println(list);
        list.addFirst(23);
        list.addLast(99);
        list.remove(Integer.valueOf(23));
        list.remove(3) ;
        for(Integer integer : list) {
            System.out.println(integer);
        }
        list.forEach(System.out::println);
    }
}
