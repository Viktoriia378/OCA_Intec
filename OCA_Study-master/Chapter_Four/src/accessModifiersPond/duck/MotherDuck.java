package accessModifiersPond.duck;

public class MotherDuck {
    //default - only classes in the package may access it
    String noise = "quack";
    void quack(){
        System.out.println(noise); //default is ok
    }
    private void makeNoise(){
        quack(); //default is ok
    }
}
