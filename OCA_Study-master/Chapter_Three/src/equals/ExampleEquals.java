package equals;

public class ExampleEquals {
    public static void main(String[] args) {
        String x = new String("Hello World");
        String yy = "Hello World";
        String y = "Hello World";
        System.out.println(x==y);
        System.out.println(y==yy);
        System.out.println(x.equals(y));

        String x1 = "Hello World";
        String z1 = " Hello World".trim();
        System.out.println(x1==z1);

        String x2 = "Hello World";
        String z2 = " Hello World".trim();
        System.out.println(x2.equals(z2));

        Integer num = 128;
        int num2 = 128; //Integer num2 = 128; false
        System.out.println(num == num2);
        Double z = 10.0;
        double zk = 10.0; //Double zk = 10.0; false
        System.out.println(z == zk);
    }
}
