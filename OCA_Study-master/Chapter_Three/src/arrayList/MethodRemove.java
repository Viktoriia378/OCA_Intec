package arrayList;

import java.util.*;

public class MethodRemove {
    public static void main(String[] args) {
        //remove the first matching value in the ArrayList or remove the element at a specified index

        //boolean remove(Object object) tell us if its remove
        //E remove (int index) the element that actually got removed

        List<String> birds = new ArrayList<>();
        birds.add("hawk");
        birds.add("hawk");
        System.out.println(birds.remove("cardinal")); //false
        System.out.println(birds.remove("hawk")); //true
        System.out.println(birds);
        System.out.println(birds.remove(0)); //prints hawk
        System.out.println(birds);
        //if index does not exist throws exception

    }
}
