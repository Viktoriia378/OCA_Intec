package studyWithABook.javaBasics;

public class Q9 {
    public static long main(String[] args){
        System.out.println("Hello");
        return 10L;
    }
}
/*
When the program is run, the JVM looks for a method named main() which takes an array of Strings as input and returns nothing (i.e. the return type is void).
But in this case, it doesn't find such a method ( the given main() method is returning long!) so it gives out the following message:
 */
