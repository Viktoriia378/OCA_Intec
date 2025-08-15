package accessModifiersPond.shore;
 //and also protected can reach classes that in the same package like default
public class BirdWatcher {
    public void watchBird(){
        Bird bird = new Bird();
        bird.floatInWater(); //calling protected
        System.out.println(bird.txt);
    }
}
