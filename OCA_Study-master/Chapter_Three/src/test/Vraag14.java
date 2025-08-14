package test;

public class Vraag14 {
    public static void main(String[] args) {
        StringBuilder string = new StringBuilder("Java");
        string.append("vaJ$").delete(0,3).deleteCharAt(string.length() - 1);
        System.out.println(string);

    }
}
