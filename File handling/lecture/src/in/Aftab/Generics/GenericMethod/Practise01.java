package in.Aftab.Generics.GenericMethod;

//public class Practise01<T extends Number> {
//    T value ;
//    T value2 ;
//    public Practise01(T value1 , T value2){
//        this.value = value1 ;
//        this.value2 = value2 ;
//    }
//    public <N extends Integer> void sum(N value3) {
//        System.out.println(this.value.intValue() + this.value2.intValue()+value3.intValue() );
//    }
//
//    public static void main(String[] args) {
//        Practise01<Double> practise01 = new Practise01<>(23.89,23.6) ;
//        practise01.sum(4);
//    }
//}

public class Practise01 {

    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Hello from thread");
        });
        thread.start();
    }

}
