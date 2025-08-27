package polymorphism.virtualMethods;
/*
A virtual method is a method in which the specific implementation is not determined until runtime.
In fact, all non-final, non-static, and non-private Java methods are considered virtual methods,
since any of them can be overridden at runtime.
 */
public class Bird {
    public String getName(){
        return "Unknown";
    }
    public void info(){
        System.out.println("The bird name is: " + getName());
    }
}
class Peacock extends Bird{
    public String getName(){
        return "Peacock";
    }

    public static void main(String[] args) {
        Bird bird = new Peacock();
        bird.info();
    }
}
