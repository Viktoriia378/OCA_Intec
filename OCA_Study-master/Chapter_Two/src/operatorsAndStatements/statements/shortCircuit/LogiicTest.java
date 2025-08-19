package operatorsAndStatements.statements.shortCircuit;

public class LogiicTest {
    public static void main(String[] args) {
        int x = 5;
        int y = 10;
        if(x > 5 && ++y > 10){ //if the first is false it will not check the second
            System.out.println("Inside");
        }else {
            System.out.println("Outside");
        }
        System.out.println("y = " + y);
    }
}
