package string_methods;

public class SubstringExample {
    public static void main(String[] args) {
        //int substring(int beginIndex)
        // int substring(int beginIndex, int endIndex)
        //throws exception
        String string = "animals";
        System.out.println(string.substring(3)); //mals
        System.out.println(string.substring(string.indexOf('m'))); //mals
        System.out.println(string.substring(3,4)); //m
        System.out.println(string.substring(3,7)); // mals
        System.out.println(string.substring(3,3));//empty

    }
}
