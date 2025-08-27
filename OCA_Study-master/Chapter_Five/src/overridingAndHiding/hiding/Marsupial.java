package overridingAndHiding.hiding;

public class Marsupial {
    public static boolean isBiped(){
        return false;
    }
    public void getMarsupialDescription(){
        System.out.println("walk on two legs: " + isBiped());
    }
}
