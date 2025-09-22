package wrapperClasses;

public class Example {
    public static void main(String[] args) {
        //parseInt(String) - return a primitive
        //valueOf(String or primitive) - return a wrapper class; for Long, Float -> L and F are important
        //Используется valueOf, когда тебе нужен объект, а не примитив — например, для коллекций (List<Long>, Map<Long, ...>) или работы с null.
        //Character class does not participate in the parse/valueOf; we can call charAt
        String txt = "102";
        long ltxt = Long.parseLong(txt);
        System.out.println(ltxt);




        int primitive = Integer.parseInt("123"); //converts a String to an int primitive
        Integer wrapper = Integer.valueOf("123"); // String to an Integer wrapper class
        System.out.println(wrapper.toString());

        //int bad1 = Integer.parseInt("a"); NumberFormatException
        //Integer bad2 = Integer.valueOf("123.45"); NumberFormatException

        // ==
        Integer a = 127;
        Integer b = 127;
        Integer c = 128;
        Integer d = 128;
        Float a1 = 127F;

        System.out.println(a1 == 127F);
        System.out.println(a==b);
        System.out.println(c==d); //bcs 128 objects will change
        System.out.println(c.equals(d));

        Integer num = Integer.valueOf(1);
        Long num2 = Long.valueOf(1);
        System.out.println(num2.equals(num)); //always false
        //System.out.println(num == num2); does not compile

        //equals
        Integer numWrapper = 2;
        Integer numWrapper2 = 2;
        int numPrem = 2;
        long numPrem2 = 2;
        System.out.println(numWrapper.equals(numPrem2));
        System.out.println(numWrapper2.equals(numWrapper)); //true for the same Wrapper classes but will be always false for dif wrap classes

        /*Signature of equals method is : boolean equals(Object o); So it can take any object.
        The equals methods of all wrapper classes first check if the two object are of same class or not.
        If not, they immediately return false. Hence it will print not equal.*/

    }
}
