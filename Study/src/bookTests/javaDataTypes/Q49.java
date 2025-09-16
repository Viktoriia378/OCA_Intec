package bookTests.javaDataTypes;

public class Q49 {
    static Q49 ref;
    String[] arguments = {"bee", "bebe"};
    public static void main(String args[]){
        ref = new Q49();
        ref.func(args);
    }
    public void func(String[] args){
        ref.arguments = args;
    }
}
