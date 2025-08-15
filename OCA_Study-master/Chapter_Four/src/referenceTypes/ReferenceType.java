package referenceTypes;

public class ReferenceType {
    public void fly(String s){
        System.out.println("string ");
    }
    public void fly(Object o){
        System.out.println("object ");
    }

    public static void main(String[] args) {
        ReferenceType t = new ReferenceType();
        t.fly("test");
        t.fly(56);
    }
}
