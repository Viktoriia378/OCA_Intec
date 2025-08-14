package arrayList;

import java.util.*;

public class MethodSet {
    public static void main(String[] args) {
        //change one of the elements of the ArrayList without changing the size
        //E set (int index, E newElement)
        List<String> birds = new ArrayList<>();
        birds.add("hawk");
        System.out.println(birds.size());
        birds.set(0, "robin");
        System.out.println(birds.size());
        //birds.set(1, "robin"); //outOfBounds
    }
}
