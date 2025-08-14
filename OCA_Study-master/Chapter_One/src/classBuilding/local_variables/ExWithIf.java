package classBuilding.local_variables;

public class ExWithIf {
    int y; //default 0
    public void findAnswer(boolean check){
        int answer;
        int onlyOneBranch;

        if(check){
            onlyOneBranch= 1;
            answer = 1;
        } else {
            answer = 2;
        }
        System.out.println(answer);
        /*System.out.println(onlyOneBranch);
        * does not compile bcs here is a chance for false but we didn't initialize
         */
    }

    public static void main(String[] args) {
        ExWithIf ex = new ExWithIf();
        int x = 1;
        System.out.println(ex.y + x); //default from instance variable

    }
}
