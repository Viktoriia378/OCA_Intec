package exceptionLikeReturnType;
/*
Which scenario is the best use of an exception?
An unexpected parameter is passed into a method.
 */
public class ExceptionFactory {
    // Метод возвращает объект Exception, а не выбрасывает его
    public Exception createException(String message) {
        return new Exception(message);
    }

    public static void main(String[] args) {
        ExceptionFactory factory = new ExceptionFactory();
        Exception ex = factory.createException(" It is just a object");

        System.out.println("Creating exception" + ex.getMessage());

        try{
            throw ex;
        }catch(Exception e){
            System.out.println("Got exception: " + e.getMessage());
        }
    }
    /*
    throws Exception - говорит, что метод может выбросить Exception
    Exception createException() - говорит, что метод возвращает объект Exception
     */

}
