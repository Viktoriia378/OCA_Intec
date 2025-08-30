package bookTests.constrMethodsEncap;

public class Q1 {
    void m1(){
        Q1.m2();  // 1
        m4();             // 2
        //Q1.m3();  // 3
    }

    static void m2(){ }  // 4

    void m3(){
        m1();            // 5
        m2();            // 6
        //Q1.m1(); // 7
    }

    static void m4(){ }
}
