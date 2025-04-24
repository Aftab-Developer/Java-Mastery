package in.Aftab.Generics.GenericClass;

public class MyException extends Exception{
    public MyException(String err) {
        super(err);
    }
    public static Boolean b = false ;
    public static void shoeException() throws MyException {
        if(b){
            System.out.println("hello");
        }
        throw new MyException("b should be true");
    }

    public static void main(String[] args) throws MyException {
        shoeException();
    }
}
