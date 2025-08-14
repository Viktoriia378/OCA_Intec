package arrayList;

import java.util.*;

public class MethodContains {
    public static void main(String[] args) {
      //boolean contains(Object object)

      List<String> birds = new ArrayList<>();
      birds.add("hawk");
        System.out.println(birds.contains("hawk"));
        System.out.println(birds.contains("robin"));

        //the method calls equals(); String implements equals()


    }
}
