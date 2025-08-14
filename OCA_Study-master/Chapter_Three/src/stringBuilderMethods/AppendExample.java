package stringBuilderMethods;

public class AppendExample {
    public static void main(String[] args) {
        //StringBuilder append(String str)

        StringBuilder sb= new StringBuilder().append(1).append('c');
        sb.append("-").append(true);
        System.out.println(sb); //1c-true
    }
}
