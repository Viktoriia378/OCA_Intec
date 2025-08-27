package errors;

public class Info extends Error{
    public Info(String msg){
        super(msg);
    }
    static class ErrorThrower{
        public void doSomething() throws Info{
            throw new Info("Somethong wrong");
        }
        public static void main(String[] args) {
            ErrorThrower errorThrower = new ErrorThrower();
            try{
                errorThrower.doSomething();
            }catch(Info e){
                System.out.println("Got error: " + e.getMessage());
            }
        }
    }
}
 /*
    Errors extend the Error class.
    They are thrown by the JVM and should not be handled or declared.
     ExceptionInInitializerError-Thrown by the JVM
     StackOverflowError-Thrown by the JVM
     NoClassDefFoundError-Thrown by the JVM
     */
//You can declare any subclass of Error in the throws part of a method declaration.
/*
Хотя ты можешь объявить throws MyCustomError, компилятор не требует это делать,
потому что Error — это unchecked (так же, как RuntimeException).
Ловить Error в catch тоже возможно, но обычно это плохая практика,
если только ты не пишешь низкоуровневый код, например, JVM-инструменты.
 */