package string_methods;

public class StartsWithAndEndsWith {
    public static void main(String[] args) {
        //boolean startsWith(String prefix)
        //boolean endsWith(String suffix)

        System.out.println("abc".startsWith("a"));
        System.out.println("abc".startsWith("A"));
        System.out.println("abc".endsWith("c"));
        System.out.println("abc".endsWith("a"));
    }
}
