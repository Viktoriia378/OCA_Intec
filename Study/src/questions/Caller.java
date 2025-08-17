package questions;

public class Caller {
    private void init(){
        System.out.println("Initialized");
    }
    private void start (){
        init();
        System.out.println("started");
    }
}
/*public class TestCall{
    public static void main(String[] args) {
        Caller c = new Caller();
        c.start();
        c.init();
    }
}
its not in the same class so we can not reach private method
*/