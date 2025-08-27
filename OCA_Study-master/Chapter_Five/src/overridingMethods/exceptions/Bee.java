package overridingMethods.exceptions;

import java.io.IOException;

//Переопределенный метод не может выбрасывать новые или более широкие checked исключения
public class Bee {
    void honey() throws IOException{
        System.out.println("I have honey");
    }
}
