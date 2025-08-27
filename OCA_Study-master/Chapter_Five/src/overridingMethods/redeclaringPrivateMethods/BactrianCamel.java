package overridingMethods.redeclaringPrivateMethods;

public class BactrianCamel extends Camel{
    private String getNum(){ //new method and not an override
        return "5";
    }
}
