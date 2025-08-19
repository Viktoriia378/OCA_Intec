package classBuilding.reference_premitive;

public class Example1 {
    public static void main(String[] args) {
        String ref = "Hello";
        int length = ref.length();

        System.out.println(length);

        boolean flag = false;
        if (!flag) {
            System.out.println("Flag is false");
        } else {
            System.out.println("Flag is true");
        }

        boolean a = true;
        boolean b = false;
        System.out.println(a || b && !a); //

    }
}
