package equals;

public class Example2 {
    public static void main(String[] args) {
        String s = new String("hello");
        StringBuilder sb = new StringBuilder("hello");
        if (s == sb.toString()) System.out.print("1");
        if (s.equals(sb.toString())) System.out.print("2");
    }
}
