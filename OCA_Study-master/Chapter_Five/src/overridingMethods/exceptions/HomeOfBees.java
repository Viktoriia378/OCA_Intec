package overridingMethods.exceptions;
import java.io.FileNotFoundException;
public class HomeOfBees extends Bee{
    @Override
    void honey() throws FileNotFoundException { //OK: подтип IOException
        System.out.println("new honey");
    }
    //void speak() throws Exception { // ❌ Ошибка: Exception шире, чем IOException
}
