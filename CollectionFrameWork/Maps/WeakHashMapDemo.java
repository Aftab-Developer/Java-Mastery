package CollectionFrameWork.Maps;

import java.util.WeakHashMap;

 class WeakHashMapDemo {
    public static void main(String[] args) {
/*     WeakHashMap is also a implementation of Map interface
       which include weak keys when the key have not the strong
       reference stored the will remove by JVM in the cycle of
       Garbage Collection event

 */
        WeakHashMap<String,Integer> weakHashMap = new WeakHashMap<>() ;
        weakHashMap.put(new String("Aftab"),78);
        weakHashMap.put(new String("Aftab"),90);
        weakHashMap.put(new String("Aftab"),87);
        weakHashMap.put(new String("Aftab"),67);
        System.gc();
        delay();
        System.out.println(weakHashMap);
//        Map is  empty because String values does not have Strong Reference

    }
    public static void delay() {
        try{
            Thread.sleep(10000);
        }catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
