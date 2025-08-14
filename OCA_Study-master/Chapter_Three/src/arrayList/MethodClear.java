package arrayList;

import java.util.ArrayList;
import java.util.List;

public class MethodClear {
    public static void main(String[] args) {
        //void clear()

        List<String> birds = new ArrayList<>();
        birds.add("hawk");
        birds.add("hawk");
        System.out.println(birds.isEmpty());
        System.out.println(birds.size());
        birds.clear();
        System.out.println(birds.isEmpty());
        System.out.println(birds.size());
    }
}
