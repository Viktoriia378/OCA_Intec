package bonusTest2;

public class Q9 {
    public static void main(String[] args) {
        String tiger = "Tiger";
        String lion = "Lion";
        //final String statement = 250 > 338 ? lion : tiger = " is Bigger";
        final String statement = 250 > 338 ? lion : (tiger = " is Bigger");
        System.out.println(statement);
    }
}

/*
The code does not compile, because the assignment operator has the highest order of precedence in this expression.
It may be helpful to see what the compiler is doing by adding optional parentheses:

final String statement = (250 ˃ 338 ? lion : tiger) = " is Bigger";
This expression is then reduced to:

final String statement = "Tiger" = " is Bigger";
This expression is invalid, as the left‐hand side of the second assignment operator is not a variable,
so the answer is option F. Note that if the question had added explicit parentheses
around the expression (tiger = " is Bigger"), option E would have the correct output.
 */

//The ternary operator ? : has lower precedence than the assignment operator =