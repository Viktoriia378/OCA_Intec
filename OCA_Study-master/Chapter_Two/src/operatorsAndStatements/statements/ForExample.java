package operatorsAndStatements.statements;

public class ForExample {
    //for(initialization; booleanExpression; updateStatement){Body}
    /*
    1->initialization statement executes
    2->if booleanExpression is true continue, else exit loop
    3->body executes
    4->execute updateStatements
    5->return to step 2
     */
    public static void main(String[] args) {
        for(int i = 0; i<10;i++){
            System.out.print(i + " ");
        }
        //for(;;){sout("Hello");} will work but its infinite loop
        //multiple terms to the for statements:
        int x = 0;
        for(long y = 0, z = 4; x < 5 && y < 10; x++, y++){
            System.out.print(x + "/");
            System.out.print(y + "/");
        }

        int a = 0;
        long b = 4;
        for(b =0, a = 2 ; a < 5 && b < 10; a++, b++){
            System.out.println(a);
        }

        for(int i=0; i<10 ; ) {
            i++;
            System.out.println("Hello World");
        }
        }

    }
