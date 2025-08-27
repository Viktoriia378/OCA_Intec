package overridingMethods.theSameSignature;

public class Cat extends Dier{
    void speak(){ //void speak(String sound) {  // другая сигнатура (overload)
        System.out.println("meow meow");
    }
}
