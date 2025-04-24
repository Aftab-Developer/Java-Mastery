package in.Aftab.Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class ArrayLists {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>(Arrays.asList("Aftab","Shahzad")) ;
        

//        Example of Comparator using Array List
//        ArrayList<Student> list = new ArrayList<>();
//        list.add(new Student("Aftab", 3.5));
//        list.add(new Student("Shahzad", 3.8));
//        list.add(new Student("Yaseen", 3.9));
//        Comparator<Student> comparator = Comparator.comparing(Student::getGpa)
//                .reversed().thenComparing(Student::getName);
//        list.sort(comparator);
//        list.forEach(s -> System.out.println(s.getName() + "   " + s.getGpa()));

//        Array list methods
//        Important points
//        default capacity 10
//        grows 1.5
//         add remove clear set contains sort get removeAll removeIf
    }
}

class Student {
    private String name;
    private Double gpa;

    public Student(String name, Double gpa) {
        this.name = name;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public Double getGpa() {
        return gpa;
    }


}