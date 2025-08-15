package accessModifiersPond.goose;
import accessModifiersPond.shore.Bird;
//creating subclass
public class Gosling extends Bird{
    public void swim(){
        floatInWater(); //calling protected in our subclass
        System.out.println(txt);
    }
}


