package bookTests.workingWithInheritance.px;
import bookTests.workingWithInheritance.p1.Movable;
import bookTests.workingWithInheritance.p2.Donkey;
public class TestClass {
    public static void main(String[] args) {
        Movable m = new Donkey();
        m.move(10);
        m.moveBack(20);
        System.out.println(m.location); //It will print 0 when TestClass is run

    }
}
/*
There is no problem with the code. All variables in an interface are implicitly public, static, and final.
All methods in an interface are public. There is no need to define them so explicitly.
Therefore, the location variable in Movable is public and static and the move() method is public.
Now, when you call m.move(10) and m.moveBack(20), the instance member location of Donkey is updated to 190 because
the reference m refers to a Donkey at run time and so move and moveBack methods of Donkey are invoked at runtime.
However, when you print m.location, it is the Movable's location (which is never updated) that is printed.
 */