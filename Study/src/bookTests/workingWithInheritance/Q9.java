package bookTests.workingWithInheritance;

import java.io.*;
import java.sql.SQLException;

public class Q9 {
    public void doStuff() throws IOException{
    }
}

class Amazing extends Q9 {
    public void doStuff() throws FileNotFoundException{
    }
}

class TestClass {
    public static void main(String[] args) throws Exception {
        Q9 g = new Amazing();
        g.doStuff();
    }
}