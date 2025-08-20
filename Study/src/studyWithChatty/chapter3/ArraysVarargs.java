package studyWithChatty.chapter3;

public class ArraysVarargs {
    public static void printLength(String... args) {
        System.out.println(args.length);
    }
    public static void main(String[] args) {
        printLength(); //0
        printLength(null); //nullPointer
        printLength("one", null);//never reached
    }
}
