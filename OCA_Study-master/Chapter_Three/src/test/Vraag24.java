package test;

import java.util.Arrays;
import java.util.List;

public class Vraag24 {
    public static void main(String[] args) {
        String[] names = {"Tom", "Dick", "Harry"};
        List<String> list = Arrays.asList(names); //names.asList() WRONG
        list.set(0, "Sue");
        System.out.println(names[0]);
    }
}
