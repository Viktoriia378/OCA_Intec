package accessModifiersPond.duck;

public class GoodDuckling {
    public void makeNoise(){
        MotherDuck duck = new MotherDuck();
        duck.quack(); //default
        System.out.println(duck.noise); //bcs in the same package
    }
}
