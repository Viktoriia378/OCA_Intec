package string_methods;

import java.util.Locale;

public class MethodChainingExample {
    public static void main(String[] args) {
        String start = "Animal   ";
        String trimmed = start.trim(); //Animal without space
        String lowerCase = trimmed.toLowerCase(); // animal
        String result = lowerCase.replace('a', 'A');
        System.out.println(result);

        String a ="abc";
        String b = a.toUpperCase();
        b = b.replace("B","2").replace('C', '3');
        System.out.println("a=" + a);
        System.out.println("b=" + b);
    }
}
