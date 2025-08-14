package classBuilding.constructor;

public class Chick {
    private String name = "Fluffy";
    {
        System.out.println("Setting the field " + name);
    } // instance initializer
    public Chick(){
        name = "Duke";
        System.out.println("I am a constructor and i ll change name to: ");
    }
    public void Chick(){

    }

    public static void main(String[] args) {
        Chick chick = new Chick();
        System.out.println(chick.name);
    }
}
