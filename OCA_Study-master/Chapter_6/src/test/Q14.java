package test;

import java.io.IOException;

public class Q14 {
    public void ohNo() throws IOException {
        //System.out.println("it is ok");
        //throw new IllegalArgumentException();
        //throw new java.io.IOException();
        throw new RuntimeException();
        //throw new Exception();
        /*
        это checked exception, и компилятор требует:
Либо объявил его в throws сигнатуре метода:
public void myMethod() throws Exception {
    throw new Exception();
}
Либо обернул в try-catch:

public void myMethod() {
    try {
        throw new Exception();
    } catch (Exception e) {
        System.out.println("Поймано исключение");
    }
}
         */
    }
    public void be() throws Exception{
        //throw new Exception();
        throw new RuntimeException();
    }
}
