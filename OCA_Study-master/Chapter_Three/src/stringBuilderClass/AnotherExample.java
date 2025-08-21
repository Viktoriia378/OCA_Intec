package stringBuilderClass;

public class AnotherExample {
    public static void main(String[] args) {

        StringBuilder builder = new StringBuilder(5);
        String txt = "";
        System.out.println(builder.equals(txt));
        System.out.println(builder.toString().equals(txt));
    }
}
