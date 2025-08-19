package operatorsAndStatements.statements.shortCircuit;

public class TernaryOperatorExample {
    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        boolean result = ++a * 2 == b++ + 1 && a++ == 4;
        System.out.println(result);
    }
}
