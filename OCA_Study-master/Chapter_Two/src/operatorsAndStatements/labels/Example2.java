package operatorsAndStatements.labels;

public class Example2 {
    public static void main(String[] args) {
        // IT WORKS ONLY WITH FOR, WHILE, DO-WHILE
        //without label


        // outer loop will start again if it reached break of inner loop
        for(int i = 0; i < 5; i++){ // lines
            for(int j = 0; j < 5; j++){  //elements
                if(j==2) break; // only inside loop
                System.out.print(i + "-" + j + " ");
            }
            System.out.println();
        }
        System.out.println("----outerloop-----");

        //the whole loop will stop if we reached break of outer loop
        outerloop: for(int i2 = 0; i2 < 5; i2++){ //
            for(int j2 = 0; j2 < 5; j2++){
                if (j2 == 2) break outerloop; // only outer loop
                System.out.print(i2 + " " + j2);
            }
            System.out.println();
        }
    }
}
