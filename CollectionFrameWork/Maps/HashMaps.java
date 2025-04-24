package CollectionFrameWork.Maps;

import java.util.HashMap;

public class HashMaps {
    public static void fun(Integer [] arr , HashMap<Integer,Integer> map) {
        for(int i = 0 ; i < arr.length ; i++) {
            if(map.containsKey(arr[i])) {
                map.put(arr[i] , map.get(arr[i] + 1)) ;
            }else{
                map.put(arr[i],1) ;
            }
        }
        Integer res = null ;
        for(Integer i : map.keySet()) {
                 if (map.get(i) > arr.length / 3) {
                     System.out.println(i);
                 }
        }
    }
    public static void main(String[] args) {
//        Dsa question on HashMap
        Integer[] array = {1,2} ;
        fun(array,new HashMap<>());




















//        HashMap<Integer ,String> map = new HashMap<>() ;
//        map.put(21,"Aftab");
//        map.put(31,"Bilal") ;
//        Set<Map.Entry<Integer, String>> entries = map.entrySet();
//        for(Map.Entry<Integer,String> en : entries) {
//            System.out.println(en.getKey() + " : " + en.getValue());
//        }
//        map.forEach((s,c) -> System.out.println(s+" : "+ " "+ c));
//        String s = map.get(21);
//        System.out.println(s);
    }
}
class  AftabKhan<T>{
    T in;

    public <A> AftabKhan() {

    }
    public static <S> void  getname() {

    }

}

interface Khan<F> {

}
