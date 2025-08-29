package studyWithABook.flowControlException;

public class Q3 {
    public static void main(String[] args) {
        int x = 0;
        //while (false) { x=3; }
        if (false) { x=3; }
        do{ x = 3; } while(false);
        for( int i = 0; i< 0; i++) x = 3;

    }
}
