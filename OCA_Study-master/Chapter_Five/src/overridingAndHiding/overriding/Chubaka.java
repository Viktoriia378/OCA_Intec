package overridingAndHiding.overriding;

public class Chubaka {
    public boolean isSleepy(){
        return false;
    }
    public void getInfoChubaka(){
        System.out.println("Sleeping: " + isSleepy());
    }
}
