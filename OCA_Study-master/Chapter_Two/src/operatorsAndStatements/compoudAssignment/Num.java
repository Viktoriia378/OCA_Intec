package operatorsAndStatements.compoudAssignment;

public class Num {
    public static void main(String[] args) {
        int x = 2, z = 3;
        //x = x * z;
        x *= z;
        System.out.println(x);

        long y = 10;
        int k = 5;
        // k = k * y; does not compile
        k *= y; // good
        //k = (int) (k * y); // also good
        System.out.println(k);

        long a = 5; //output 3
        long b = (a=3); // also 3
        System.out.println(a);
        System.out.println(b);
        //(a=3) -> it sets the value of the variable a to be 3; and it returns a value of the assignment, witch is also 3
    }
}
