package bonusTest1;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Q9 {
    public void hop(){}
    public void ohNo() throws RuntimeException{}
}
class Kangaroo extends Q9{
    //public void hop() {}
    public void hop()throws IllegalArgumentException{}//only unchecked
    public void hop(String b)throws IOException{} //for overloading it is okay add checked exception
    public void ohNo() throws ArithmeticException{}
}
