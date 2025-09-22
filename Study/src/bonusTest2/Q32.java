package bonusTest2;

public class Q32 {
    public static void main(String[] args) {
        StringBuilder s1 = new StringBuilder("meow");
        StringBuilder s2 = new StringBuilder("meow");
        if(s1 == s2) System.out.println("one");
        if(s1.equals(s2)) System.out.println("two");
        //if(s1 == "meow") System.out.println("three");
        if(s1.toString().intern() == "meow") System.out.println("four");
    }
}
