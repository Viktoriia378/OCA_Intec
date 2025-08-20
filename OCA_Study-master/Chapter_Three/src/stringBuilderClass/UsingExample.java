package stringBuilderClass;

public class UsingExample {
    public static void main(String[] args) {
        StringBuilder altha = new StringBuilder();
        for(char current = 'a'; current <='z'; current++)
            altha.append(current);
        System.out.println(altha);

        StringBuilder sb = new StringBuilder("start");
        sb.append("+middle"); // sb = "start+middle"
        StringBuilder same = sb.append("+end"); // "start+middle+end"
        // sb and same have the same reference and point to the same object
        StringBuilder a = new StringBuilder("abc");
        StringBuilder b = a.append("de");
        b = b.append("f").append("g");
        System.out.println("a=" + a);
        System.out.println("b=" + b);

        StringBuilder sb1 = new StringBuilder("Exam");
        System.out.println(sb1.substring(1, 3));
        System.out.println(sb1);
    }
}
