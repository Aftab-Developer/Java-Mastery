//import java.util.function.*;
import java.util.function.Consumer;

public class JavaFunctionalInterfaces {
    public static void main(String[] args) {
            // BiPredicate BiFunction BiConsumer

//        BiPredicate<String,String> biPredicate = (s1,s2) -> s1.equals(s2) ;
//        boolean test = biPredicate.test("Aftab", "Ah");
//        System.out.println(test);

//        BiFunction<String, String, Integer> biFunction = (s1, s2) -> s1.length() + s2.length();
//        Integer apply = biFunction.apply("Aftab", "Shahzad");
//        System.out.println(apply);
//
//        BiConsumer<String,String> biConsumer = (s1,s2) -> System.out.println(s1+s2) ;
//        BiConsumer<String, String> biConsumer1 = biConsumer.andThen((s3, s4) -> System.out.println(s3 + " Aftab" + s4));
//        biConsumer1.accept("AFtab","Bilal"); ;


    // Predicate Function Consumer Supplier

//        Predicate<Integer> isEven = (num) -> num % 2 == 0 ;
//        System.out.println( isEven.test(2));
//
//        Function<String , String> toUpperCase = (s) -> s.toUpperCase() ;
//        System.out.println(toUpperCase.apply("aftab"));
//
//        Consumer<String> consumer = (s) -> {
//            System.out.println(s.toLowerCase());
//        } ;
//        Consumer<String> stringConsumer = consumer.andThen((s) -> System.out.println(s));
//        stringConsumer.accept("AFtab");
//
//        Supplier<Integer> supplier  = () -> 55 ;
//
//        System.out.println(supplier.get());

//        Predicate<String> predicate = s -> s.length() == 3 ;
//        Predicate<String> af = predicate.and(s -> s.equals("Aft"));
//        System.out.println( af.test("Aft"));

    }
}
