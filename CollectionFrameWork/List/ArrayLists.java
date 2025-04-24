package CollectionFrameWork.List;

import java.util.*;

public class ArrayLists {
    public static  ArrayList<Integer> returnList() {
        ArrayList<Integer> arrayList = new ArrayList<>() ;
        arrayList.add(12);
        arrayList.add(89);
        arrayList.add(77);
        arrayList.add(1000);
        return  arrayList;
    }
    public static void main(String[] args) { 
//        Array list methods 
//        ArrayList<String> arrayList = new ArrayList<>() ;
//        List<String> list = Arrays.asList("Three", "four", "Five");
//        arrayList.add("Aftab") ;
//        arrayList.add("Aftab") ;
//        arrayList.add("Shahrzad ") ;
//        arrayList.addAll(list) ;
//        System.out.println(arrayList);
//        arrayList.removeIf(s -> s.length() > 4) ;
//        System.out.println(arrayList);
//        arrayList.forEach(System.out::println);
//        System.out.println(arrayList.size());
//        arrayList.set(0,"Akhter") ;
//        arrayList.forEach(System.out::println);

//        List to array
//         String[] strings = arrayList.toArray(new String[0]);
//        System.out.println(strings[0]); 
        
//        Arraylist with Comparator 
        ArrayList<Students> students = new ArrayList<>() ;
        students.add(new Students(18 ,"Aftab",1)) ;
        students.add(new Students(21 ,"Shahzad",2)) ;
        students.add(new Students(31 ,"Yaseen",3)) ;
        students.add(new Students(56 ,"Bilal",4)) ;
        students.add(new Students(67 ,"Zohaib",5)) ;
        System.out.println("Before Sorted");
        for(Students s :students ) {
            System.out.println(s);
        }
        System.out.println();
        System.out.println();
        System.out.println();

        System.out.println("After Sorted");
//        students.sort(Comparator.comparing(Students::getAge).reversed());
        students.sort((a,b) -> b.getAge() - a.getAge());
        for(Students s :students ) {
            System.out.println(s);
        }
    }

}

class Students {
    private Integer age ;
    private String name ;
    private Integer rollNumber ;
    Students(Integer age , String name , Integer rollNumber) {
        this.age = age ;
        this.rollNumber = rollNumber ;
        this.name = name ;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Students {" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", rollNumber=" + rollNumber +
                '}';
    }

    public Integer getAge() {
        return age;
    }

    public Integer getRollNumber() {
        return rollNumber;
    }
}
