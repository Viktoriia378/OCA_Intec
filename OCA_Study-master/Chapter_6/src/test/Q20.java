package test;

public class Q20 {
    public static void main(String[] args) {
        System.out.println("a");
        try{
            System.out.println("b");
            throw new IllegalArgumentException();
        }catch (IllegalArgumentException e){ //already got exception
            System.out.println("c");
            throw new RuntimeException("1");
        }catch (RuntimeException e){ //ignore
            System.out.println("d");
            throw new RuntimeException("2");
        } finally {
            System.out.println("e");
            throw new RuntimeException("3");
        }
    }
}
