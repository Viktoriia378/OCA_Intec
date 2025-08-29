package bonusTest1;

public class Q33 {
    private int i = 6;
    private int j = i;
    public void A(){
        i = 5;
    }

    public static void main(String[] args) {
        Q33 a = new Q33();
        System.out.println(a.i + a.j);
    }
}
