package studyWithABook.lambdaStringArrayListDateTime;

public class Q5 {
    public static void main(String args[]){
        String blank  = " ";  // one space
        String line = blank + "hello" + blank + blank;
        line.concat("world");
        String newLine  =  line.trim();
        System.out.println((int)(line.length() + newLine.length()));

    }
}
