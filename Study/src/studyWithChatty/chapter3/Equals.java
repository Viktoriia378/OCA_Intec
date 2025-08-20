package studyWithChatty.chapter3;

public class Equals {
    public static void main(String[] args) {
        String s1 = "Java";
        String s2 = s1.concat(" SE");
        StringBuilder sb = new StringBuilder("Java");
        sb.append(" SE");

        System.out.println(s1 == s2);       // false - because concat() returns a new object
        System.out.println(s2.equals(sb));  // false - different types.
        System.out.println(sb.toString().equals(s2));  // true
    }
}
