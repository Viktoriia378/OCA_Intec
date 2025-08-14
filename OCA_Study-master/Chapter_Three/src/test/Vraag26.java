package test;

import java.util.ArrayList;
import java.util.List;

public class Vraag26 {
    public static void main(String[] args) {
        List<Integer> ages = new ArrayList<>();
        ages.add(Integer.parseInt("5")); //Autoboxing from int to Integer
        ages.add(Integer.valueOf("6")); //
        ages.add(7); //Autoboxing
        ages.add(null); //in the end shows exception
        for(int age : ages) System.out.println(age); //compiles thn exception
    }
}
