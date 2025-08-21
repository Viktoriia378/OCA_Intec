package passByValue;
//assignments made in the method do not affect the caller
public class Number {
    public static void newNum(int num ){
        num = 8;
        System.out.println(num);
    }
    public static void speak(String name){
        name = "Sparky";
    }
    public static void main(String[] args) {
        int num = 4;
        newNum(5);
        System.out.println(num);
        String name = "Zuzmi";
        speak(name);
        System.out.println(name);
    }
}
