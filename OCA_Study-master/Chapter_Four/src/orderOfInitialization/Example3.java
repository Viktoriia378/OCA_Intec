package orderOfInitialization;

public class Example3 {
    static {add(2);}
    static void add(int num){
        System.out.println(num + " ");
    }
    Example3(){add(5);}
    static {add(4);}
    {add(6);}
    static {new Example3();}
    {add(8);}
}
