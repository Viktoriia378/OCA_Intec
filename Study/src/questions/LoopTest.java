package questions;

public class LoopTest {
    public static void main(String[] args) {
        int i = 0;
        while(i++ < 5) {}
        System.out.println(i);

        int i1 = 3;
        while (++i1 < 7) {}
        System.out.println(i1);

        int a = 5;
        int b = a++;
        int c = ++a;
        System.out.println(b + ", " + c);

        int value = 10;
        Object obj = value < 10 ? "Small" : new StringBuilder("Large");
        System.out.println(obj);
    }
}
