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
