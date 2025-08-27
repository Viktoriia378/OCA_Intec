package constructors;

public class Zebra extends Animal2{
    public Zebra(int age){
        super(age);//Animal’s constructor
    }
    public Zebra(){
        this(4);
    }
}
