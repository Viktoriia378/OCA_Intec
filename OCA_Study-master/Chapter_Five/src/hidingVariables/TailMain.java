package hidingVariables;

public class TailMain {
    public static void main(String[] args) {
        Mouse mouse = new Mouse();
        mouse.getRodentDetails();
        mouse.getMouseDetails();
        System.out.println(mouse.tailLength); //8 field hiding
    }
}
