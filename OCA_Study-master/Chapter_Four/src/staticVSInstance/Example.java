package staticVSInstance;

public class Example {
    private static int one;
    private static final int two;
    private static final int three = 3;
    private static final int four;
    static{
        one = 1;
        one = 5;
        two = 2;
        //three = 3;
        four = 4;
        //two = 6;
    }

}
