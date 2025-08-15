package accessModifiersPond.duck;

//now adding another class
public class BadDuckling{
    public void makeNoise(){
        FatherDuck duck = new FatherDuck();
        //duck.quack(); //does not compile bcs our fields are private and we can not use it in another class
        //System.out.println(duck.noise);//does not compile
    }
}
