package in.Aftab.Generics.GenericClass;

interface Concat<T> {
    String concat(T string) ;

}
public class Practise04<T extends Object> implements Concat<T> {
    @Override
    public String concat(T stringOrNum) {
       return "" + stringOrNum;
    }

    public static void main(String[] args) {
        Practise04<Integer> practise04 = new Practise04<>();
       String ans =  practise04.concat(9);
        System.out.println(ans+4);


    }
}

