package interfaceCreation.abstractMethodsAndMultipleInheritance.differentParameters;

public interface Herbivore2 {
    public int eatPlants(int quantity);
}
interface Omnivore2 {
    public void eatPlants();
}
class Bear2 implements Herbivore2, Omnivore2{
    public int eatPlants(int quantity){
        System.out.println("eating plants " + quantity);
        return quantity;
    }
    public void eatPlants(){
        System.out.println("Eating plants");
    }
}
