package operatorsAndStatements.equalityOperators;

public class Example {
    public static void main(String[] args) {
       //example of mixing assignment
        boolean x = true, z = true;
        int y = 20;
        x = (y != 10) ^ (z=false);
        System.out.println(x+", "+y+", "+z);

       boolean y1 = false;
       boolean x1 = (y1 = true);
        System.out.println(x1);
        System.out.println(y1);

        // for object comparison, the equality operator is applied to the references to the objects, not the objects they point to
        //two references are equal if and only if they point to the same object, or both point to null

        String a = new String("bebe");
        String b = new String("bebe");
        String c = a;
        int bb = 5;
        System.out.println(a.equals(bb));
        System.out.println(a == b); //false
        System.out.println(a == c); // true point to the same object
        System.out.println(a.equals(b)); // true bcs the same txt

        /*int x2 = 0;
        String s = null;
        if(x2 == s) System.out.println("Success"); //we can not check different datatypes
        else System.out.println("Failure");
        */
    }
}
