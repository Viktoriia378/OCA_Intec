package bonusTest2;

public class Q5 {
    public static void main(String[] args) {
        StringBuilder b = new StringBuilder("1");
        StringBuilder c = b.append("2");
        b.append("234");
        System.out.println("Equals? " + (b == c));
        System.out.println(b.equals(c));
        System.out.println(b);
        System.out.println(c);

        StringBuilder sb1 = new StringBuilder("hello");
        StringBuilder sb2 = new StringBuilder("hello");

        System.out.println(sb1 == sb2);      // false (different objects)
        System.out.println(sb1.equals(sb2)); // false (still false — default equals)
    }
}
