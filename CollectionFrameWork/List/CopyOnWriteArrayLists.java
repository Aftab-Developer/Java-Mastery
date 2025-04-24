package CollectionFrameWork.List;

import java.util.Arrays;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayLists {
    public static void main(String[] args) {
        CopyOnWriteArrayList<String> s = new CopyOnWriteArrayList<>(Arrays.asList("Apple","Chiku","Banana")) ;

        for(String str : s) {;
            if(s.contains("Banana")) {
                s.remove("Banana");
                s.add("Grapes");
            }
            System.out.println(str);
        }
        System.out.println(s);
    }
}
