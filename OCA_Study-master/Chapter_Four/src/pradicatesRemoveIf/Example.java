package pradicatesRemoveIf;

import java.util.*;
/*
Predicate interface into some existing classes. There is only
one you need to know for the exam.
ArrayList declares a removeIf() method
 */
public class Example {
    public static void main(String[] args) {
        List<String> bunnies = new ArrayList<>();
        bunnies.add("Long ear");
        bunnies.add("Floppy");
        bunnies.add("hoppy");
        System.out.println(bunnies);
        bunnies.removeIf(s -> s.charAt(0) != 'h');
        System.out.println(bunnies);
    }
}
