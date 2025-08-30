package bookTests.workingWithInheritance;

class Aa{
    final int fi = 10;
}
public class Q8 extends Aa{
    int fi = 15;
    public static void main(String[] args){
        Q8 b = new Q8();
        b.fi = 20;
        System.out.println(b.fi);
        System.out.println(((Aa) b).fi);
    }
}
