package test;

public interface Frog {
    public static void eat(){}
}
class Cat implements Frog{
    public static void main(String[] args) {
        Frog frog = new Cat();
        Frog frog1 = new Dog();
    }
}
class Dog extends Cat{}
