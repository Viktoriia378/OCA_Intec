package bookTests.javaDataTypes;

public class Q1 {
    private static int loop = 15 ;
    static final int INTERVAL = 10 ;
    boolean flag ;
    static{
        System.out.println("Static");
    }
    static {loop = 1;}
    static {loop += INTERVAL;}
    {flag = true; loop = 0;}
}
