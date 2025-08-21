package stringBuilderClass;

public class Example {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        StringBuilder builder1 = builder;
        System.out.println(builder1 == builder);
    }
}
