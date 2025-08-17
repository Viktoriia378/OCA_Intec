package creatingImmutableClasses;
//omit the setters for immutable class
public class Example {
    private int num;
    public Example(int num){
        this.num = num;
    }
    public  int getNum(){
        return num;
    }
}
