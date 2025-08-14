package classBuilding.building_blocks;

public class DogThis {
    String name;

    public DogThis(String name){
        name = name; // we don't reach field of our class without this.
    }

    public void print(){
        System.out.println(name); // -> null
    }
}
