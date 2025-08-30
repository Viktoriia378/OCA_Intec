package bookTests.workingWithInheritance;

class Baap{
    public int h = 4;
    public int getH(){
        System.out.println("Baap "+h); return h;
    }
}
public class Q15 extends Baap{
    public int h = 44;
    public int getH(){
        System.out.println("Beta "+h); return h;
    }
    public static void main(String[] args) {
        Baap b = new Q15();
        System.out.println(b.h+// это поле класса Baap (4)
                " "+b.getH());// вызывается метод класса Q15, потому что объект — Q15
        Q15 bb = (Q15) b;
        System.out.println(bb.h+" "+bb.getH());
    }
}
/*
Если метод, вызываемый внутри println(...), сам печатает в консоль,
то его System.out.println(...) выполнится до того, как println(...) выведет свою строку.
 */