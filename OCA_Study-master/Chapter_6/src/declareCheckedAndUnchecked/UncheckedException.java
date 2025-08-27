package declareCheckedAndUnchecked;
//unchecked - Не требуют обязательной обработки try-catch или объявления throws
//Компилятор не заставляет тебя с ними работать — но ты можешь, если хочешь.
public class UncheckedException extends RuntimeException{
    public UncheckedException(String message) {
        super(message);
}}
class UserValidator{
    public void validAge(int age){
        if(age < 18){
            throw new UncheckedException("age has to be 18 or more");
        }
        System.out.println("Your age is valid: " + age);
    }

    public static void main(String[] args) {
        UserValidator validator = new UserValidator();
        // Можно обернуть в try-catch, но не обязательно
        //validator.validAge(16);
        try {
            validator.validAge(16);
        } catch (UncheckedException e) {
            System.out.println("Faut: " + e.getMessage());
        }
    }
}
/*
Наследуются от класса RuntimeException (в отличие от checked, которые от
Exception, но не RuntimeException).
ArithmeticException-Thrown by the JVM
ArrayIndexOutOfBoundsException-Thrown by the JVM
ClassCastException-Thrown by the JVM
NullPointerException-Thrown by the JVM
IllegalArgumentException-Thrown by the programmer
NumberFormatException-Thrown by the programmer
 */