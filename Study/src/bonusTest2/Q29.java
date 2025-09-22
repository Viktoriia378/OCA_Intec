package bonusTest2;

public class Q29 {
    public static void main(String[] args) {
        String ref = null;
        try{
            System.out.println(ref.toString());
            System.out.println("a");
        } catch(RuntimeException e){
            System.out.println("b");
        } finally{
            System.out.println("c");
        }
        System.out.println("d");
    }
}
