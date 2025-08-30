package bookTests.javaDataTypes;

public class Q13 {
    public int available = 0;
    public int getAvailable(){
        return available;
    }
    public Q13(int quota){
        this.available = quota;
    }
    public void addMore(int more){
        available += more;
    }

    public static void main(String[] args) {
        Q13 bw = new Q13(100);
        //bw.available = 0;
        bw.addMore(-bw.getAvailable());
        System.out.println(bw.getAvailable());

    }

}
