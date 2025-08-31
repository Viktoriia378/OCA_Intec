package bookTests.instanceOf;

public class Q1 {
    public static void main(String[] args) {
        short s = 9;
        int i = 9; System.out.println(s == i);
        short s2 = 10;
        Short s3 = 10;
        int i2 = 10;
        Byte b = 10;
        Integer i3 = 9; System.out.println( s == i3 );
        //System.out.println(b==s3); does not compile Byte Short
        System.out.println(s2 == s3);
        System.out.println(i2 == s3);
        System.out.println(b.equals(s3));
        /*
        Any two numeric primitives can be compared using == operator.
Even a numeric primitive and a primitive wrapper (for example, an int with a Short or a Double) can be compared.
However, two wrappers of different types (for example, an Integer and a Short) cannot be compared using ==.
         */
    }
}
