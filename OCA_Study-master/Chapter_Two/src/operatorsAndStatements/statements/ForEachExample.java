package operatorsAndStatements.statements;

import java.util.*;

public class ForEachExample {
    //for(datatype instance->of collection member : collection -> iterable collection of objects) {Body}
    public static void main(String[] args) {
        final String[] names = new String[3];
        names[0] = "Lisa";
        names[1] = "Kevin";
        names[2] = "Roger";
        for (String name : names) {
            System.out.print(name + ", ");
            break; // the break statement on line 8 causes the loop to execute once and finish
        }
        /*
        for(int i = 0; names.length; i ++){
        String name = names[i]:
        sout(name + ", ");
         */

        List<String> names2 = new ArrayList<>();
        names2.add("Zhopka");
        names2.add("Vika");
        names2.add("Cezmi");

        for(int i = 0; i<names2.size(); i++){
            String name = names2.get(i);
            if(i>0){
                System.out.print(", ");
            }
            System.out.print(name);
        }
        /*for(String value : names2){
         *   System.out.print(value + " ");
        }*/

        /*
        for(List<Integer> i = names2.iterator(); i.hasNext();){
        int value = i.next();
        sout(value + " ");
         */
    }
}
