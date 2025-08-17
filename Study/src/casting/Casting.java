package casting;

public class Casting {
    public void test() {
        System.out.println("A");
    }

}

class B extends Casting {
    public void test() {
        System.out.println("B");
    }
}

class C extends Casting {
    public void test() {
        System.out.println("C");
    }

    public static void main(String[] args) {
        Casting b1 = new Casting();
        Casting b2 = new C();

        b1 = (Casting) b2;
        //Casting b3 = (B) b2;
        b1.test();
        //b3.test();
    }
}