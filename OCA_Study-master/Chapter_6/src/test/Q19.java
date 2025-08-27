package test;

public class Q19 {
    public static void main(String[] args) {
        try{
            System.out.println("work real hard");
        }catch (StackOverflowError e){

        }catch (RuntimeException e){

        }
    }
}
/*
Ты можешь добавить в catch любой тип, который является подклассом Throwable,
потому что именно объекты Throwable (или его подклассов)
могут быть брошены (throw) и пойманы (catch).
 */
