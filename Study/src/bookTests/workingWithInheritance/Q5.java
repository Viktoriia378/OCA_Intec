package bookTests.workingWithInheritance;

interface I{
}
class A implements I{
    A(){}
    public void  print(){ System.out.println("A"); }
}

class B extends A {
    B(){ }
    public void  print(){ System.out.println("B"); }
}

class C extends B{
}
public class Q5 {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        a = (B)(I)b;
        new B();
    }
}
