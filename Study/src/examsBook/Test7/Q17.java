package examsBook.Test7;

public class Q17 {
    public static void main(String args[]){
        for ( int i = 0 ; i < 3 ; i++){
            boolean flag  = false;
            switch (i){
                default : flag  = true;
            }
            if ( flag )  System.out.println( i );
        }
    }
}
//You cannot have unlabeled block of code inside a switch block. Any code block must succeed a case label (or default label).
// Since there is no case statement in this switch block, there is no way the line flag = true; can be reached! Therefore, it will not compile.