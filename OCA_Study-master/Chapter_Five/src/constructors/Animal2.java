package constructors;

public class Animal2 {
    private int age;
    private String name;
    public Animal2(int age, String name){
        super(); //java.lang.Object,
        this.age = age;
        this.name = null;
    }
    public Animal2(int age){
        super();
        this.age = age;
        this.name = null;
    }

}
