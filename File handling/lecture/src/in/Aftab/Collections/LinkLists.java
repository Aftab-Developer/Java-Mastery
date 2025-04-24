package in.Aftab.Collections;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class LinkLists {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>(Arrays.asList("Aftab","Shahazad","Bilal")) ;
        list.sort(null);
        list.getFirst();
        list.getLast();
        list.addFirst("Ali");
        list.addLast("Ali");
        List<String> list1 = list.stream().map(s -> s).collect(Collectors.toList()) ;
        LinkedList<String> list2 = new LinkedList<>(list1);
        System.out.println(list2);
    }
}
