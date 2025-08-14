package arrayList;

import java.util.*;

public class MethodIsEmptyAndSize {
    public static void main(String[] args) {
        //look at how many of the slots are in use
        //boolean isEmpty()
        //int size()
        List<String> birds = new ArrayList<>();
        birds.add("hawk");
        System.out.println(birds.size());
        birds.set(0, "robin");
        System.out.println(birds.size());
        System.out.println(birds.isEmpty());
    }
}
