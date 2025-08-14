package string_methods;

public class ReplaceExample {
    public static void main(String[] args) {
        //String replace(char oldChar, char newChar)
        //String replace(CharSequence oldChar, CharSequence newChar)

        System.out.println("abcabc".replace('a', 'A')); //AbcAbc
        System.out.println("abcabc".replace("a", "A")); //AbcAbc
    }
}
