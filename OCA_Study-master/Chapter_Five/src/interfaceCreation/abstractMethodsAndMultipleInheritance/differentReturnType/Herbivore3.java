package interfaceCreation.abstractMethodsAndMultipleInheritance.differentReturnType;

public interface Herbivore3 {
    public static final String TYPE = "";
    public int eatPlants();
    public default void bebe(){
        System.out.println("bzzzz");
    }
    default int totalBees(){
        return 3;
    }}

interface Omnivore3{
    public void eatPlants();
}
/*class Bear3 implements Herbivore3, Omnivore3{
    public int eatPlants(){
        System.out.println("eating plants");
        return 10;
    }
    public void eatPlants(){
        System.out.println("eating plants");
    }
}does not compile bcs different return type but input param are the same*/
