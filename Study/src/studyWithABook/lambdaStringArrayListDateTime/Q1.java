package studyWithABook.lambdaStringArrayListDateTime;

public class Q1 {
    public static void main(String[] args) {
    System.out.println("12345".charAt(6));
    /*
    As per the API documentation of this method ( http://docs.oracle.com/javase/6/docs/api/java/lang/String.html#charAt(int) ),
    this method throws IndexOutOfBoundsException. Although, in practice the method throws StringIndexOutOfBoundsException,
    which is a subclass of IndexOutOfBoundsException, the implementation is free to throw some other subclass of IndexOutOfBoundsException.
    Thus, you should rely only on the published API documentation instead of what it actually throws.
     */
}}
