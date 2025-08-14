package operatorsAndStatements.incrementAndDecrement;

public class Example {
    public static void main(String[] args) {
        int x = 3;
        int y = ++x * 5 / x-- + --x;
        System.out.println(x);
        System.out.println(y);

        int counter = 0;
        System.out.println(counter); //0
        System.out.println(++counter); //1
        System.out.println(counter); // 1
        System.out.println(counter--); //1
        System.out.println(counter); // 0
    }
}
