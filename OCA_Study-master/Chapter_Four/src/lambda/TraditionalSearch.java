package lambda;

import java.util.*;

public class TraditionalSearch {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal("Fish",false,true));
        animals.add(new Animal("kangaroo", true, false));
        animals.add(new Animal("rabbit",true,false));
        animals.add(new Animal("turtle", false,true));

        //print(animals, new CheckIfHopper());
        //lambda:
        print(animals, a -> a.isCanHop());
        System.out.println("Can swim: ");
        print(animals, a -> a.isCanSwim());
        System.out.println("Can not swim: ");
        print(animals, a -> ! a.isCanSwim());
    }
    private static void print(List<Animal> animals, CheckTrait checker){
        for(Animal animal : animals){
            if(checker.test(animal))
                System.out.println(animal + " ");
        }
        System.out.println();
    }
}
/*
 print(() -> true);                                       // 0 parameters
 print(a -> a.startsWith("test"));                        // 1 parameter
 print((String a) -> a.startsWith("test"));               // 1 parameter
 print((a, b) -> a.startsWith("test"));                   // 2 parameters
 print((String a, String b) -> a.startsWith("test"));     // 2 parameters
 */
/*
 print(a, b -> a.startsWith("test"));    ()                   // DOES NOT COMPILE
 print(a -> { a.startsWith("test"); });   return            // DOES NOT COMPILE
 print(a -> { return a.startsWith("test") }); ;        // DOES NOT COMPILE
 */
