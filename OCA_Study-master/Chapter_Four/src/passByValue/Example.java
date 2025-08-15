package passByValue;

public class Example {
    public static void main(String[] args) {
        int number = 1;
        String txt = "abc";
        number(number);
        txt = txt(txt);
        System.out.println(number + txt);
    }
    public static int number(int number){
        number++;
        return  number;
    }
    public static String txt(String txt){
        txt += "d";
        return txt;
    }
}
