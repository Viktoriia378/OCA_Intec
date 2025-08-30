package bookTests.usingLoopConstructs;

public class Q2 {
    void crazyLoop(){
        int c = 0;
        JACK: while (c < 8){
            JILL: System.out.println(c);
            //if (c > 3) break JILL; else c++;
        }
    }
}
