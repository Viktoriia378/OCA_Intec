package questions;

public class Q118 {
    int ns;
    static int s;
    Q118(int ns){
        if(s<ns){
            s=ns;
            this.ns=ns;
        }
    }
    void doPrint(){
        System.out.println("ns "+ns+" "+ " s "+s);
    }
    public static void main(String[] args) {
        Q118 ref1= new Q118(50);

        Q118 ref2= new Q118(100);
        Q118 ref3= new Q118(125);

        ref1.doPrint();
        ref2.doPrint();
        ref3.doPrint();
    }
}

