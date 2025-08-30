package bookTests.workingWithInheritance;

public class Q16 { }
class Sub extends Q16 {  }
class TestClassCasting{
    public static void main(String[] args){
        Q16 s1 = new Q16(); //1
        Sub s2 = new Sub();     //2
        s1 = s2;        //3
    }
}