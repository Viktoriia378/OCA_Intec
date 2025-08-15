package accessModifiersPond.swan;
import accessModifiersPond.shore.Bird;
public class Swan extends Bird{
    public void swim(){
        floatInWater(); //package access to superclass
        System.out.println(txt);
    }
    public void helpOtherSwanSwim(){
        Swan other = new Swan();
        other.floatInWater();
        System.out.println(other.txt);
    }
    public void helpOtherBirdSwim(){
        Bird other = new Bird();
        //other.floatInWater; does not compile bcs we use Bird like a reference - Bird in a different package
        //System.out.println(other.txt);
    }
}
