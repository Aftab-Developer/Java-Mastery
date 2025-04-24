package CollectionFrameWork.Maps;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRU_Cache<K,V> extends LinkedHashMap<K,V> {
    private int capacity ;
    public LRU_Cache(int capacity) {
        super(capacity,0.7f,true) ;
        this.capacity = capacity ;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return size() > capacity ;
    }

    public static void main(String[] args) {
        LRU_Cache<String ,Integer> map = new LRU_Cache<>(3) ;
        map.put("Aftab",90);
        map.put("Shahzad",80);
        map.put("Yaseen",70);
        map.get("Aftab");
        map.put("Bilal",60);
        System.out.println(map);

    }
}
