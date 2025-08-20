package autoboxing;

import java.util.*;

public class ExampleOfAutoboxing {
    public static void main(String[] args) {
        List<Double> weights = new ArrayList<>();
        weights.add(50.5);
        //weights.add(new Double(60));//60.0 autoboxing
        weights.add(Double.valueOf(60));
        weights.remove(50.5);
        double first = weights.get(0);
        System.out.println(first);

        List<Integer> heights = new ArrayList<>();
        heights.add(null);
        //int h = heights.get(0); //NullPointerException

        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.remove(1);
        System.out.println(numbers); // 1
        //numbers.remove(new Integer(2));
        numbers.remove(Integer.valueOf(2));

        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.remove(10);  // Calls remove(int index), tries to remove element at index 10, which causes exception

    }
}
