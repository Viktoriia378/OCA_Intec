package operatorsAndStatements.statements;

public class TernaryOperation {
    public static void main(String[] args) {
        //booleanExpression ? expression1 : expression2
        int x2 = 5;
        System.out.println(x2 >2 ? x2 < 4 ? 10 : 8 : 7);


        int y = 10;
        final int x;
        if (y < 5) {
            x = 2 * y;
        } else {
            x = 3 * y;
        }

        int a = 10;
        int b = (a<5) ? (2*a) : (3*a);
        System.out.println(b);
        //int difTypes = (y < 91) ? 9 : "Horse"; does not compile

        System.out.println((y>5) ? 21 : "Zebra"); //but here it compiles

        int num1 = 1;
        int num2 = 2;

        final int result = num1 > 10 ? num1++ : num2++;
        System.out.println(num1+ "," +num2);
    }
}
