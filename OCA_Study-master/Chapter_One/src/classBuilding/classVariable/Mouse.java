package classBuilding.classVariable;

public class Mouse {
    static int MAX_LENGTH = 5; //class variable
    int length = 5; //instance variable

    public void grow(int inches){
        if(length<=MAX_LENGTH){
            int newSize = length+inches; // local variable
            length = newSize;
            System.out.println(length);
        }
    }

    public static void main(String[] args) {
        Mouse mouse = new Mouse(); // our instance variable exists while our object exists
        int length = Mouse.MAX_LENGTH;
        System.out.println(length);
        mouse.grow(5);

    }
}
