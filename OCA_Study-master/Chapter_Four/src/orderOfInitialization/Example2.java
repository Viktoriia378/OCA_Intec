package orderOfInitialization;

public class Example2 {
    private String name = "Torchie";
    {
        System.out.println(name);
    }
    private static int COUNT = 0;
    static {
        System.out.println(COUNT);
    }
    {COUNT++;
        System.out.println(COUNT);}
    public Example2(){
        System.out.println("constructor");
    }

    public static void main(String[] args) {
        System.out.println("read");
    }
}
