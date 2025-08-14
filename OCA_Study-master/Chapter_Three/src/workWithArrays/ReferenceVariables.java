package workWithArrays;

import java.util.Arrays;

public class ReferenceVariables {
    public static void main(String[] args) {
        String [] bugs = {"cricket", "beetle", "ladybug"};
        String[] alias = bugs;
        System.out.println(bugs.equals(alias)); //true;  does not look at the elements of the array
        System.out.println(Arrays.toString(bugs));

        String[] strings = {"stringValue"};
        Object[] objects = strings;
        String[] againStrings = (String[]) objects;
        //againStrings[0] = new StringBuilder(); //does not compile; stringbuilder is not a string - only string objects
        //objects[0] =  new StringBuilder(); //careful; in runtime throws ArrayStoreException
    }
}
