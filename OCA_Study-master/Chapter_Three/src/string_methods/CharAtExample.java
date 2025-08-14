package string_methods;

public class CharAtExample {
    public static void main(String[] args) {
        //char charAt(int index)

        String string = "animals";
        System.out.println(string);
        System.out.println(string.charAt(0));
        System.out.println(string.charAt(6));
        System.out.println(string.charAt(7));
        //if we want to check index of char that doesnt exist we ll have exception

    }
}
