package wrapperClasses;

public class Example {
    public static void main(String[] args) {
        //parseInt() - return a primitive
        //valueOf() - return a wrapper class
        //Character class does not participate in the parse/valueOf; we can call charAt
        int primitive = Integer.parseInt("123"); //converts a String to an int primitive
        Integer wrapper = Integer.valueOf("123"); // String to an Integer wrapper class

        //int bad1 = Integer.parseInt("a"); NumberFormatException
        //Integer bad2 = Integer.valueOf("123.45"); NumberFormatException

    }
}
