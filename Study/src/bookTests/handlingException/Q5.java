package bookTests.handlingException;

public class Q5 {
    public static void main(String[] args) throws Exception{
        try{
            amethod();
            System.out.println("try ");
        }
        catch(Exception e){
            System.out.print("catch ");
        }
        finally   {
            System.out.print("finally ");
        }
        System.out.print("out ");
    }
    public static void amethod(){ }
}//Since the method amethod() does not throw any exception, try is printed and the control goes to finally which prints finally. After that out is printed.
