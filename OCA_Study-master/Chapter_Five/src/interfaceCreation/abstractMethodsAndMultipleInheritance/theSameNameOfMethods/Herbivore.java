package interfaceCreation.abstractMethodsAndMultipleInheritance.theSameNameOfMethods;

public interface Herbivore {
    public void eatPlants();
}
interface Omnivore{
    public void eatPlants(); //its okay
    public void eatMeat();
}
class Bear implements Herbivore,Omnivore{
    public void eatMeat(){
        System.out.println("eating meat");
    }
    public void eatPlants(){
        System.out.println("eating plants");
    }
}
