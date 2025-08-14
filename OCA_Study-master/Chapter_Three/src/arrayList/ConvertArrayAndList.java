package arrayList;

import java.util.*;

public class ConvertArrayAndList {
    public static void main(String[] args) {
        //ArrayList into an Array
        List<String>list = new ArrayList<>();
        list.add("hawk");
        list.add("robin");
        Object[] objectArray = list.toArray();
        System.out.println(objectArray.length);
        String[] stringArray = list.toArray(new String[0]);
        System.out.println(stringArray.length);
        //Array to a List

        String[] array = {"hawk", "robin"};
        List<String> list1 = Arrays.asList(array); //backed version of the List
        System.out.println(list.size());
        list.set(1, "test");
        array[0] = "new";
        for(String b : array) System.out.println(b + " ");
        list.remove(1); //throws UnsupportedOperation Exception
        //we are not allowed to change the size of the list
    }
}
