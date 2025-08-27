package abstractClass;

public abstract class Animal {
    public static final int num = 10;
    protected int age;
    public void eat(){
        System.out.println("Animal is eating");
    }
    public abstract String getName(); //without body
}
