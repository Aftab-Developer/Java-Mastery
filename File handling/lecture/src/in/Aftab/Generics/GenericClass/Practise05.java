package in.Aftab.Generics.GenericClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Practise05 {

    public static void main(String[] args) {
        System.out.println("hello");
        List<? super Integer > list = Arrays.asList(23, 45, 67);
        list.add(34);
        list.add(34);
        list.add(34);
        list.add(34);
        printList(list);

    }
    public static void printList(List<? super Integer  > list) {
        for (Object number : list) {
            System.out.print(number);
        }

    }

}
