package stringBuilderMethods;

public class InsertExample {
    public static void main(String[] args) {
        //StringBuilder insert(int offset, String str)
        //add char with index without changing

        StringBuilder sb = new StringBuilder("animals");
        sb.insert(7,"-");
        sb.insert(0, "-");
        sb.insert(4, "-");
        System.out.println(sb);

    }
}
