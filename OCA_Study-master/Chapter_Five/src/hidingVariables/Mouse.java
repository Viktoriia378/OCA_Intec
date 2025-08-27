package hidingVariables;

public class Mouse extends Rodent{
    public int tailLength = 8;
    public void getMouseDetails(){
        System.out.println("tail: " + tailLength + " parentTail " + super.tailLength);
    }
}
