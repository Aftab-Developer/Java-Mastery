package in.Aftab.Generics.GenericClass;

interface Cal{
    void sum();
}
public class Practise03<T extends Number> implements Cal{
    T number1 ;
    T number2 ;
    public Practise03(T number1 , T number2){
        this.number1 = number1;
        this.number2 = number2;
    }
    @Override
    public void sum() {
        System.out.println(number1.intValue() + number2.intValue());

    }

    public static void main(String[] args) {
        Practise03<Integer> practise03 = new Practise03<>(20,20);
        practise03.sum();
    }
}
