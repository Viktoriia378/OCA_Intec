package bonusTest1;

public class Q10 {
    public Q10(){
        System.out.println("1");
    }
}
class Bee extends Q10{
    public Bee(int age){
        System.out.println("2");
    }
    public Bee(){
        this(5);
        System.out.println("3");
    }

    public static void main(String[] args) {
        Q10 bee = new Bee();
    }
}
