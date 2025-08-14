package test;

public class Vraag10 {
    public static void main(String[] args) {
        String a = "";
        a += 2;
        String b = "a" + true + 1;
        a += 'c';
        a += false;
        if (a == "2cfalse") System.out.println("==");
        if (a.equals("2cfalse")) System.out.println("equals");
        System.out.println(b);
    }
}
