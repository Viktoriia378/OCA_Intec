package studyWithChatty.chapter3;

public class Sb {
    public static void main(String[] args) {
        //StringBuilder does not override equals and hashset like String
        //not thread-safe but StringBuffer is thread-safe
        StringBuilder sb1 = new StringBuilder("java");
        StringBuilder sb2 = new StringBuilder("java");
        System.out.println(sb1 == sb2);
        System.out.println(sb1.toString().equals(sb2.toString()));
    }
}
