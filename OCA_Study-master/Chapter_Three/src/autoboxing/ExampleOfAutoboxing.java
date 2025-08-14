package autoboxing;

import java.util.*;

public class ExampleOfAutoboxing {
    public static void main(String[] args) {
        List<Double> weights = new ArrayList<>();
        weights.add(50.5);
        weights.add(60.0);
        weights.remove(50.5);
        double first = weights.get(0);
        System.out.println(first);

        List<Integer> heights = new ArrayList<>();
        heights.add(null);
        int h = heights.get(0); //NullPointerException

        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.remove(1);
        System.out.println(numbers); // 1
        //numbers.remove(new Integer(2));

    }
}
