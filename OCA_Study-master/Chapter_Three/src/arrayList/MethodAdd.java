package arrayList;

import java.util.*;

public class MethodAdd {
    public static void main(String[] args) {
       //boolean add(E element)
       //void add(int index, E element)

        ArrayList list = new ArrayList<>();
        list.add("hawk");
        list.add(Boolean.TRUE);
        System.out.println(list);
        //Type is object(does not include primitives)

        ArrayList<String> safer = new ArrayList<>();
        safer.add("sparrow");
        //safer.add(Boolean.TRUE); does not compile

        List<String> birds = new ArrayList<>();
        birds.add("hawk");
        birds.add(1,"robin");
        birds.add(0,"blue jay");
        birds.add(1,"cardinal");
        System.out.println(birds);
    }
}
