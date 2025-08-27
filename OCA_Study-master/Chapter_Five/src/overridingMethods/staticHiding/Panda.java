package overridingMethods.staticHiding;

public class Panda extends Bear{
    public static void eat(){
        System.out.println("Panda bear is chewing"); //hiding
    }
    //public void sneeze(){ System.out.println("Panda bear sneezes quietly");}
    //does not compile bcs method of parent is static
    //public static void hibernate(){} does not compile bcs we change it to static, but we have to override it
}
