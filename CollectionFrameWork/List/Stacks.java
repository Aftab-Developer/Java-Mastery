package CollectionFrameWork.List;

import java.util.Arrays;
import java.util.Stack;

public class Stacks {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(12);
        stack.push(56);
        stack.push(92);
        stack.push(78);
        System.out.println(stack);
        System.out.println(stack.peek());
        Integer last = stack.getLast();
        Integer first = stack.getFirst();
        System.out.println(last);
        System.out.println(first);
        stack.forEach(System.out::println);
        Integer i = stack.get(3);
        System.out.println(i);
        boolean remove = stack.remove(Integer.valueOf(78));
        System.out.println(remove);
        System.out.println("Answer");
        System.out.println(stack.search(12));
        stack.addAll(Arrays.asList(234,657,787,809));
        System.out.println(stack);
    }
}
