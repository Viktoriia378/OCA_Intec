package gc;

public class GCExample {
    static GCExample ref;

    public static void main(String[] args) {
        GCExample a = new GCExample();
        GCExample b = new GCExample();
        a.ref = b;
        b.ref = a;
        a = null; //gc
        b = null; //gc

        GCExample a1 = new GCExample(); // Obj #1
        GCExample b1 = new GCExample(); // Obj #2

        ref = a1;

        a1 = null;
        b1 = null;

    }
    public static void someMethod(){
        GCExample c = new GCExample();
        ref = c;
    }
}
