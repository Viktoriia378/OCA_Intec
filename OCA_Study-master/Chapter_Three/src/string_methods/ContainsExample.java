package string_methods;

public class ContainsExample {
    public static void main(String[] args) {
        //boolean contains(String str)
        String b = "Hello";
        System.out.println(b.contains("Hello"));
        System.out.println("abc".contains("b"));
        System.out.println("abc".contains("B"));
    }
}
