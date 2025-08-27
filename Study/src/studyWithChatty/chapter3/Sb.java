package studyWithChatty.chapter3;

public class Sb {
    public static void main(String[] args) {
        //StringBuilder does not override equals and hashset like String
        //not thread-safe but StringBuffer is thread-safe
        StringBuilder sb1 = new StringBuilder("java");
        StringBuilder sb2 = new StringBuilder("java");
        StringBuilder sb3 = sb2;
        sb2.append(1);
        System.out.println(sb2);
        System.out.println(sb3);
        System.out.println(sb3 == sb2);
        System.out.println(sb1.toString().equals(sb2.toString()));

        String a = new String("Hello"); // heap
        String b = "Hello";             // string pool
        String c = a;// points to pool version
        String d = "Hello";
        System.out.println(a == c);
        System.out.println(b == c);
        System.out.println(b==d);

    }
}
