package overridingMethods.accessibleOrMoreAccessible;

public class Dog extends Animal3{
    public void speak(){
        System.out.println("wofwof"); // void speak() {  // Меньшая доступность → ❌ Ошибка
    }
}
