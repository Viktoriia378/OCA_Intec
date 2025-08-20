package studyWithChatty.chapter3;

public class Sb2 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Code");
        sb.append(" Review").delete(0, 1).insert(0, 'c');
        System.out.println(sb);
    }
}
