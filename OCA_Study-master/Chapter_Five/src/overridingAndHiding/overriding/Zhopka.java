package overridingAndHiding.overriding;

public class Zhopka extends Chubaka{
    public boolean isSleepy(){
        return true;
    }

    public void getInfoZhopka() {
        System.out.println("Sleepy: " + isSleepy());
    }
}
