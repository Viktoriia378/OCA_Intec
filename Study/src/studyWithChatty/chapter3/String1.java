package studyWithChatty.chapter3;

public class String1 {
    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        String x = "Java";
        System.out.println(a + b + x + a * b);

        String s = "code";
        StringBuilder sb = new StringBuilder("code");
        System.out.println(s.equals(sb));
        System.out.println(sb.toString().equals(s));
    }
}
