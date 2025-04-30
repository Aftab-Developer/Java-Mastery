
package CollectionFrameWork.Maps;
import java.util.* ;
public class IdentityHashMapDemo {
    public static void main(String[] args) {
        /*
        Identity hash map uses the hash function of te Object class
        the hashcode in the object class based on the memory address
        on the basis of hashCode the identity hash map behaves
         */
       IdentityHashMap <String,Integer> map = new IdentityHashMap<>() ;
       map.put("Aftab",90) ;
       map.put(new String("Aftab"),99);
        System.out.println(map);
    }
}
