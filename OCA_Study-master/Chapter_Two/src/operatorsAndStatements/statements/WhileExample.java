package operatorsAndStatements.statements;

public class WhileExample {
        //while ->keyword (booleanExpression) {Body} <- for block of multiple, optional for single
        int roomInBelly =5;
        public void eatCheese(int bitesOfCheese){
            while(bitesOfCheese>0 && roomInBelly > 0){
                bitesOfCheese--;
                roomInBelly--;
            }
            System.out.println(bitesOfCheese+"pieces of cheese left");
        }

    public static void main(String[] args) {
        int x = 1, y = 15;
        while (x < 10) {
            y--;
            x++;
        }
        System.out.println(x + ", " + y);

        int z = 1, sum = 0;
        while (z<=10){
            sum = sum + z;
            z++;
        }
        System.out.println(sum);
    }
    }
    /*
    while(false)
    int y = 3;
    we can not declare a variable without braces
     */

