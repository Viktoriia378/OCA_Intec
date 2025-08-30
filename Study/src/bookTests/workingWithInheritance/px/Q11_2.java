package bookTests.workingWithInheritance.px;

public class Q11_2 implements I1, I2{
    public void m1() { System.out.println("Hello"); }
    public static void main(String[] args){
        Q11_2 tc = new Q11_2();
        ( (I1) tc).m1();
    }
}
interface I1{
    int VALUE = 1;
    void m1();
}
interface I2{
    int VALUE = 2;
    void m1();
}
