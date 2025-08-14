package operatorsAndStatements.labels;

public class ForLabelExample {
    public static void main(String[] args) {
        int [][] list = {{1,12,3},{5,17,2},{4,2,9}};
        int searchValue = 2;
        int positionY = -1;
        int positionX = -1;

        PARENT_LABEL : for(int i = 0; i < list.length; i++){
            for(int j = 0; j<list.length; j++){
                if(list[i][j] == searchValue){
                    positionX = i;
                    positionY = j;
                    break PARENT_LABEL;
                }
            }
        }
        if(positionX == -1 || positionY == -1){
            System.out.println("Search value is not found");
        }else{
            System.out.println("Search value is found: " + positionX+ " " + positionY);
        }
    }
}
