package stringBuilderMethods;

public class DeleteAndDeleteCharAt {
    public static void main(String[] args) {
        //StringBuilder delete(int start, int end)
        //StringBuilder deleteCharAt(int index)

        StringBuilder sb = new StringBuilder("abcdef");
        sb.delete(1,3); //adef
        //sb.deleteCharAt(5); // exception bcs now we have index 4

    }
}
