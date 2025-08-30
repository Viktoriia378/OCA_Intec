package bookTests.javaDataTypes;

public class Q3 {
    public static void main(String[] args) {
        boolean bo = Boolean.parseBoolean(" true "); //bcs of species false
        //Возвращает объект Boolean, а не примитив.
        Boolean bo2 = Boolean.valueOf(true); // Boolean.TRUE
        Boolean bo3 = Boolean.valueOf("trUE");
        System.out.println(bo);

        //Возвращает примитив boolean, не объект Boolean.
        boolean b1 = Boolean.parseBoolean("true");  // true
        boolean b2 = Boolean.parseBoolean("TRUE");  // true
        boolean b3 = Boolean.parseBoolean("TrUe");  // true
        boolean b4 = Boolean.parseBoolean(" false "); // false (!!)
        boolean b5 = Boolean.parseBoolean("yes");  // false
    }
}
