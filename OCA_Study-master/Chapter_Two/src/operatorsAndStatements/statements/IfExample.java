package operatorsAndStatements.statements;

public class IfExample {
    public static void main(String[] args) {
        //it ll work only if true

        int hourOfDay = 10;

        if (hourOfDay >= 12) {
            System.out.println("have a good day");
        } else {
            System.out.println("Good morning");
        }

        //if(x) does not compile
        //if(x = 5)  does not compile
        int x = 4;
        long y = x * 4 - x++;
        if (y<10);
        else System.out.println("Just Right");
        }
    }

