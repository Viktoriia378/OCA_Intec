package overridingMethods.redeclaringPrivateMethods;

public class Camel {
    private String getNum(){ //if we ll make it public or protected it ll not compile in subclass
        return "Undefined";
    }
}
