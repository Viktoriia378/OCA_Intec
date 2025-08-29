package studyWithABook.lambdaStringArrayListDateTime;

import java.util.ArrayList;
import java.util.List;

public class Q9 {
    public static void main(String[] args) {
        List s1 = new ArrayList( );
        try{
            while(true){
                s1.add("sdfa");
            }
        }catch(RuntimeException e){
            e.printStackTrace();
        }
        System.out.println(s1.size());
    }
}
/*
It will throw a java.lang.OutOfMemoryError. Note that this is not a subclass of RuntimeException or even Exception.
It is a subclass of java.lang.Error.
 */