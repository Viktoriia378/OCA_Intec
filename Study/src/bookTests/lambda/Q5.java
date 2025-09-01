package bookTests.lambda;

import java.util.*;
import java.util.function.Predicate;

public class Q5 {
    public static boolean checkList(List list, Predicate<List> p) {
        return p.test(list);
    }

    public static void main(String[] args) {
        boolean b = checkList(new ArrayList(), al -> al.isEmpty());
        System.out.println(b);
        /*
        The test method of Predicate returns a boolean. So all you need for your body part in your
        lambda expression is an expression that returns a boolean.
isEmpty() is a valid method of ArrayList, which returns true if there are no elements in the list.
Therefore, al.isEmpty() constitutes a valid body for the lambda expression in this case.
         */
        boolean b2 = checkList(new ArrayList<>(), al-> al.add("hello"));
        System.out.println(b2);
        /*
        The add method of ArrayList returns a boolean. Further, it returns true if the list is altered
        because of the call to add. In this case, al.add("hello") indeed alters the list because a new element is added to the list.
         */
    }
}
