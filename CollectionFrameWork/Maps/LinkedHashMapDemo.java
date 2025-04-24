package CollectionFrameWork.Maps;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>(12, 0.7f, true);
        map.put("Aftab", 98);
        map.put("Shahzad", 76);
        map.put("Yaseen", 67);
        map.putIfAbsent("Bilal",89);
        Integer i = map.get("Bilal");
        Integer i1 = map.get("Aftab");
        System.out.println(i1);
        System.out.println(i);
        for(Map.Entry<String,Integer> e : map.entrySet()) {
            System.out.printf("{%s : %d}",e.getKey(),e.getValue());
            System.out.println();
        }
    }
}
