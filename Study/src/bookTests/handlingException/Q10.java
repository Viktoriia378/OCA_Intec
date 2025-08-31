package bookTests.handlingException;

class MyException extends Exception {}
public class Q10 {
    public static void main(String[] args){
        Q10 tc = new Q10();
        try{
            tc.m1();
        }
        catch (MyException e){
            //tc.m1(); It will not compile because of unhandled exception
        }
        finally{
            tc.m2();
        }
    }
    public void m1() throws MyException{
        throw new MyException();
    }
    public void m2() throws RuntimeException{
        throw new NullPointerException();
    }
}
/*
The catch block is throwing a checked exception (i.e. non-RuntimeException)
which must be handled by either a try catch block or declared in the throws clause of the enclosing method.
Note that finally is also throwing an exception here, but it is a RuntimeException so there is no need to handle it
 or declare it in the throws clause.
 */
