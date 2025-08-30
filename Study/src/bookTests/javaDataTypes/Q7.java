package bookTests.javaDataTypes;

public class Q7 {
    public static void main(String[] args) {
        //Integer i = new Integer(42);
        //Long ln = new Long(42);
        //Double d = new Double(42.0);

        /*
        i == ln; This will fail at compile time
        ln == d; This will fail at compile time
        i.equals(d);
        d.equals(ln);
        ln.equals(42);Due to auto-boxing int 42 is converted into an Integer object containing 42. So this is valid.
        It will return false though because ln is a Long and 42 is boxed into an Integer.
The concept to understand here is as follows -
If the compiler can figure out that something can NEVER happen, then it flags an error.
In this question, the compiler knows that ln, i or d can never point to the same object in any case because
they are references to different classes of objects that have no relation ( superclass/subclass ) between themselves.
         */
    }
}
