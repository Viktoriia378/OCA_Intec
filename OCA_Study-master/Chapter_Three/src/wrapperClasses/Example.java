package wrapperClasses;

public class Example {
    public static void main(String[] args) {
        //parseInt() - return a primitive
        //valueOf() - return a wrapper class
        //Character class does not participate in the parse/valueOf; we can call charAt
        String txt = "102";
        long ltxt = Long.parseLong(txt);
        System.out.println(ltxt);




        int primitive = Integer.parseInt("123"); //converts a String to an int primitive
        Integer wrapper = Integer.valueOf("123"); // String to an Integer wrapper class
        System.out.println(wrapper.toString());

        //int bad1 = Integer.parseInt("a"); NumberFormatException
        //Integer bad2 = Integer.valueOf("123.45"); NumberFormatException

        Integer a = 127;
        Integer b = 127;
        Integer c = 128;
        Integer d = 128;

        System.out.println(a==b);
        System.out.println(c==d); //bcs 128 objects will change
        System.out.println(c.equals(d));

    }
}
