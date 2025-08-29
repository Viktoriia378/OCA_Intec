package studyWithABook.objectOrientation;

import java.util.Observable;
import java.util.Observer;

class A1 implements Runnable{
    @Override
    public void run() {}
}
class B1 extends A implements Observer{
    @Override
    public void update(Observable o, Object arg) {
    }
}
public class Q15 {
    public static void main(String[] args) {
        A1 a = new A1();
        B1 b = new B1();
        Object o = a; //A1 → Object
        Runnable r = (Runnable) o;//dawn casting
        //Here you are explicitly telling the compiler that o refers to an object that is Runnable
        Object o1 = b;
        Runnable r1 = (Runnable) b;
        /*
        Since b is declared of a type that indirectly implements Runnable,
        the compiler can figure out that b will always point to an object that is assignable to a Runnable.
        Therefore, explicit cast is not required here. It will still work fine with the explicit cast though
         */
    }
}
