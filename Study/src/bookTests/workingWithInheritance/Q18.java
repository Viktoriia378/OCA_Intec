package bookTests.workingWithInheritance;

public class Q18 implements IInt{
    public static void main(String[] args){
        Q18 s = new Q18();  //1
        int j = s.thevalue;       //2
        int k = IInt.thevalue;    //3
        int l = thevalue;         //4
    }
}
interface IInt{
    int thevalue = 0;
}
/*
As a rule, fields defined in an interface are public, static, and final. The methods are public.
Here, the interface IInt defines thevalue and thus any class that implements this interface gets this field.
Therefore, it can be accessed using s.thevalue or just thevalue inside the class.
Also, since it is static, it can also be accessed using IInt.thevalue or Sample.thevalue.
 */