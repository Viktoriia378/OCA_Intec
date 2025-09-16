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

        //Выражение с операцией:

        final int numInt = 50;
        final int numInt2 = 70;

        byte c = numInt + numInt2; // OK: результат — константа 120, помещается в byte without final does not compile
        /*
        x и y — final, то есть их значения известны на этапе компиляции,
        x + y = 120 — compile-time constant,
        120 входит в диапазон byte → приведение не нужно.
         */

        /*
        Note that implict narrowing conversion (i.e. conversion without an explicit cast)
        does not apply to float, long, or double.
        For example, char ch = 30L;
        will fail to compile although 30 is small enough to fit into a char.
         */
    }
}
