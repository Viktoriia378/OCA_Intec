package studyWithABook.lambdaStringArrayListDateTime;

import java.util.ArrayList;

public class Q6 {
    public static void main(String[] args) throws Exception {
        ArrayList<String> al = new ArrayList<String>();
        al.add("111");
        al.add("222");
        System.out.println(al.get(al.size()));

    }
}
/*
It will throw an IndexOutOfBoundsException at run time.
size() method of ArrayList returns the number of elements. Here, it returns 2. Since numbering in ArrayList starts with 0.
al.get(2) will cause an IndexOutOfBoundsException to be thrown because only 0 and 1 are valid indexes for a list of size 2
 */