package passByValue;

public class StrBuilding {
    public static void speak(StringBuilder s){
        s.append("Webby");
    }

    public static void main(String[] args) {
        StringBuilder name = new StringBuilder();
        speak(name);
        System.out.println(name);
    }
}
