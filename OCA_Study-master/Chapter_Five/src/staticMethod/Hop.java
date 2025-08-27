package staticMethod;

public interface Hop {
    static int getJumpHeight(){
        return 8;
    }
}
class Bunny implements Hop{
    public void printDetails(){
        //System.out.println(getJumpHeight());
        System.out.println(Hop.getJumpHeight());
    }
}
