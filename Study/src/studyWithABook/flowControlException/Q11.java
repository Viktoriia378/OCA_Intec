package studyWithABook.flowControlException;

public class Q11 {
    public static void main(String[] args){
        Hor : for(int i = 0; i< 10; i++){
            for (int j = 0; j< 10; j++){
                if ( i+ j > 10 )  break Hor;
            }
            System.out.println(i + "hello");
        }
    }
}
