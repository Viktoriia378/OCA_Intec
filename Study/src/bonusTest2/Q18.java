package bonusTest2;

import java.util.*;

public class Q18 {
    public static void main(String[] args) {
        List difTypes = new ArrayList();
        difTypes.add("goldFish");
        difTypes.add(0, false);
        difTypes.add(1);
        difTypes.remove(1);
        boolean b1 = difTypes.contains("goldFish");
        //boolean b2 = difTypes.contains(new Boolean(false)); compiles
        boolean b3 = difTypes.contains(1);
        System.out.println(b1 + " " + b3 /*b2*/);
    }
}
