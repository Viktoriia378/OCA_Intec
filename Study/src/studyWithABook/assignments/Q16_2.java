package studyWithABook.assignments;

public class Q16_2 {
    public static void main(String[] args) {
        String[][] matrix = new String[2][2];
        matrix[0][0] = "petrol";
        matrix[1][0] = "diesel";
        matrix[0][1] = "manual";
        matrix[1][1] = "auto";
        for(int i = 0; i<2; i++) {
            for(int j = 0; j<2; j++){
                System.out.print(matrix[j][i]+":");
            }
        }
    }
}
