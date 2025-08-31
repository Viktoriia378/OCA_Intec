package bookTests.instanceOf;

class A {}
class B extends A {}
class C extends B {}
class D extends C {}

public class Q2 {
    public static void main(String[] args) {
        D d = new D();
        System.out.println(d instanceof A);
    }
}
