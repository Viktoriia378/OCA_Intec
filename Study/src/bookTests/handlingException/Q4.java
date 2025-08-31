package bookTests.handlingException;

public class Q4 {
    public static void main(String args[]){
        try{
            RuntimeException re = null;
            throw re;
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
/*
The program will compile without error and will print java.lang.NullPointerException when run.
A NullPointerException will be thrown if the expression given to the throw statement results in a null pointer.
 */
