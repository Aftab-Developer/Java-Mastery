package in.Aftab.Generics.GenericClass;


interface Animal<T> {
     void bark() ;
    T ReturnBark();
}

class Dog<T> implements Animal<T>{
    T bark;
    public Dog(T bark) {
        this.bark = bark;
    }
    @Override
    public void bark() {
        System.out.println(bark);
    }
    @Override
    public T ReturnBark() {
        return bark;
    }

    public static void main(String[] args) {
        Dog<String> dog = new Dog<>("Bhoww");
        dog.bark() ;
        System.out.println(dog.ReturnBark());
    }
}
