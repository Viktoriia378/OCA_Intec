package accessModifiersPond.duck;

public class FatherDuck {
    //private - only code in the same class can call private methods or access private fields

    private String noise = "quack";
    private void quack(){
        System.out.println(noise); // private access is ok bcs we are in the same class
    }
    private void makeNoise(){
        quack(); //ok too
    }

}
