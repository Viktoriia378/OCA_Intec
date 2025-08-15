package accessModifiersPond.swan;
 import accessModifiersPond.duck.MotherDuck;
public class BadCygnet {
    public void makeNoise(){
        MotherDuck duck = new MotherDuck();
        //duck.quack(); does not compile bcs its default access - we are not in the same package
    }
}
