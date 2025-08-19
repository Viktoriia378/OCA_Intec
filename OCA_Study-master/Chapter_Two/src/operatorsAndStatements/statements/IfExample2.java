package operatorsAndStatements.statements;

public class IfExample2 {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        if(a <= 5) // true
            if(b>5)//true
                System.out.println("Inside 1");
        else
                System.out.println("Inside 2");
        System.out.println("Outside"); //always

       /* if(true)
            int x = 5;
            we can not declare a variable without braces
        */
    }
}
