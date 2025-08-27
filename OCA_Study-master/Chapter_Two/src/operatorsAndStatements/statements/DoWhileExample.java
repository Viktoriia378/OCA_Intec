package operatorsAndStatements.statements;

public class DoWhileExample {
    public static void main(String[] args) {
        //do{Body} while(booleanExpression);
        int x = 0;
        do {
            x++;
        } while (false);
        System.out.println(x);
        //execute the statement block first, and then check the loop condition

        int y = 20;
        while(y>10){
            y--;
            System.out.println(y);
        }

        System.out.println("--------");
        int b = 20;
        if(b>10){
            do{
                b--;
                System.out.println(b);
            } while (b>10);
        }

        boolean keepGoing = true;
        int result = 15, i = 10;
        do {
             i--;
            if(i==8) keepGoing = false;
            result -= 2;
            } while(keepGoing);
        System.out.println(result);
        System.out.println("--------");
        int i1 = 0;
        do {
            System.out.println(i1);
            i1++;
        } while (i1 < 5);
        
    }
}
