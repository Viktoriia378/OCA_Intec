package orderOfInitialization;
//1-superclass
//2-static variable declaration and static initializers - outvoer 1 time
//3-instance variable declaration and instance initializers
//4-constructor
public class Example1 {
    private String name = "Torchie";
    {
        System.out.println(name);
    }
    private static int COUNT = 0;
    static{
        System.out.println(COUNT);
    }
    static {
        COUNT += 10;
        System.out.println(COUNT);
    }
    public Example1(){
        System.out.println("constructor");
    }
}
