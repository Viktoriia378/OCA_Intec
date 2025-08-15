package accessModifiersPond.inland;
 //but wa can not reach protected if its in another package
import accessModifiersPond.shore.Bird;
public class BirdWatcherFromAfar {
    public void watchBird(){
        Bird bird = new Bird();
        //bird.floatInWater(); does not compile
    }
}
