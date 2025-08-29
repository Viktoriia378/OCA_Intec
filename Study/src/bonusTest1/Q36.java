package bonusTest1;

import java.io.IOException;

public class Q36 {
    public static void eat() throws IOException{
        try{
            System.out.println("1");
            throw new IOException();
        }catch(IOException e){
            System.out.println("2");
            throw e;
        }finally {
            System.out.println("3");
        }
    }

    public static void main(String[] args) {
        //eat(); не обернул этот вызов в try-catch, и не написал throws IOException у main.
        System.out.println("4");
        /*
        IOException — это checked exception.
Java требует либо обработать checked exception, либо объявить его с помощью throws.
Это часть механизма безопасности компилятора.
         */
    }
}
