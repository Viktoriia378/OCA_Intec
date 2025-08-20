package studyWithChatty.chapter3;

public class WrapperTest {
    public static void main(String[] args) {
        int i = 10;
        Integer i1 = i; // autoboxing -> Integer.valueOf(10), uses cache
        //Integer i2 = new Integer(10); in java 8 compiles;  creates a new Integer object (not cached)
        //System.out.println(i1 == i2);

        Integer i2 = null;
        int x = i2;
        System.out.println(x);
    }
}
