package studyWithABook.javaBasics;
import java.io.*;
public class Q12 {
    int a;
    public void m1(){
        //private int b = 0;
        //a = b; Access modifiers (public/private/protected) are valid only inside the scope of a class, not of a method.
    }
    public static void main(String[] args){
        System.out.println(new Q12().main);
    }
    int main;
}
class A{
    public static void main() throws IOException{ }
}
/*
You can have a main method that doesn't take String[] as an argument.
It will not make the class executable from the command line though
 */
