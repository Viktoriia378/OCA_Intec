package operatorsAndStatements.castingPrimitiveValues;

public class ChangeForCompile {
    public static void main(String[] args) {
        int x = (int) 1.0;
        System.out.println(x);

        short y = (short) 155464;
        System.out.println(y);

        int z = (int)9f;
        System.out.println(z);

        short num = 10;
        short num2 = 3;
        short res = (short)(num * num2);

        long x1 = 10;
        int y1 = 2 * (int)x1;
        System.out.println(y1);

        byte a = 40, b = 50;
        byte sum = (byte) (a + b);
        System.out.println(sum);

    }
}
