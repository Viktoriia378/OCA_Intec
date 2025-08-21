package equals;

public class Example3 {
    public static void main(String[] args) {
        String s1 = "Java";
        String s2 = "Java ";
        String s3 = s1.trim();
        String s4 = s2.trim();

        System.out.println("s1: " + s1 + ", s2: " + s2 + ", s2: " + s2 + "s3: " + s3 + ", s4: " + s4);
        System.out.println("s1 == s2: " + (s1 == s2) );
        System.out.println("s1 == s3: " + (s1 == s3) );
        System.out.println("s1 == s4: " + (s1 == s4) );

        System.out.println("s2 == s3: " + (s2 == s3) );
        System.out.println("s2 == s4: " + (s2 == s4) );
        System.out.println("s3 == s4: " + (s3 == s4) );

        System.out.println("s1.equals(s2): " + s1.equals(s2));
        System.out.println("s1.equals(s3): " + s1.equals(s3));
        System.out.println("s1.equals(s4): " + s1.equals(s4));

        System.out.println("s2.equals(s3): " + s2.equals(s3));
        System.out.println("s2.equals(s4): " + s2.equals(s4));
        System.out.println("s3.equals(s4): " + s3.equals(s4));
    }
}
