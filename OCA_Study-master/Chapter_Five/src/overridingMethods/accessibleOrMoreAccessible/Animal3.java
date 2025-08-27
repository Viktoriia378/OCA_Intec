package overridingMethods.accessibleOrMoreAccessible;
//Метод в подклассе должен быть не менее доступен, чем в суперклассе
public class Animal3 {
    protected void speak(){
        System.out.println("Speak");
    }
}
